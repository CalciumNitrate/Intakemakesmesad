package frc.robot;
import frc.robot.Commands;
<<<<<<< HEAD
import edu.wpi.first.wpilibj.command.Command;


=======
import frc.robot.Subsystems.intake;

>>>>>>> 05e21bc5c7a29a3a37a401106dcc2e72f0b500ab
public class StopLoweringArm extends Command {

    public StopLoweringArm() {}

    @Override
    public void execute() {
        robot.intake.setArmSpeed(0);
    }

    @Override
    public boolean isFinished() {
        return true;
    }
    
    @Override
    public boolean isFinished(){
        return true;
    }
}