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

import org.usfirst.frc5665.RacknRoll2016.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc5665.RacknRoll2016.subsystems.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    public Joystick joystick;

    public OI() {

        joystick = new Joystick(0);

        // SmartDashboard Buttons
        SmartDashboard.putData("Grab",new Grab(1.0));
        SmartDashboard.putData("Teleop", new Teleop());
        SmartDashboard.putData("Swing",new Swing(1.0));
        SmartDashboard.putData("Raise Platform", new RaisePlatform(3,1.0));
        SmartDashboard.putData("Unlock Platform", new UnlockPlatform());
        SmartDashboard.putData("Toggle Speed", new ToggleSpeed());
    }

    public Joystick getJoystick() {
        return joystick;
    }
    public JoystickButton getButton(int buttonId) {
    	return new JoystickButton(joystick,buttonId);
    }

}

