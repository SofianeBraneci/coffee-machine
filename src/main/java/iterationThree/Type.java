package iterationThree;

public enum Type {
    Tea("T", 0.4), TeaHot("Th",0.4),
    Coffee("C", 0.6), CoffeeHot("Ch", 0.6),
    Chocolate("H", 0.5),ChocolateHot("Hh", 0.5),
    Orange("O", 0.6),
    Message("M");

    private String type;
    private double price;
    Type(String type, double price){
        this.type = type;
        this.price = price;
    }

    Type(String type){
        this(type, 0.0);
    }
    @Override
    public String toString() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public static Type parse(String t){

        switch (t){
            case "Tea":
                return Tea;
            case "Coffee":
                return Coffee;
            case "Chocolate":
                return Chocolate;
            case "Tea hot":
                return TeaHot;
            case "Coffee hot":
                return CoffeeHot;
            case "Chocolate hot":
                return ChocolateHot;
            case "Orange":
                return Orange;
            case "Message":
                return Message;
            default:
                throw new EnumConstantNotPresentException(Type.class, t);
        }
    }
}
