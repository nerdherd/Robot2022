package frc.robot;

public class Constants {
    public static final class ClimberConstants {
        public static final double kArmkP = 0.04;
        public static final double kArmkI = 0;
        public static final double kArmkD = 0;
        public static final double kArmkF = 0; 

        public static final double kArmStaticGain = 0.0;
        public static final double kArmGravityGain = 0.11;
        public static final double kArmVelocityGain = 0;

        public static final double kArmGravityFF = 0.11;
        public static final double kArmStaticFF = 0.0;

        public static final double kArmCruiseVelocity = 40;
        public static final double kArmMotionAcceleration = 20;
        public static final double kArmMaxVelocity = 54.0;
        public static final double kArmMaxAcceleration = 54.0;
        public static final double kArmDeadband = 0.0004;
        public static final double kArmStaticFrictionDeadband = 5.0;

        public static final double kArmAngleOffset = 60;
        public static final double kArmAngleLength = 1.0 / 4096 * 360 * 29;

        public static final double kTicksToRungAngle = -200; //Actual ticks 620, not resetting encoder position properly
        public static final double kTicksToVertical = -60;
    }
}
