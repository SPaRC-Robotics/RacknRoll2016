// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5665.RacknRoll2016.subsystems;

import org.usfirst.frc5665.RacknRoll2016.RobotMap;
import org.usfirst.frc5665.RacknRoll2016.commands.*;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Drive extends Subsystem {

	public static final double movementSensitivity = 0.75;
	public static final double rotationSensitivity = 0.5;
    private final SpeedController right = RobotMap.driveRight;
    private final SpeedController left = RobotMap.driveLeft;
    private final RobotDrive robotDrive2 = RobotMap.driveRobotDrive2;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {

        setDefaultCommand(new Teleop());
    }
    public void arcadeDrive(double xAxis, double yAxis) {
    	robotDrive2.arcadeDrive(xAxis*rotationSensitivity,yAxis*movementSensitivity);
    }
}

