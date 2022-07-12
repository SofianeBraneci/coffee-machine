package iterationTwo;

import common.ICommand;
import common.MessageCommand;

public abstract class AbstractCommand implements ICommand {

    private Type type;

    public AbstractCommand(Type type){
        this.type = type;
    }

    // command = drink,sugar,amount || Message,content

    public Type getType() {
        return type;
    }

    public static ICommand parseInput(String command){
        String [] parts = command.trim().split(",");

        Type t = Type.parse(parts[0]);
        if (t == Type.Message) {
            return new MessageCommand(parts[1]);
        }
        int sugar = Integer.valueOf(parts[1]);
        // amount passed to buy a drink
        double amount = Double.valueOf(parts[2]);

        if(t.getPrice() - amount > 0.){
            return new MessageCommand(String.valueOf(t.getPrice() - amount));
        }

        return new DrinkCommand(t, sugar, amount);
    }
}
