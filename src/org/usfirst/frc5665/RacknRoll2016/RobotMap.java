// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5665.RacknRoll2016;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static SpeedController driveRight;
    public static SpeedController driveLeft;
    public static RobotDrive driveRobotDrive2;
    public static SpeedController armMotorRight;
    public static SpeedController armMotorLeft;
    public static SpeedController platformLock;
    //public static SpeedController platformMotorRight;
    //public static SpeedController platformMotorLeft;
    public static SpeedController wristWindowMotor;

    public static void init() {
        driveRight = new Victor(0);
        LiveWindow.addActuator("Drive", "Right", (Victor) driveRight);
        
        driveLeft = new Victor(1);
        LiveWindow.addActuator("Drive", "Left", (Victor) driveLeft);
        
        driveRobotDrive2 = new RobotDrive(driveLeft, driveRight);
        
        driveRobotDrive2.setSafetyEnabled(true);
        driveRobotDrive2.setExpiration(0.1);
        driveRobotDrive2.setSensitivity(0.5);
        driveRobotDrive2.setMaxOutput(1.0);

        driveRobotDrive2.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);

        armMotorRight = new Victor(3);
        LiveWindow.addActuator("Arm", "Motor Right", (Victor) armMotorRight);
        armMotorRight.setInverted(true);
        
        armMotorLeft = new Victor(2);
        LiveWindow.addActuator("Arm", "Motor Left", (Victor) armMotorLeft);
        armMotorLeft.setInverted(true);
        
        platformLock = new Victor(7);
        LiveWindow.addActuator("Platform", "Lock", (Victor) platformLock);
        
        //platformMotorRight = new Victor(5);
        //LiveWindow.addActuator("Platform", "Motor Right", (Victor) platformMotorRight);
        
        //platformMotorLeft = new Victor(8);
        //LiveWindow.addActuator("Platform", "Motor Left", (Victor) platformMotorLeft);
        
        wristWindowMotor = new Victor(4);
        LiveWindow.addActuator("Wrist", "Window Motor", (Victor) wristWindowMotor);
        }
}
