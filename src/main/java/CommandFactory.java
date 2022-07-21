public class CommandFactory implements ICommandFactory{

    @Override
    public  ICommand newDrinkCommand(String type, int sugar, double amount){
        double diff = Price.getPrice(type) - amount;
        if(diff > 0) return newMessageCommand(("%.1f".formatted(diff)).replace(",","."));
        return new DrinkCommand(type, sugar);
    }

    @Override
    public MessageCommand newMessageCommand(String content) {
        return new MessageCommand(content);
    }
}
