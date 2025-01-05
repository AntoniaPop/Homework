//Create an enum Day with values for the days of the week and a method to determine if a day is a weekday or weekend.

package Exercise6;

public enum Day {
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday");

    private final String lowerCase;

    Day(String lowerCase) {
        this.lowerCase = lowerCase;
    }

    public String getLowerCase() {
        return lowerCase;
    }

    public String dayType(){
        return switch (this) {
            case SUNDAY, SATURDAY -> "Weekend";
            default -> "Weekday";
        };
    }
}
