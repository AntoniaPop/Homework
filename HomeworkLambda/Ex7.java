//Define a functional interface StringCombiner with a method String combine(String s1, String s2)
//and use a lambda to concatenate two strings with a space in between.

public class Ex7 {
    public static void main(String[] args) {

        String firstString = "Apple";
        String secondString = "pie";

        StringCombiner concatenateNewString  = (a,b) -> (a + " " + b);
        String thirdString = concatenateNewString.stringCombine(firstString, secondString);
        System.out.println(thirdString);

    }

    @FunctionalInterface
    interface StringCombiner {
        String stringCombine(String s1, String S2);

    }
}
