package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class TurnPowerTime extends CommandBase {

  private DriveBaseSub driveBaseSub;
  private double power;
  private double time;
  private String direction;
  private double initialTime;
  
  public TurnPowerTime(DriveBaseSub driveBaseSub, String direction, double power, double time) {
    this.driveBaseSub = driveBaseSub;
    this.direction = direction;
    this.power = power;
    this.time = time;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    initialTime = System.currentTimeMillis();
    driveBaseSub.coast();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (direction == "RIGHT"){
      driveBaseSub.setRightPower(-power);
      driveBaseSub.setLeftPower(power);
    }
    else if (direction == "LEFT") {
      driveBaseSub.setRightPower(power);
      driveBaseSub.setLeftPower(-power);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveBaseSub.setPower(0);
    driveBaseSub.brake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    if (System.currentTimeMillis() - initialTime >= time) {
      return true;
    }
    return false;
  }
}