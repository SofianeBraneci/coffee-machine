public class CommandFactory implements ICommandFactory{

    @Override
    public  DrinkCommand newDrinkCommand(String type, int sugar){
        return new DrinkCommand(type, sugar);
    }

    @Override
    public MessageCommand newMessageCommand(String content) {
        return new MessageCommand(content);
    }
}
