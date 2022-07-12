package iterationOne;

public enum Type {
    Tea("T"),
    Coffee("C"),
    Chocolate("H"),
    Message("M");

    private String type;
    Type(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    public static Type parse(String t){

        switch (t){
            case "Tea":
                return Tea;
            case "Coffee":
                return Coffee;
            case "Chocolate":
                return Chocolate;
            case "Message":
                return Message;
            default:
                throw new EnumConstantNotPresentException(Type.class, t);
        }
    }
}
