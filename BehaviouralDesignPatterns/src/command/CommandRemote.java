package command;

public class CommandRemote {
    public void pressButton(CommandSwitch switches){
        switches.execute();
    }
}
