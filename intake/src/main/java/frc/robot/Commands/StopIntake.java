package frc.robot;
import frc.robot.Commands;
import frc.robot.Subsystems.intake;

public class StopIntake extends frc.robot.Commands {

    public StopIntake() {}

    @Override
    public void execute() {
        robot.intake.setSuckSpeed(0);
    }

    @Override
    public boolean isFinished() {
        return true;
    }
    
}