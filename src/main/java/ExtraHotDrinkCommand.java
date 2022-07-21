public class ExtraHotDrinkCommand extends DrinkCommand implements IExtraHot{

    public ExtraHotDrinkCommand(String type, int sugar) {
        super(type, sugar);
    }

    @Override
    public boolean isHot() {
        return true;
    }
}
