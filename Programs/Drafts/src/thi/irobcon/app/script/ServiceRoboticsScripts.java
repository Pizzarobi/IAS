package thi.irobcon.app.script;

import thi.irobcon.ecar.ECarDefines;
import thi.irobcon.script.IRobConScript;

public class ServiceRoboticsScripts extends IRobConScript {

	public void script() {
//		autp();
		patrol();
//	    slalom1();
//		slalom2();
//		clean();
	}

	protected void autp() {
		
//		useRobot(ECarDefines.JSIM_DX1);
		useRobot(ECarDefines.DX4);
		turn(180);
	}

	protected void patrol() {
		
//		useRobot(ECarDefines.JSIM_DX1);
		useRobot(ECarDefines.DX4);
		for (int i=0; i < 10; i++) {
			move(1000);
			if (i%2==0) gripClose();
			else gripOpen();
			turn(180);
		}
	}

	protected void slalom1() {
		
		useRobot(ECarDefines.JSIM_DX1);
		setRobPose(-2000,0,0);
		

	}
		
	protected void slalom2() {
		
		useRobot(ECarDefines.JSIM_DX1);
		setRobPose(-2000,0,0);
		
	}
	
	protected void clean() {
		
		useRobot(ECarDefines.JSIM_DX1);
		setRobPose(0,2000,90);
	}

}
