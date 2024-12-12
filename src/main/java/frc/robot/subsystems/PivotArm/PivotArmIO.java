//An interface is an empty class that has all the methods but those methods don't have functions
public interface PivotArmIO {
    public static class PivotArmIOinputs {
        public double angleRads = 0.0; //Change Later
        public double anglevelocityRadsPerSecond = 0.0; //Change Later
        public double voltage = 0.0;  //Change Later
        public double setpointAngleRads = 0.0; //Change Later

    }
    public default double getAngleRads() {
        return 0.0;
    }
    public default double getAnglevelocityRadsPerSecond() {
        return 0.0;
    }
    public default double getVoltage() {
        return 0.0;
    }
    public default double getSetpointAngleRads() {
        return 0.0;
    }
    public default void setVoltage (double volts) {
    }


}
