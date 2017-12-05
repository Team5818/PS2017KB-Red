package org.usfirst.frc.team5818.robot;

import java.util.Set;

import edu.wpi.first.wpilibj.Servo;

public class BallDrop {
	
	private Servo bottomServo = new Servo(0);
	private Servo middleServo = new Servo(1);
	private Servo topServo = new Servo(2);
	int topClose = 0;
	int topOpen = 100;
	int middleClose = 0;
	int middleOpen = 100;
	int bottomClose = 0;
	int bottomOpen = 100;
	
	public void setTop(int tPos) {
		topServo.set(tPos);
		}
	public void setMiddle(int mPos) {
		middleServo.set(mPos);
		}
	public void setBottom(int bPos) {
		bottomServo.set(bPos);
		}
	
	public void openTop(boolean open) {
		if (open) {
			setTop(topOpen);
		}
		else {
			setTop(topClose);
		}
	}
	public void openMiddle(boolean open) {
		if (open) {
			setMiddle(middleOpen);
		}
		else {
			setMiddle(middleClose);
		}
	}
	public void openBottom(boolean open) {
		if (open) {
			setBottom(bottomOpen);
		}
		else {
			setBottom(bottomClose);
		}
	}
	
}
