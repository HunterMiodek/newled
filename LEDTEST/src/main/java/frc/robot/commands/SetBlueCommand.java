package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.led.LedSubsystem;

public class SetBlueCommand extends Command{
    LedSubsystem ledSubsystem;
    public SetBlueCommand(LedSubsystem LedSubsystemfr){
        LedSubsystem ledSubsystem = LedSubsystemfr;
        addRequirements(ledSubsystem);
    }

    @Override
    public void execute(){
        ledSubsystem.setBlue();
    }

    
}
