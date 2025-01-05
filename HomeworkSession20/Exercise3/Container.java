//Design a Container<T> class that accepts only types that extend Number.
// Add methods to calculate the sum of all elements.

package Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Container <T extends Number> {

    private List<T> elements;

    public Container() {
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        elements.add(element);

    }

    public int sum(){
        int sum = 0;
        for (T element : elements) {
            sum += element.intValue();
        }
        return sum;
    }

    public int size(){
        return elements.size();
    }

    public List<T> getElements(){
        return elements;

    }



}
