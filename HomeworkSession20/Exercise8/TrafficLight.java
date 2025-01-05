package Exercise8;

public enum TrafficLight {
    RED, YELLOW, GREEN;


    public TrafficLight next() {
        switch (this) {
            case RED:
                return GREEN;
            case YELLOW:
                return RED;
            case GREEN:
                return YELLOW;
            default:
                System.out.println("INCORRECT traffic light");
        }

        return null;
    }


    @Override
    public String toString() {

        return switch (this) {
            case RED -> "RED (STOP)";
            case YELLOW -> "YELLOW (CAUTION)";
            case GREEN -> "GREEN (GO)";
            default -> super.toString();
        };
    }
}