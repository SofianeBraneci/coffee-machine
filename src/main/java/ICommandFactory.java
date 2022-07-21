public interface ICommandFactory {
    ICommand newDrinkCommand(String type, int sugar, double amount);
    ICommand newMessageCommand(String content);
}
