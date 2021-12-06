package frc.robot;
import frc.robot.Commands;
import edu.wpi.first.wpilibj.command.Command;


public class StopLoweringArm extends Command {

    public StopLoweringArm() {}

    @Override
    public void execute() {
        intake.setArmSpeed(0);
    }
    
    @Override
    public boolean isFinished(){
        return true;
    }
}