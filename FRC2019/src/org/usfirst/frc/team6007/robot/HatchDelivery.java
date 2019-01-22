/*******************************************************
* Robotics Hatch Delivery by Jordan Thorne date 22/01/19	
*******************************************************/
package org.usfirst.frc.team6007.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive; 
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;


public class HatchDelivery{
  
	DifferentialDrive HatchBase;
	private static RobotIO hatchtLifterPotentiometer;
  	private static ReadSwitch homePosition;
  	private static ReadSwitch floorPosition;
	private Spark leftHatchMotor;
	private Spark rightHatchMotor;
	
	public HatchDelivery(){
    
		leftHatchMotor = new Spark(RobotMap.PWM_PinOut.LEFT_HATCH_MOTOR_ID);
		rightHatchMotor = new Spark(RobotMap.PWM_PinOut.RIGHT_HATCH_MOTOR_ID);
    
		HatchBase = new DifferentialDrive(leftHatchMotor, rightHatchMotor);
	
	}
	
	//Picks up Disk or something
	public void Up(double Power){
		HatchBase.arcadeDrive(Power, 0);
	}
	
	//Puts down Disk or something 
	public void Down(double DownPower){
		HatchBase.arcadeDrive(DownPower, 0);	
	}
	
	
  }
