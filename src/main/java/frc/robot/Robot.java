// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

import frc.robot.subsystems.drive.Drivetrain;
import frc.robot.everybot.Everybot;
import frc.robot.logging.Log;

public class Robot extends TimedRobot {
  @Override
  public void robotInit() { 
    Drivetrain.setupDrivetrain();
    Everybot.setUpEverybot();

    Log.initAndLog("/home/lvuser/logs/", "Test", 0.02);
  }
  
  @Override
  public void teleopInit() { 
    Drivetrain.compressor.enableDigital();
  }

  @Override
  public void teleopPeriodic() { 
    Drivetrain.driveControllerMovement();
    Drivetrain.updateSmartDashboardForDrivetrain();

    Everybot.shooterControllerMovement();
  }

  @Override
  public void autonomousInit() {

  }

  @Override
  public void autonomousPeriodic() {
    Drivetrain.drive(-50, -50, 1);
  }
}