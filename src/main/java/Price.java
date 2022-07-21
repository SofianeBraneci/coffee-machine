public class Price {

    public static double getPrice(String type){
        return switch (type){
            case "T" -> 0.4;
            case "C" -> 0.6;
            case "H" -> 0.5;
            default -> 0.0;
        };
    }
}
