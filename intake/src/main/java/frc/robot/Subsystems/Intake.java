package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;

public class Intake extends frc.robot.Subsystems {

    CANSparkMax armSpark;
    CANSparkMax suckSpark;

    public intake() {
        this.armSpark = new CANSparkMax(1,kBrushless);
        this.suckSpzark = new CANSparkMax(2,kBrushless);
    }

    public void setArmSpeed(double speed) {
        armSpark.set(speed);
    }

    public void setSuckSpeed(double speed) {
        suckSpark.set(speed);
    }


}