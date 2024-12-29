package frc.robot.subsystems.PivotArm;

import PivotArm.PivotArmConstanst;

public class PivotArmIOSparkMax {
    private CANSparkMax pivotMotor;
    private RelativeEncoder pivotEncoder;
    
    public PivotArmIOSparkMax() {
        pivotMotor = new CANSparkMax(PivotArmConstanst.id, MotorType.kBrushless)
        pivotEncoder = new RelativeEncoder()

        pivotMotor.restoreFactoryDefaults();

    }



}
 