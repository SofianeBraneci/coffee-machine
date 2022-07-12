package common;

public interface IDrinkMaker {

    static void makeDrink(String command){
        System.out.println("Received command: " + command);
    }
}
