package frc.robot.Commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.Subsystems.intake;

public class IntakeBalls extends Command {
    
    private final double speed = 0.5;

    @Override
    public void execute() {
        Subsystem.intake.setSuckSpeed(speed);
    }
    @Override
    public boolean isFinished(){
        return true;
    }
    
}
