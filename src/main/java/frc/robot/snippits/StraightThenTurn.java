package frc.robot.snippits;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.drivebase.DriveBaseSub;

public class StraightThenTurn extends SequentialCommandGroup {

  /**
   * Creates a new StraightThenTurn.
   */
  public StraightThenTurn(StraightPowerTime straightPowerTime, TurnPowerTime turnPowerTime){
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    super(straightPowerTime, turnPowerTime);
  }
}