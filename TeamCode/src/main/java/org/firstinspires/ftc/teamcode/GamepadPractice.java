package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@Disabled
@TeleOp
public class GamepadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {

        double speedForward = -gamepad1.left_stick_y / 2.0;
        double speedRight = -gamepad1.right_stick_y / 2.0;
        double differenceXJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumoftriggers = gamepad1.left_trigger + gamepad1.right_trigger;


        telemetry.addData("Left X", gamepad1.left_stick_x);
        telemetry.addData("Right Y", speedForward);
        telemetry.addData("a", gamepad1.a);
        telemetry.addData("b", gamepad1.b);
        telemetry.addData("difference", differenceXJoysticks);
        telemetry.addData("Sum", sumoftriggers);

        telemetry.addData("Right X", gamepad1.right_stick_x);
        telemetry.addData("Right Y", speedRight);

    }
}
