public class MessageCommand extends AbstractCommand{
    private String content;
    public MessageCommand(String content) {
        super("M");
        this.content = content;
    }

    @Override
    public String getCommand() {
        return getType() + ":" + content;
    }
}
