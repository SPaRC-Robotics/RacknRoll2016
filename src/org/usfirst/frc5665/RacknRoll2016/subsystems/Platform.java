package org.usfirst.frc5665.RacknRoll2016.subsystems;

import org.usfirst.frc5665.RacknRoll2016.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Platform extends Subsystem {
    
    private final boolean isLocked = true;
    private final Relay lock = RobotMap.platformLock;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void unlock() {
        lock.set(Relay.Value.kOn);
        isLocked = false;
    }
}


