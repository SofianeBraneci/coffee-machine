import common.ICommand;
import common.IDrinkMaker;
import iterationThree.AbstractCommand;
import org.junit.Assert;
import org.junit.Test;

public class TestIteration3 {


    @Test
    public void assertNewAdditionAndExtraHot(){
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
        // orange jus
        parsed = AbstractCommand.parseInput("Orange,0,0.6");
        Assert.assertEquals("O::", parsed.getCommand());

        parsed = AbstractCommand.parseInput("Tea hot,0,0.6");
        Assert.assertEquals("Th::", parsed.getCommand());

        parsed = AbstractCommand.parseInput("Tea hot,1,0.6");
        Assert.assertEquals("Th:1:0", parsed.getCommand());

        parsed = AbstractCommand.parseInput("Coffee hot,0,0.6");
        Assert.assertEquals("Ch::", parsed.getCommand());
        // not the correct amount
        parsed = AbstractCommand.parseInput("Coffee hot,0,0.1");
        Assert.assertEquals("M:0.5", parsed.getCommand());

    }
}
