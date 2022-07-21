public class Price {

    public static double getPrice(String type){
        return switch (type){
            case "T", "Th" -> 0.4;
            case "C", "O", "Ch" -> 0.6;
            case "H", "Hh" -> 0.5;
            default -> 0.0;
        };
    }
}
