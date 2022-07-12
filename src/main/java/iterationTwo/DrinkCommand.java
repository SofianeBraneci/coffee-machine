package iterationTwo;

public class DrinkCommand extends AbstractCommand {

    private int sugar;
    private double amount;

    public DrinkCommand(Type type, int sugar, double amount){
        super(type);
        this.sugar = sugar > 2 ? 2 : sugar;
        this.amount = amount;
    }

    @Override
    public String getCommand() {

        StringBuilder builder = new StringBuilder();
        builder.append(getType()).append(":");

        if(sugar > 0) builder.append(sugar).append(":").append("0");

        else builder.append(":");

        return builder.toString();
    }
}
