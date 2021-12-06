package frc.robot;
import frc.robot.Commands;
import frc.robot.Subsystems.intake;

public class IntakeBalls extends frc.robot.Commands {
    
    private final double speed = 0.5;

    public IntakeBalls() {}

    @Override
    public void execute() {
        robot.intake.setSuckSpeed(speed);
    }
    
}
