//Create a TreeSet<String> and add various city names.
// Display the cities in alphabetical order. Then try to display them in reverse alphabetical order.

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Ex9 {
    public static void main(String[] args) {

        Set<String> cities = new TreeSet<>();

        cities.add("Barcelona");
        cities.add("Londra");
        cities.add("Atena");
        cities.add("Paris");
        cities.add("Dublin");

        System.out.println("The cities in alphabetical order: ");
        for (String city : cities) {
            System.out.println(city);
        }

        Set<String> reversedCities = new TreeSet<>(Collections.reverseOrder());
        reversedCities.addAll(cities);

        System.out.println("----------------");
        System.out.println("Cities in reversed alphabetical order: ");
        for (String reversedCity : reversedCities) {
            System.out.println(reversedCity);
        }


    }
}
