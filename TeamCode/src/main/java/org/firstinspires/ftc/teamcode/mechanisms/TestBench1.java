package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class TestBench1  {

    private DcMotor motor;
    private double ticksPerRev;

    public void init (HardwareMap hwMap) {
       // motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        //motor.setDirection(DcMotorSimple.Direction.REVERSE);

    motor = hwMap.get(DcMotor.class, "FrontLeft")        ;
    motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    ticksPerRev = motor.getMotorType().getTicksPerRev();
    }

    public void setMotorSpeed(double speed) {
        motor.setPower(speed);
    }

    public double getMoterRevs(){
        return motor.getCurrentPosition() / ticksPerRev;
    }

}
