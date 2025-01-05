import java.io.CharArrayReader;
import java.util.*;

//Create a List<Character> with random alphabet characters. Sort the list ignoring case and display it.
public class Ex6 {
    public static void main(String[] args) {

       List<Character> characterList = new ArrayList<>();
//
//        for(char c = 'A'; c <= 'Z'; c++ ){
//            characterList.add(c);
//            characterList.add(Character.toLowerCase(c));
//        }
//        System.out.println(characterList);

        // OR

        characterList.add('A');
        characterList.add('N');
        characterList.add('T');
        characterList.add('O');
        characterList.add('N');
        characterList.add('I');
        characterList.add('A');

        Set<Character> charSet = new HashSet<>(characterList);
        List<Character> newcharacterList = new ArrayList<>(charSet);


        Collections.sort(newcharacterList);
        System.out.println(newcharacterList);


    }
}
