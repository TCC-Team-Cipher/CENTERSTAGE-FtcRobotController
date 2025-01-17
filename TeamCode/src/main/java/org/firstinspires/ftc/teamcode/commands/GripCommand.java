package org.firstinspires.ftc.teamcode.commands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.subsystems.GripSubsystem;

public class GripCommand extends CommandBase {
    private final GripSubsystem gripSubsystem;

    public GripCommand(GripSubsystem gripSubsystem) {
        this.gripSubsystem = gripSubsystem;

        addRequirements(this.gripSubsystem);
    }

    public void toggleLeft() {
        this.gripSubsystem.left.toggle();
    }

    public void toggleRight() {
        this.gripSubsystem.right.toggle();
    }

    public void top() {
        this.gripSubsystem.pitch.set(0d);
    }

    public void backboard() {
        this.gripSubsystem.pitch.set(0.11d);
    }

    public void bottom() {
        this.gripSubsystem.pitch.set(1d);
    }
}
