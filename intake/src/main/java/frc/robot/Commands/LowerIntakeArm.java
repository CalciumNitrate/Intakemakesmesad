package frc.robot;

import frc.robot.Commands;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Subsystems.intake;

public class LowerIntakeArm extends Command{
    public final double speed = 0.9;
    public LowerIntakeArm(){

    }
    @Override
    public void initialize(){
    }

    @Override
    public void execute(){
        robot.intake.setArmSpeed(speed);
    }

    @Override
    public boolean isFinished(){
        return true;
    }

    @Override
    public void end(){
<<<<<<< HEAD
    
=======
        robot.intake.setArmSpeed(0);
>>>>>>> 05e21bc5c7a29a3a37a401106dcc2e72f0b500ab
    }
}