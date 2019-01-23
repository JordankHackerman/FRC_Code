/*******************************************************
* Robotics Hatch Delivery by Jordan Thorne date 23/01/19	
*******************************************************/
/***********************************
*Arm that retrives and delivers disk
***********************************/
package org.usfirst.frc.team6007.robot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.drive.DifferentialDrive; 
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class HatchDelivery{
  
	DifferentialDrive hatchBase;
	private static RobotIO hatchtLifterPotentiometer;
	private RobotIO robotIO;
	private VictorSP HatchMotor;
	
	public HatchDelivery(){
    
		HatchMotor = new VictorSP(RobotMap.PWM_PinOut.RIGHT_HATCH_MOTOR_ID);
   
	}

	//Puts disk in home position
	public void hatchLifterToHomePosition(double Power){
		while(!robotIO.hatchSwitchAtHome){
			HatchMotor.set(Power, 0);
			//while so it runs until its false
		}
		
	}
	
	//Puts arm in delivery position
	public void deliveryPosition(double Power) {
		HatchMotor.set (power, 0) ;
		
	if (HatchDelivery.getCurrentLiftDistance() <
	}
		
		if (hatchDelivery.getCurrentLiftDistance() < target - 20 ) {
			hatchDelivery.setLiftPower(0.7);
		} else if (hatchDelivery.getCurrentLiftDistance() > target + 20) {
		
			hatchDelivery.setLiftPower(0.3);
		} else {
		
			hatchDelivery.setLiftPower (RobotMap.HOLD_POWER);
		}
	
	hatchDelivery.liftup(HatchDelivery.getLiftPower());*/
}	
				
	//Retrieves the hatch from floor
	public void retriveHatchFromFloor(double DownPower){
		while (!robotIO.hatchSwitchAtLower){
			HatchMotor.set(DownPower, 0);	
		}
		
	}
	
  }
