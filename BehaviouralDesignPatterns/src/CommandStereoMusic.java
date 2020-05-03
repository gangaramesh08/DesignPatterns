public class CommandStereoMusic implements CommandSwitch{
    CommandStereo stereo ;

    public CommandStereoMusic(CommandStereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.turnOn();
        stereo.increaseVolume(11);
        stereo.playMusic();
    }
}
