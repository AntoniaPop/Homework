package Exercise1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Box<Integer> mybox = new Box<>(10);
        mybox.printContent();

        Box<String> myNewBox = new Box<>("Merry Christmas");
        myNewBox.printContent();

        Box<Integer> mySecondBox = new Box<>(100);
        mySecondBox.setContent(230);
        System.out.println("The content of the second box after setting a new content: " + mySecondBox.getContent());

        myNewBox.clearBox();
        System.out.println("The content of the new box after clearing it: " + myNewBox.getContent());



    }
}