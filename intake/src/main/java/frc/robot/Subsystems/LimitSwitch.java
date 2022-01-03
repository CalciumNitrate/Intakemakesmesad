package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.DigitalInput;

public class LimitSwitch {
    DigitalInput limitswitch = new DigitalInput(0);
    if(limitswitch.get()){
        System.out.println("Robot on");

    }
    else 
        System.out.println("robot off");
    
}
