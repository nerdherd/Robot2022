package frc.robot.subsystems.shooter;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.NerdyMath;
import frc.robot.Constants.TurretConstants;
import frc.robot.commands.TurnToTarget;

public class Turret extends SubsystemBase {
    
    private TalonFX frontFlywheelFalcon;
    private TalonFX backFlywheelFalcon;
    private TalonSRX hoodMotor;
    private TalonSRX baseMotor;

    private TurnToTarget turnToTargetCommand;

    private double hoodLimitLower, hoodLimitUpper;

    public Turret() {
        this.frontFlywheelFalcon = new TalonFX(TurretConstants.kFrontFlywheelFalconID);
        this.backFlywheelFalcon = new TalonFX(TurretConstants.kBackFlywheelFalconID);
        this.hoodMotor = new TalonSRX(TurretConstants.kHoodMotorID);
        this.baseMotor = new TalonSRX(TurretConstants.kBaseMotorID);

        this.hoodMotor.setSelectedSensorPosition(0);
        hoodLimitLower = NerdyMath.ticksToAngle(TurretConstants.kHoodLowerLimitTicks);
        hoodLimitUpper = NerdyMath.ticksToAngle(TurretConstants.kHoodUpperLimitTicks);
    }

    public void setTurnToTargetCommand(TurnToTarget command) {
        this.turnToTargetCommand = command;
        setDefaultCommand(this.turnToTargetCommand);
    }

    public void toggleHood() {
        this.turnToTargetCommand.toggleHood();
    }

    public void setVelocity(double velocity) {
        backFlywheelFalcon.set(ControlMode.Velocity, velocity);
        
        // Get front flywheel to spin at 1/4 the speed
        frontFlywheelFalcon.set(ControlMode.Velocity, velocity 
                                * (1/TurretConstants.kBackFlywheelGearRatio) 
                                * 0.25);
    }

    public void setVelocityZero() {
        setVelocity(0);
    }

    public void turnToBaseAngle(double angle) {
        double currentAngle = getCurrentBaseAngle();
        double offsetAngle = TurretConstants.kBaseTicksPerDegree * constrainAngleBase(angle);
        double targetAngle = currentAngle + offsetAngle;
        baseMotor.set(ControlMode.MotionMagic, targetAngle);
    }

    public double getCurrentBaseAngle() {
        return baseMotor.getSelectedSensorPosition() / TurretConstants.kBaseTicksPerDegree;
    }

    public double getCurrentHoodAngle() {
        return hoodMotor.getSelectedSensorPosition() / TurretConstants.kHoodTicksPerDegree;
    }

    public void turnToHoodAngle(double angle) {
        hoodMotor.set(
            ControlMode.MotionMagic, 
            TurretConstants.kHoodTicksPerDegree * 
            NerdyMath.clamp(angle, hoodLimitLower, hoodLimitUpper)
            );
    }

    private double constrainAngleBase(double rawAngle) {
        double newAngle = rawAngle % 360;
        if (newAngle < 0) {
            newAngle += 360;
        }

        return newAngle - 180;
    }

    public void reportToSmartDashboard() {
        SmartDashboard.putNumber("Hood Ticks", hoodMotor.getSelectedSensorPosition());
    }

}