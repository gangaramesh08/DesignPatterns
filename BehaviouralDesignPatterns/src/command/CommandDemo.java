package command;

public class CommandDemo {
    public static void main(String[] args) {
        CommandLight light = new CommandLight();
        CommandRemote remote = new CommandRemote();
        remote.pressButton(new CommandLightsOn(light));
        remote.pressButton(new CommandLightsOff(light));

        CommandStereo stereo = new CommandStereo();
        remote.pressButton(new CommandStereoMusic(stereo));
        remote.pressButton(new CommandStereoRadio(stereo));
    }
}
