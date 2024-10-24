package frc.robot.commands;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class Auton extends SequentialCommandGroup{
    public Auton(Drivetrain drivetrain){
        addCommands(
            new DriveDistance(1.5,3,drivetrain)
        );
    }
}
