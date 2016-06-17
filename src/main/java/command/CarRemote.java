package command;

/**
 * Created by Gurinder on 6/17/2016.
 */
public class CarRemote {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

}
