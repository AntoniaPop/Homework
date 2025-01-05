package Exercise2;

public class Main {
    public static void main(String[] args) {

        Pair<String,Integer> pair = new Pair<>("Age", 24);

        System.out.println(pair.toString());

        pair.setKey("New age: ");
        pair.setValue(25);
        System.out.println("Updating details after one year: " + pair.getKey() + pair.getValue());
    }
}
