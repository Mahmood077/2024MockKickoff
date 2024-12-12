package frc.robot.subsystems.shooter;

import edu.wpi.first.units.Velocity;

public interface ShooterIO {

    public static class ShooterInputs{
        public double velocityMetersPerSec = 0.0; // Velocity of the elevator in meters per second
        public double appliedVolts = 0.0; // Voltage applied to the elevator
        public double[] currentAmps = new double[] {}; // Current flowing through each of the elevator motors
        public double[] tempCelsius = new double[] {}; // Temperature of each of the motors
        private enum State{

            SHOOTING,
            NEUTRAL,
            INTAKE
        }
    }
    
    public void updateInputs(){}

    public void setVelocity(velocity){}

    public void setAppliedVolts(volts){}

    public void setCurrentAmps(){}

    public void setTempCelsius(){}

    public void setState(){}

    public double getVelocity(){}

    public double getAppliedVolts(){}

    public double getCurrentAmps(){}

    public double getTempCelsius(){}
} 


