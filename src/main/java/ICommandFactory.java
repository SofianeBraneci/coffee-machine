public interface ICommandFactory {
    DrinkCommand newDrinkCommand(String type, int sugar);
    MessageCommand newMessageCommand(String content);
}
