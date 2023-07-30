package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeSetCmd extends CommandBase {

    private final IntakeSubsystem intakeSubsystem;
    private final boolean open;

    // Add a unique identifier as a class variable (could be anything you want)
    private final String Intake8159;

    public IntakeSetCmd(IntakeSubsystem intakeSubsystem, boolean open) {
        this.open = open;
        this.intakeSubsystem = intakeSubsystem;

        
        
        Intake8159 = "IntakeSetCmd_" + System.currentTimeMillis();

        addRequirements(intakeSubsystem);
    }
    @Override
    public void execute() {
        intakeSubsystem.setPosition(open);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println(Intake8159 + " bitti");
    }

    @Override
    public void initialize() {
        System.out.println(Intake8159 + " basladi");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
