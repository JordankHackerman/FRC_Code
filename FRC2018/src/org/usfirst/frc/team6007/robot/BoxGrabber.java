package org.usfirst.frc.team6007.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType; 

public class BoxGrabber{
	
	Joystick driverStick;
	RobotDrive grabberBase;

	private Spark leftGrabberMotor;
	private Spark rightGrabberMotor;
	final int LEFT_GRABBER_MOTOR_ID = 2;
	final int RIGHT_GRABBER_MOTOR_ID = 3;
	private double MotorSpeed = 0.5;
	

	
	

	
	
	public BoxGrabber(){
	
	
	leftGrabberMotor = new Spark(LEFT_GRABBER_MOTOR_ID);
	rightGrabberMotor = new Spark(RIGHT_GRABBER_MOTOR_ID);
		
	driverStick = new Joystick(0);
	
	grabberBase = new RobotDrive(leftGrabberMotor, rightGrabberMotor);
	
																															
	//comment out one inversion
	grabberBase.setInvertedMotor(MotorType.kFrontRight, true);
	grabberBase.setInvertedMotor(MotorType.kFrontLeft, true);
	
	}
	

	
	
	
	
	public void suckIn(){

		grabberBase.drive(1, 0);
		
	}
	
	public void spitOut(){

		grabberBase.drive(-1, 0);
		
	}

		
		
}