package common;

public interface IDrinkMaker {
    // a default implementation
    static void makeDrink(String command){
        System.out.println("Received command: " + command);
    }
}
