package frc.robot.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Subsystems.intake;

public class IntakeBalls extends Command {
    
    private final double speed = 0.5;

    public IntakeBalls() {}

    @Override
    public void execute() {
        robot.intake.setSuckSpeed(speed);
    }
    @Override
    public boolean isFinished(){
        return true;
    }
    
}
