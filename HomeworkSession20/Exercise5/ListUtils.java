
//Create a generic class ListUtils with a method countGreaterThan(List<T> list, T element)
// that counts how many elements in the list are greater than the given element.

package Exercise5;

import java.util.List;

public class ListUtils<T> {

    public static <T extends Comparable<T>> int countGreaterThan(List<T> list, T element) {
        if (list == null || element == null) {
            System.out.println("List and element can't be null");
        }

        int count = 0;
        for (T number : list) {
            if(number.compareTo(element) > 0){
                count++;
            }

        }
        return count;
    }
}
