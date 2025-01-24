package command;

public class CommandLightsOff implements CommandSwitch {
    CommandLight light;

    public CommandLightsOff(CommandLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
