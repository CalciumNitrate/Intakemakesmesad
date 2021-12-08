package frc.robot;
import frc.robot.Commands;
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
    public void end(){ }
}