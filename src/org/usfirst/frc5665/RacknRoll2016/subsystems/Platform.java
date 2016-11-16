package org.usfirst.frc5665.RacknRoll2016.subsystems;

import org.usfirst.frc5665.RacknRoll2016.RobotMap;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Platform extends Subsystem {
    
    public boolean isLocked = true;
    private final SpeedController lock = RobotMap.platformLock;
    private final SpeedController motorRight = RobotMap.platformMotorRight;
    private final SpeedController motorLeft = RobotMap.platformMotorLeft;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void unlock() {
        lock.set(1.0);
        isLocked = false;
    }
    public void stopUnlock() {
    	lock.set(0.0);
    }
    public void raise(double direction) {
    	motorRight.set(1.0*direction);
    	motorLeft.set(-1.0*direction);
    }
    public void stopRaise() {
    	motorRight.set(0.0);
    	motorLeft.set(0.0);
    }
}


