package org.usfirst.frc.team2906.robot.commands;

import org.usfirst.frc.team2906.robot.Robot;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TankDrive extends Command {

    public TankDrive() {
     requires(Robot.drivebase);
    }

    protected void initialize() {
    }

    protected void execute() {
    	
    	double throttle = (1.0 - Robot.m_oi.LEFT_JOY.getThrottle()) / -2.0 ;
    	
    	
    	Robot.drivebase.set(ControlMode.PercentOutput, Robot.m_oi.getLeftJoyY() * throttle, Robot.m_oi.getRightJoyY() * throttle);
    	//makes its so the drivetrain moves when both joysticks are moved forwards
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    	end();
    }
}
