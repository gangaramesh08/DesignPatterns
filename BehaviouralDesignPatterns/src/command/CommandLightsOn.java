package command;

public class CommandLightsOn implements CommandSwitch {
    CommandLight light ;

    public CommandLightsOn(CommandLight light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
