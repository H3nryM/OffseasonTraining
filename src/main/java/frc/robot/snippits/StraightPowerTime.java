package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightPowerTime extends CommandBase {

private DriveBaseSub driveBaseSub;
private double power;
private double time;

  /**
   * Runs the drive base straight at a power for a time
   */
  public StraightPowerTime(DriveBaseSub driveBaseSub, ) {
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
  }


  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
      return false;
  }

}
