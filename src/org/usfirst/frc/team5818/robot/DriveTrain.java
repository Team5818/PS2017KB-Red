package org.usfirst.frc.team5818.robot;

import edu.wpi.first.wpilibj.Joystick;

public class DriveTrain {
	//fields
	private DriveSide left;
	private DriveSide right;
	public DriveTrain() {
		left = new DriveSide(true);
		right = new DriveSide(false);
		
	}
	public void setPower (double l, double r) {
		left.setPower(l);
		right.setPower(r);
	}
	public double getPositionInches() {
		double l = left.getPositionInches();
		double r = right.getPositionInches();
		return (l+r)/2;
	}
	public void setArcade(double x, double y) {
		double left;
		double right;
		if (y >= 0.0){
			left = y+x;
			right = y-x;
		}
		else {
			left = y-x;
			right = y+x;
		}
		setPower(left,right);
	}
			
	
}

