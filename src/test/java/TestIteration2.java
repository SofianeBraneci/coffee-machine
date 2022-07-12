import common.ICommand;
import common.IDrinkMaker;
import iterationTwo.AbstractCommand;
import org.junit.Assert;
import org.junit.Test;

public class TestIteration2 {

    @Test
    public void assertCorrectAmountIteration2(){
        // command : type,sugar,amount.
        // amount: T 0.4, C 0.6, H 0.5
        ICommand parsed = AbstractCommand.parseInput("Tea,0,0.4");
        Assert.assertEquals("T::", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());
        parsed = AbstractCommand.parseInput("Tea,1,0.4");
        Assert.assertEquals("T:1:0", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());
        parsed = AbstractCommand.parseInput("Tea,2,0.4");
        Assert.assertEquals("T:2:0", parsed.getCommand());
        IDrinkMaker.makeDrink(parsed.getCommand());
        parsed = AbstractCommand.parseInput("Tea,2,0.2");
        Assert.assertEquals("M:0.2", parsed.getCommand());

    }
}
