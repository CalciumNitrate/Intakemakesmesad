package frc.robot;
import frc.robot.Commands;

public class StopIntake extends frc.robot.Commands {

    public StopIntake() {}

    @Override
    public void execute() {
        intake.setSuckSpeed(0);
    }
    
}