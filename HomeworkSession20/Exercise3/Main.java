package Exercise3;

public class Main {
    public static void main(String[] args) {

        Container<Integer> container = new Container<>();
        container.add(10);
        container.add(11);
        container.add(12);

        System.out.println("Printing elements in container: " + container.getElements());

        System.out.println("Calculating sum in container: " + container.sum());

        System.out.println("Printing the size of the container: " + container.size());

    }
}
