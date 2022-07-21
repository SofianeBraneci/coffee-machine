public abstract class AbstractCommand implements ICommand{
    // the type of the command
    private String type;

    public AbstractCommand(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
