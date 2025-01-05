package Exercise7;

public class Main  {
    public static void main(String[] args) {
        Season season1 = Season.AUTUMN;
        System.out.println("Temperature: " + season1.getAverageTemperature() +
                            " Description: " + season1.getDescription());


        season1.displaySeasonInfo();


    }

}
