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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveLeft1;
    public static SpeedController driveLeft2;
    public static SpeedController driveRight1;
    public static SpeedController driveRight2;
    public static RobotDrive driveRobotDrive4;
    public static Encoder armEncoder;
    public static SpeedController armMotor;
    public static Relay platformLock;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveLeft1 = new Victor(0);
        LiveWindow.addActuator("Drive", "Left1", (Victor) driveLeft1);
        
        driveLeft2 = new Victor(1);
        LiveWindow.addActuator("Drive", "Left2", (Victor) driveLeft2);
        
        driveRight1 = new Victor(2);
        LiveWindow.addActuator("Drive", "Right1", (Victor) driveRight1);
        
        driveRight2 = new Victor(3);
        LiveWindow.addActuator("Drive", "Right2", (Victor) driveRight2);
        
        driveRobotDrive4 = new RobotDrive(driveLeft1, driveLeft2,
              driveRight1, driveRight2);
        
        driveRobotDrive4.setSafetyEnabled(true);
        driveRobotDrive4.setExpiration(0.1);
        driveRobotDrive4.setSensitivity(0.5);
        driveRobotDrive4.setMaxOutput(1.0);

        armEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Arm", "Encoder", armEncoder);
        armEncoder.setDistancePerPulse(1.0);
        armEncoder.setPIDSourceType(PIDSourceType.kRate);
        armMotor = new Victor(4);
        LiveWindow.addActuator("Arm", "Motor", (Victor) armMotor);
        
        platformLock = new Relay(0, Relay.Direction.kForward);
        LiveWindow.addActuator("Platform", "Lock", (Relay) platformLock); 

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
