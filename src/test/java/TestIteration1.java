import common.IDrinkMaker;
import iterationOne.AbstractCommand;
import common.ICommand;
import org.junit.Assert;
import org.junit.Test;

public class TestIteration1 {

    @Test
    public void assertCorrectParsingIteration1(){

        ICommand parsed = AbstractCommand.parseInput("Tea,0");
        Assert.assertEquals("T::", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());

        parsed = AbstractCommand.parseInput("Tea,1");
        Assert.assertEquals("T:1:0", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());

        parsed = AbstractCommand.parseInput("Tea,2");
        Assert.assertEquals("T:2:0", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());

        parsed = AbstractCommand.parseInput("Tea,123");
        Assert.assertEquals("T:2:0", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());

        parsed = AbstractCommand.parseInput("Tea,0");
        Assert.assertEquals("T::", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());

        parsed = AbstractCommand.parseInput("Coffee,0");
        Assert.assertEquals("C::", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());

        parsed = AbstractCommand.parseInput("Coffee,1");
        Assert.assertEquals("C:1:0", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());

        parsed = AbstractCommand.parseInput("Coffee,2");
        Assert.assertEquals("C:2:0", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());

        parsed = AbstractCommand.parseInput("Coffee,123");
        Assert.assertEquals("C:2:0", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());

        parsed = AbstractCommand.parseInput("Chocolate,0");
        Assert.assertEquals("H::", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());

        parsed = AbstractCommand.parseInput("Chocolate,1");
        Assert.assertEquals("H:1:0", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());

        parsed = AbstractCommand.parseInput("Chocolate,2");
        Assert.assertEquals("H:2:0", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());

        parsed = AbstractCommand.parseInput("Chocolate,123");
        Assert.assertEquals("H:2:0", parsed.getCommand());

        // parsing a message input

        parsed = AbstractCommand.parseInput("Message,Hello");
        Assert.assertEquals("M:Hello", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());
    }

}
