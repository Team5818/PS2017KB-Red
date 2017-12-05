package org.usfirst.frc.team5818.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;

public class DriveSide {

    public static final double TICKS_PER_INCH = 5818;
    
    private CANTalon motor1;
    private CANTalon motor2;
    private Encoder enc;
    
    public DriveSide(boolean isLeft) {
        if(isLeft) {
            motor1 = new CANTalon(1);
            motor2 = new CANTalon(2);
            enc = new Encoder(0,1);
        }
        else {
            motor1 = new CANTalon(3);
            motor2 = new CANTalon(4);
            motor1.setInverted(true);
            motor2.setInverted(true); 
            enc = new Encoder(2,3);
        }
        enc.setDistancePerPulse(1.0/TICKS_PER_INCH);
    } 
    
    public void setPower(double pow) {
        //if(!goingToDestroyRobot){
        motor1.set(pow);
        motor2.set(pow);
        //}
    }
    
    public int getRawPosition() {
        return enc.get();
    }
    
    public double getPositionInches() {
        return enc.getDistance();
    }

}



