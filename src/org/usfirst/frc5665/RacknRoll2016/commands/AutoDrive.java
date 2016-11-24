// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5665.RacknRoll2016.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5665.RacknRoll2016.Robot;

/**
 *
 */
public class AutoDrive extends Command {

    private double xAxis;
    private double yAxis;
    private double duration;
    private double startTime;
    
    public AutoDrive(double xAxis, double yAxis, double duration) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.duration = duration;
        requires(Robot.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	startTime = Timer.getFPGATimestamp();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drive.arcadeDrive(xAxis, -yAxis);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return (Timer.getFPGATimestamp() >= (startTime+duration));
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.drive.arcadeDrive(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.drive.arcadeDrive(0, 0);
    }
}
