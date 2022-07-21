import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestIterationOne {
    ICommandFactory factory;

    @Before
    public void setup(){
        factory = new CommandFactory();
    }

    @Test
    public void testCommandsWithNoSugar(){

        ICommand command = factory.newDrinkCommand("T", 0);
        Assert.assertEquals("T::", command.getCommand());

        command = factory.newDrinkCommand("C", 0);
        Assert.assertEquals("C::", command.getCommand());

        command = factory.newDrinkCommand("H", 0);
        Assert.assertEquals("H::", command.getCommand());
    }

    @Test
    public void testCommandsWithOneSugar(){
        ICommand command = factory.newDrinkCommand("T", 1);
        Assert.assertEquals("T:1:0", command.getCommand());

        command = factory.newDrinkCommand("C", 1);
        Assert.assertEquals("C:1:0", command.getCommand());

        command = factory.newDrinkCommand("H", 1);
        Assert.assertEquals("H:1:0", command.getCommand());
    }


    @Test
    public void testCommandsWithTwoSugars(){
        ICommand command = factory.newDrinkCommand("T", 2);
        Assert.assertEquals("T:2:0", command.getCommand());

        command = factory.newDrinkCommand("C", 2);
        Assert.assertEquals("C:2:0", command.getCommand());

        command = factory.newDrinkCommand("H", 2);
        Assert.assertEquals("H:2:0", command.getCommand());
    }

    @Test
    public void testMessageCommand(){
        ICommand command = factory.newMessageCommand("Hello");
        Assert.assertEquals("M:Hello", command.getCommand());

        command = factory.newMessageCommand("World");
        Assert.assertEquals("M:World", command.getCommand());

    }

}
