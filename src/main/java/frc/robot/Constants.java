package frc.robot;

public final class Constants {

    public static final class DriveConstants {
        public static final double kDriveAlpha = 0.11765;
        public static final double kDriveOneMinusAlpha = 0.88235;

        // New falcons = PDP 12 and 14
        public static final int kRightMasterTalonID = 16;
        public static final int kLeftMasterTalonID = 30;
        public static final int kRightSlaveTalonID = 17;
        public static final int kLeftSlaveTalonID = 31;
        public static final int kRightSlaveTTalonID = 1; // 28
        public static final int kLeftSlaveTTalonID = 18; // 

        // public static final int kHooksMasterTalonID = 20; //new
        // public static final int kHooksSlaveTalonID = 27; //new

        // 3 and 4
        public static final int kDriveShifterForwardID = 0;
        public static final int kDriveShifterReverseID = 1;
        public static final int kClimberShifterForwardID = 2;
        public static final int kClimberShifterReverseID = 3;
        public static final int kHookShifterForwardID = 1;
        public static final int kHookShifterReverseID = 6;

        // ================ SHUFFLEBOARD ================

        public static final double kFalconMaxTicksPer100ms = 6380 * 4096 / 600.0;
        public static final double kFalconMaxCurrent = 257;

        // ================== AUTOS =====================
        public static final double kRamseteS = 0;
        public static final double kRamseteV = 0;
        public static final double kRamseteA = 0;
        public static final double kRamseteMaxVolts = 10;

        public static final double kDriveMaxVel = 2.0;
        public static final double kDriveMaxAccel = 1.0;

        public static final double kMaxCentripetalAcceleration = 2.1;

        public static final double kLeftP = 0;
        public static final double kLeftI = 0;
        public static final double kLeftD = 0;
        public static final double kRightP = 0;
        public static final double kRightI = 0;
        public static final double kRightD = 0;

        public static final double kTrackWidth = 0.68;

        public static final double kTicksPerFoot = 0;
        // ==============================================

    }
    
    public static final class ClimberConstants {
        public static final int kClimberLeftID = 25;
        public static final int kClimberRightID = 19;

        public static final double kP = 0;
        public static final double kI = 0;
        public static final double kD = 0; 

        public static final double kCruiseVelocity = 250;
        public static final double kMotionAcceleration = 125;

        public static final double kClimberDeadband = 0.05;
        public static final double kF = 0.02;
        public static final double kJoystickMultiplier = 1;
        public static final double kMaxTicks = 0;
        public static final double kMinTicks = 0;

        public static final double kLeftPos1 = 0;
        public static final double kLeftPos2 = 0;
        public static final double kRightPos1 = 0;
        public static final double kRightPos2 = 0;

    }

    public static final class FlywheelConstants {
        public static final double kMotionMagicCruiseVelocity = 10888.53;
        public static final double kMotionMagicAcceleration = 10888.53;
        public static final double kFlywheelP = 0;
        public static final double kFlywheelI = 0;
        public static final double kFlywheelD = 0;
        public static final double kFlywheelFF = 0.05;
        public static final double kFeederP = 0;
        public static final double kFeederI = 0;
        public static final double kFeederD = 0;
        public static final double kFeederFF = 0;
        public static final int kFlywheelID = 3;
        public static final int kFeederID = 36;
        // public static final int kRightFlywheelID = 35;
        // public static final int kLeftFlywheelID = 34;
        public static final double kFlywheelVelocity = 0;
        public static final double kFlywheelPercent = 0.55; 

        // Determined by trying various percentages with measured robot distance from hub
        // public static final double kFlywheelInnerTarmacPercent = 0.26;
        // public static final double kFlywheelOuterTarmacPercent = 0.29;

        public static final double kFlywheelTarmacPercent = 0.375; // when 11 inches away from middle of hub
        public static final double kFeederTarmacPercent = 0.4; // when 11 inches away from middle of hub

        public static final double kFlywheelTarmacTopVelocity = 0; // top tarmac top
        public static final double kFeederTarmacTopVelocity = 0;

        public static final double kFlywheelTarmacBottomVelocity = 0; // top tarmac bottom
        public static final double kFeederTarmacBottomVelocity = 0;
    }

    public static final class IndexerConstants {
        public static final int kIndexerTopID = 25;
        public static final int kIndexerBottomID = 21;
        public static final double kIndexerPercent = -0.80;
    }

    public static final class RollerConstants {
        public static final int kRollerID = 20;
        public static final double kRollerPercent = 0.9;
    }

    public static final class IntakeConstants{
        public static final int kIntakeID = 37;
        public static final int kRollerID = 20;

        public static final double kIntakeReadyPosition = 325; // When ready to intake
        // public static final double kIntakeOffset = 0;
        public static final double kIntakeStowPosition = -1942; // When ready to intake
        public static final double kIntakeHorizontal = 165; // MEASURE
        public static final double kIntakeGravityFF = 0.12; // Negative goes up, should invert 175
        public static final double kIntakeMotionAcceleration = 100; // 125
        public static final double kIntakeCruiseVelocity = 100; // 250
        public static final double kIntakeDeadband = 0.004;
        public static final double kIntakeP = 2.2; // 2
        public static final double kIntakeD = 0;
        public static final double kIntakeF = 0; // 2.8

        public static final double kRollerPercent = 0.9;
    }

    public static final class TurretConstants {
        public static final int kFrontFlywheelFalconID = 18; // this is actually not real
        public static final int kBackFlywheelFalconID = 3; // its like a fallacy or smth idk
        public static final int kHoodMotorID = 36;
        public static final int kBaseMotorID = 0;
        public static final int kFeederMotorID = 0;

        public static final double kfeederPercent = 0;

        public static final double kHoodF = 0.867;
        public static final double kHoodP = 0.1;
        public static final double kHoodD = 0.6;
        public static final double kHoodI = 0;

        public static final double kHoodCruiseVelocity = 100;
        public static final double kHoodAcceleration = 50;
        public static final double kHoodMaxVelocity = 200;
        public static final double kHoodMaxAccel = 100;
        public static final double kHoodDeadband = 0.07; // One Degree 

        public static final double kBaseP = 0;
        
        public static final double kBaseCruiseVelocity = 300;
        public static final double kBaseMotionAcceleration = 300;

        public static final double kBaseGearRatio = 234;
        public static final double kBackFlywheelGearRatio = 39 / 30.0;

        public static final double kBaseTicksPerDegree = 11.111;
        public static final double kHoodTicksPerDegree = 238.3;

        // NOTE: Hood angle is measured from hood axle to axle of upper flywheel
        public static final double kHoodLowerLimitTicks = 0; // Ticks when at 15 degrees should ideally be 25700 ticks, 0 ticks is parallel to ground
        public static final double kHoodUpperLimitTicks = 7648;

        public static final double kBaseLowerLimitTicks = 0;
        public static final double kBaseUpperLimitTicks = 0;

        public static final double kBaseTicksPer20ms = 10;

        public static final double kFlywheelInnerTarmacPercent = 0;
        public static final double kFlywheelOuterTarmacPercent = 0;
    }

    public static final class VisionConstants {
        public static final int kTargetHeight = 0;
        public static final int kCameraMountHeight = 0;
        public static final int kTargetWidth = 0;
        public static final int kXFocalLength_lime = 0;
        public static final double kCameraBumperOffset = 0;
    }

}
