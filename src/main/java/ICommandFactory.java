public interface ICommandFactory {
    ICommand newDrinkCommand(String type, int sugar, double amount);
    ICommand newJuiceCommand(String type, double amount);
    ICommand newExtraHotDrinkCommand(String type, int sugar, double amount);
    ICommand newMessageCommand(String content);
}
