package frc.robot;
import frc.robot.Commands;

public class IntakeBalls extends frc.robot.Commands {
    
    private final double speed = 0.5;

    public IntakeBalls() {}

    @Override
    public void execute() {
        intake.setSuckSpeed(speed);
    }
    
}
