package week5;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        isPresentOptionalAPI();
        createEmptyOptionalObject();
        createEmptyOptionalObjectWithStaticAPI();
        ifPresentOptionalAPI();
        orElseOptionalAPI();
        orElseOptionalAPI();
        orElseGetOptionalAPI();
        orElseThrowOptionalAPI();
        getOptionalAPI();
    }

    // Returns an Optional with the specified present non-null value.
    private static void isPresentOptionalAPI() {
        Optional < String > opt = Optional.of("Ramesh");
        System.out.println(opt.isPresent());
    }

    // Returns an Optional with the specified present non-null value.
    private static void createEmptyOptionalObject() {
        Optional < String > empty = Optional.empty();
        System.out.println(empty.isPresent());

        // Optional object with the static of API:
        String name = "Ramesh";
        Optional.of(name);
    }

    private static void createEmptyOptionalObjectWithStaticAPI() {
        String name = "baeldung";
        Optional.of(name);
    }


    private static void ifPresentOptionalAPI() {

        String name = "Ramesh";
        if (name != null) {
            System.out.println(name.length());
        }

        Optional < String > opt = Optional.of("Ramesh");
        opt.ifPresent(str -> System.out.println(str.length()));
    }


    private static void orElseOptionalAPI() {

        String nullName = null;

        // If a value is present, invoke the specified consumer with the value, otherwise
        // do nothing.
        //
        String name = Optional.ofNullable(nullName).orElse("Ramesh");
        System.out.println(name);
    }

    private static void orElseGetOptionalAPI() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> "Ramesh");
        System.out.println(name);
    }
    private static void orElseThrowOptionalAPI() {

        // This will throw exception
        String nullName = null;
        String name = Optional.ofNullable(nullName)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(name);
    }

    private static void getOptionalAPI() {
        Optional < String > opt = Optional.of("Ramesh");
        String name = opt.get();
        System.out.println(name);
    }

}