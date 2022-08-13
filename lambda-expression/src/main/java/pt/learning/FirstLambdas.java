package pt.learning;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambdas {

    public static void main(String[] args) {

        // Supplier
        Supplier<String> supplier = () -> {
            System.out.println("I am inside the supplier.");
            return "Hello!";
        };

        String string = supplier.get();
        System.out.println("string = " + string);


        // Consumer
        Consumer<String> consumer = (String text) -> {
            System.out.println("I am inside the consumer.");
            System.out.println(text);
        };
        consumer.accept("Hello World!");

    }

}
