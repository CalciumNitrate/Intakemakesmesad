package frc.robot;
import frc.robot.Commands;

public class StopLoweringArm extends frc.robot.Commands {

    public StopLoweringArm() {}

    @Override
    public void execute() {
        intake.setArmSpeed(0);
    }
    
}