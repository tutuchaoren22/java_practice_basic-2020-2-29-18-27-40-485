package java;


import java.util.function.Consumer;
import java.util.function.Function;

public class App {

    public static void main(String[] args) {
        // write your code here
        Square square = i -> i * i;
        System.out.println(getSquare(square, 3));

        Function<Integer, Integer> function = i -> i * i;
        System.out.println(getSquare(function, 3));

        AddString addString = s -> System.out.println("*" + s + "*");
        addString(addString, "hello");

        Consumer<String> consumer = s -> System.out.println("*" + s + "*");
        addString(consumer, "hello");
    }

    public static int getSquare(Square square, int i) {
        return square.getSquare(i);
    }

    public static Integer getSquare(Function<Integer, Integer> function, Integer i) {
        return function.apply(i);
    }


    public static void addString(AddString addString, String s) {
        addString.addString(s);
    }

    public static void addString(Consumer consumer, String s) {
        consumer.accept(s);
    }
}
