package common;

public class MessageCommand implements ICommand {
    private String message;
    public MessageCommand(String message) {
        this.message = message;
    }

    @Override
    public String getCommand() {
        return "M:" + message;
    }
}
