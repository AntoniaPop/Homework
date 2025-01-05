package Exercise6;

public class Main {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        System.out.println(today + " is a " + today.dayType());

        Day day = Day.SATURDAY;
        System.out.println(day + " is a " + day.dayType());

        Day day2 = Day.TUESDAY;
        System.out.println(day2 + " = " + day2.dayType());

    }

}
