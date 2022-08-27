package frc.robot;

public final class Constants {

    public static final class DriveConstants {
        public static final double kDriveAlpha = 0.11765;
        public static final double kDriveOneMinusAlpha = 0.88235;

        public static final int kRightMasterTalonID = 16;
        public static final int kRightSlaveBTalonID = 17;
        public static final int kRightSlaveTTalonID = 18; //new
        public static final int kLeftMasterTalonID = 31;
        public static final int kLeftSlaveBTalonID = 30;
        public static final int kLeftSlaveTTalonID = 29; //new

        public static final int kHooksMasterTalonID = 20; //new
        public static final int kHooksSlaveTalonID = 27; //new
        
        // public static final int kEverybotArm = 15;
        // public static final int kEverybotIntake = 14;

        public static final int kDriveShifterForwardID = 0;
        public static final int kDriveShifterReverseID = 7;
        public static final int kClimberPistonForwardID = 2;
        public static final int kClimberPistonReverseID = 3;
        public static final int kHookPistonForwardID = 1;
        public static final int kHookPistonReverseID = 6;
    }

    public static final class EverybotConstants {
        public static final double kHighAngle = -20073.00;
        public static final double kLowAngle = 0;
        public static final double kGravityAngle = -19500.00;
        public static final double kHighAngleThreshold = 0;
        public static final double kLowAngleThreshold = 0;

        public static final double kEverybotUpVoltage = 0.7;
        public static final double kEverybotDownVoltage = 0.2;
    
        public static final double kEverybotIntake = 0.5;
        public static final double kEverybotOuttake = 0.6;
        public static final double kEverybotAutoOuttake = 1.0;
    
        public static final double kEverybotClimberUp = 0.2;
        public static final double kEverybotClimberDown = 0.5;
        public static final double kEverybotClimberHigh = 0;
        public static final double kEverybotClimberLow = 0;
        
        public static final double kEverybotClimberkP = 0.02; //0.01
        public static final double kEverybotClimberkI = 0;
        public static final double kEverybotClimberkD = 0;
        public static final double kEverybotClimberkF = 0.094;
        
        public static final double kTicksToLowRung = 17826; //-102862 // 32645;
        public static final double kTicksToClimbLowRung = 41525 + 4000  - kTicksToLowRung;
        public static final double kTicksToHome = 43757;
    }
    
    public static final class ClimberConstants {
        public static final int kArmTalonID = 28;
        public static final int kElevatorTalonID = 19;

        public static final double kArmkP = 2.0; //0.5
        public static final double kArmkI = 0;
        public static final double kArmkD = 0.6; //0.6 
        public static final double kArmkF = 2.82; // 2.82

        public static final double kArmGravityFF = 0.36; //0.11 voltage calc, 0.41 phys calc

        public static final double kArmStaticFF = 0.0;

        public static final double kArmCruiseVelocity = 1650;
        public static final double kArmMotionAcceleration = 1650;
        public static final double kArmMaxVelocity = 3300;
        public static final double kArmMaxAcceleration = 3300;
        public static final double kArmDeadband = 0.004;
        public static final double kArmStaticFrictionDeadband = 5.0;

        public static final double kArmAngleOffset = 42;
        public static final double kArmAngleLength = 1.0 / 4096 * 360 * 29;

        public static final double kElevatorkP = 0.5; //0.5
        public static final double kElevatorkI = 0;
        public static final double kElevatorkD = 0.0002; //0.6 
        public static final double kElevatorFF = 0; // 2.82

        public static final double kElevatorCruiseVelocity = 250;
        public static final double kElevatorMotionAcceleration = 125;
        public static final double kElevatorMaxVelocity = 575;
        public static final double kElevatorMaxAcceleration = 575;
        public static final double kElevatorDeadband = 0.004;
        public static final double kElevatorStaticFrictionDeadband = 5.0;

        public static final double kTicksToRungAngle = 200; //Actual ticks 620, not resetting encoder position properly
        public static final double kTicksToClearRung = 250;
        public static final double kTicksToVertical = 60;
        public static final double kArmTicksDownSoftLimit = 330;
        public static final double kArmTicksUpSoftLimit = 0;
        public static final double kElevatorTicksUp = 280000;
        public static final double kElevatorTicksExtend = 280000;
        public static final double kElevatorTicksDown = 1620;

        public static final double kSoftLimitTicks = 20000;

        public static final double kOperatorDeadband = 0.007874;
        public static final double kOperatorAlpha = 0.11765;
        public static final double kOperatorOneMinusAlpha = 0.88235;

        public static final double kDriverDebounce = 0.1;
        public static final double kOperatorDebounce = 0.25;
    }
}
