package frc.robot;
import frc.robot.Commands;
import frc.robot.Subsystems.intake;

public class StopLoweringArm extends frc.robot.Commands {

    public StopLoweringArm() {}

    @Override
    public void execute() {
        robot.intake.setArmSpeed(0);
    }

    @Override
    public boolean isFinished() {
        return true;
    }
    
}