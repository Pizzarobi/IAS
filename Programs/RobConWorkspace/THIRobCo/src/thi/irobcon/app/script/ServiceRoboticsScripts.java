package thi.irobcon.app.script; // Unterverzeichnis im Projekt

import thi.irobcon.ecar.ECarDefines;
import thi.irobcon.script.IRobConScript; // Package + "IRobConScript" = Klasse

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

	protected void patrol() { // Hier implenetierung virtuelle Methode (Polymorphismus)
		
		useRobot(ECarDefines.JSIM_DX1);  // realer Pioneer Robot C107
		//useRobot(ECarDefines.DX4); // einfacher Simulator
		for (int i=0; i < 10; i++) {
			move(1000); // 1 Meter vorwärts
			if (i%2==0) gripClose(); // Jeder Zweiter Durchlauf Grip öffnen oder schließen
			else gripOpen();
			turn(180); // 180 grad drehen
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
