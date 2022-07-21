import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCases {
    ICommandFactory factory;

    @Before
    public void setup(){
        factory = new CommandFactory();
    }

    @Test
    public void testCommandsWithNoSugarCorrectAmount(){

        ICommand command = factory.newDrinkCommand("T", 0, 0.4);
        Assert.assertEquals("T::", command.getCommand());

        command = factory.newDrinkCommand("C", 0, 0.6);
        Assert.assertEquals("C::", command.getCommand());

        command = factory.newDrinkCommand("H", 0,0.5);
        Assert.assertEquals("H::", command.getCommand());
    }

    @Test
    public void testCommandsWithOneSugarCorrectAmount(){
        ICommand command = factory.newDrinkCommand("T", 1, 0.4);
        Assert.assertEquals("T:1:0", command.getCommand());

        command = factory.newDrinkCommand("C", 1, 0.6);
        Assert.assertEquals("C:1:0", command.getCommand());

        command = factory.newDrinkCommand("H", 1, 0.5);
        Assert.assertEquals("H:1:0", command.getCommand());
    }


    @Test
    public void testCommandsWithTwoSugarsCorrectAmount(){
        ICommand command = factory.newDrinkCommand("T", 2, 0.4);
        Assert.assertEquals("T:2:0", command.getCommand());

        command = factory.newDrinkCommand("C", 2, 0.6);
        Assert.assertEquals("C:2:0", command.getCommand());

        command = factory.newDrinkCommand("H", 2, 0.5);
        Assert.assertEquals("H:2:0", command.getCommand());
    }

    @Test
    public void testMessageCommand(){
        ICommand command = factory.newMessageCommand("Hello");
        Assert.assertEquals("M:Hello", command.getCommand());

        command = factory.newMessageCommand("World");
        Assert.assertEquals("M:World", command.getCommand());

    }

    @Test
    public void testCommandsWithTwoSugarsNotCorrectAmount(){
        ICommand command = factory.newDrinkCommand("T", 2, 0.1);
        Assert.assertEquals("M:0.3", command.getCommand());

        command = factory.newDrinkCommand("C", 2, 0.2);
        Assert.assertEquals("M:0.4", command.getCommand());

        command = factory.newDrinkCommand("H", 2, 0.0);
        Assert.assertEquals("M:0.5", command.getCommand());
    }

    @Test
    public void testCommandsWithNoSugarCorrectAmountHot(){

        ICommand command = factory.newExtraHotDrinkCommand("T", 0, 0.4);
        Assert.assertEquals("Th::", command.getCommand());
        Assert.assertTrue(command instanceof ExtraHotDrinkCommand);
        command = factory.newExtraHotDrinkCommand("C", 0, 0.6);
        Assert.assertEquals("Ch::", command.getCommand());
        Assert.assertTrue(command instanceof ExtraHotDrinkCommand);
        command = factory.newExtraHotDrinkCommand("H", 0,0.5);
        Assert.assertEquals("Hh::", command.getCommand());
        Assert.assertTrue(command instanceof ExtraHotDrinkCommand);
    }

    @Test
    public void testCommandsWithOneSugarCorrectAmountHot(){

        ICommand command = factory.newExtraHotDrinkCommand("T", 1, 0.4);
        Assert.assertEquals("Th:1:0", command.getCommand());
        Assert.assertTrue(command instanceof ExtraHotDrinkCommand);
        command = factory.newExtraHotDrinkCommand("C", 1, 0.6);
        Assert.assertEquals("Ch:1:0", command.getCommand());
        Assert.assertTrue(command instanceof ExtraHotDrinkCommand);
        command = factory.newExtraHotDrinkCommand("H", 1,0.5);
        Assert.assertEquals("Hh:1:0", command.getCommand());
        Assert.assertTrue(command instanceof ExtraHotDrinkCommand);
    }

    @Test
    public void testCommandsWithOneSugarNotCorrectAmountHot(){

        ICommand command = factory.newExtraHotDrinkCommand("T", 1, 0.1);
        Assert.assertEquals("M:0.3", command.getCommand());
        Assert.assertTrue(command instanceof MessageCommand);
        command = factory.newExtraHotDrinkCommand("C", 1, 0.1);
        Assert.assertEquals("M:0.5", command.getCommand());
        Assert.assertTrue(command instanceof MessageCommand);
        command = factory.newExtraHotDrinkCommand("H", 1,0.0);
        Assert.assertEquals("M:0.5", command.getCommand());
        Assert.assertTrue(command instanceof MessageCommand);
    }


    @Test
    public void testJuiceCorrectAmount(){

        ICommand command = factory.newJuiceCommand("O", 0.6);
        Assert.assertEquals("O::", command.getCommand());
        Assert.assertTrue(command instanceof JuiceCommand);
    }
}
