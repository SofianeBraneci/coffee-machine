public class DrinkCommand extends AbstractCommand {
    private int sugar;

    public DrinkCommand(String type, int sugar) {
        super(type);
        this.sugar = sugar;
    }

    @Override
    public String getCommand() {
        StringBuilder builder = new StringBuilder(getType());
        builder.append(":");
        if(sugar > 0){
            builder.append(sugar).append(":").append("0");
        }else builder.append(":");

        return builder.toString();
    }
}
