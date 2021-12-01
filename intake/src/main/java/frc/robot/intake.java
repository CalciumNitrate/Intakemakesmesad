package frc.robot;

import com.revrobotics.CANSparkMax;

public class intake {
    public final double downspeed= 0.1;
    public final double intakespeed =  0.5;
    CANSparkMax armSpark = new CANSparkMax(1,kBrushless);
    CANSparkMax suckSpark = new CANSparkMax(2,kBrushless);
    public void downarm(){
        armSpark.set(downspeed);
    }
}