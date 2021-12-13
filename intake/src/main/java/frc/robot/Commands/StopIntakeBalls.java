package frc.robot.Commands;

public class StopIntakeBalls {
    @Override
    public void execute() {
        Robot.intake.setSuckSpeed(0);
    }
    @Override
    public boolean isFinished(){
        return true;
    }
}
