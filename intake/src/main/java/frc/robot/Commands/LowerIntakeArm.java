package frc.robot.Commands;


import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Subsystems.intake;

import static frc.robot.Subsystems.intake.

public class LowerIntakeArm extends Command{
    
    private final double SPEED = 0.9;
    
    @Override
    public void initialize(){
        setTimeout(0.1);
    }

    @Override
    public void execute(){
        intake.setArmSpeed(SPEED);
    }

    @Override
    public boolean isFinished(){
        return isTimedOut();
    }

    @Override
    public void end(){
        intake.setArmSpeed(0);
    }
}