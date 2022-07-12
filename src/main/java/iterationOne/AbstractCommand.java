package iterationOne;

import common.ICommand;
import common.MessageCommand;

public abstract class AbstractCommand implements ICommand {

    private Type type;

    public AbstractCommand(Type type){
        this.type = type;
    }

    public static ICommand parseInput(String command){
        String [] parts = command.trim().split(",");

        Type t = Type.parse(parts[0]);
        if (t == Type.Message) {
            return new MessageCommand(parts[1]);
        }
        int sugar = Integer.valueOf(parts[1]);

        return new DrinkCommand(t, sugar);
    }
}
