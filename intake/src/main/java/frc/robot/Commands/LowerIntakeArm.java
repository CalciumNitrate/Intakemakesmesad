package frc.robot.Commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Subsystems.intake;

public class LowerIntakeArm extends Command{
    public final double speed = 0.9;
    
    @Override
    public void initialize(){
    }

    @Override
    public void execute(){
        intake.setArmSpeed(speed);
    }

    @Override
    public boolean isFinished(){
        return true;
    }

    @Override
    public void end(){
        intake.setArmSpeed(0);
    }
}