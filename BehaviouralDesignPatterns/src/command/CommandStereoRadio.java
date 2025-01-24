package command;

public class CommandStereoRadio implements CommandSwitch{
    CommandStereo stereo ;

    public CommandStereoRadio(CommandStereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.turnOn();
        stereo.increaseVolume(11);
        stereo.playRadio();
    }
}