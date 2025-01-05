//Implement an enum TrafficLight with a method next() that transitions between RED, YELLOW, and GREEN.

package Exercise8;

public class Main {

    public static void main(String[] args) {

        TrafficLight currentTrafficLight = TrafficLight.RED;


        for (int i = 0; i < 7 ; i++) {
            System.out.println("Current light: " + currentTrafficLight);
            currentTrafficLight = currentTrafficLight.next();

        }

    }
}
