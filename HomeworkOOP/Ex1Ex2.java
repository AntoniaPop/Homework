import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ex1Ex2 {
    public static void main(String[] args) {

        //Create a List<Integer> and populate it with random integers. Sort the list in ascending and descending order.

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(1);
        list.add(27);
        list.add(4);

        for (Integer value : list) {
            System.out.println(value);
        }

        Collections.sort(list);
        System.out.println("Printing in ascending order: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Printing in descending order: " + list);
        System.out.println("---------------");


        //Take a sentence as input, split it into words, and store the words in a List<String>.
        // Remove duplicate words and display the list in alphabetical order.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentece:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        List<String> wordList = new ArrayList<>(wordSet);

        Collections.sort(wordList);
        System.out.println("The unique words in alphabetical order are: " + wordList);

        System.out.println("--------------");









    }
}