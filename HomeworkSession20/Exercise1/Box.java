package Exercise1;
//Create a generic class Exercise1.Box<T> that can store a single item of any type.
// Add methods to set, get, and clear the item.

public class Box <T> {

    private T content;


    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content){
        this.content = content;

    }

    public void clearBox(){
        this.content = null;
    }

    public void printContent() {
        System.out.println(content);
    }

}
