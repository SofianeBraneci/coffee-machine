import java.util.Optional;

public class CommandFactory implements ICommandFactory{

    @Override
    public  ICommand newDrinkCommand(String type, int sugar, double amount){

        return  assertAmount(type, amount).orElse(new DrinkCommand(type, sugar));
    }

    @Override
    public ICommand newJuiceCommand(String type, double amount) {
        return  assertAmount(type, amount).orElse(new JuiceCommand(type));
    }

    @Override
    public ICommand newExtraHotDrinkCommand(String type, int sugar, double amount) {
        return  assertAmount(type, amount).orElse(new ExtraHotDrinkCommand(type, sugar));
    }

    @Override
    public MessageCommand newMessageCommand(String content) {
        return new MessageCommand(content);
    }

    private Optional<ICommand> assertAmount(String type, double amount){
        double diff = Price.getPrice(type) - amount;

        if(diff > 0 ) return Optional.of(newMessageCommand(("%.1f".formatted(diff)).replace(",",".")));
        return Optional.empty();
    }
}
