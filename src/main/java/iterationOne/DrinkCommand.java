package iterationOne;

import common.ICommand;

public class DrinkCommand implements ICommand {

    private Type type;
    private int sugar;

    public DrinkCommand(Type type){
        this(type, 0);
    }

    public DrinkCommand(Type type, int sugar){
        this.type = type;
        this.sugar = sugar > 2 ? 2 : sugar;
    }

    @Override
    public String getCommand() {
        StringBuilder builder = new StringBuilder();
        builder.append(type).append(":");

        if(sugar > 0) builder.append(sugar).append(":").append("0");

        else builder.append(":");
        return builder.toString();
    }
}
