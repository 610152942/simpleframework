package demo.generic;

public class GenericDemo {
    public static void handleMember(GenericClassExample<? super Integer> integerGenericClassExample) {
        Integer result = 111 + (Integer) integerGenericClassExample.getMember();
        System.out.println("result is " + result);
    }

    public static void main(String[] args) {
        GenericClassExample<String> stringExample = new GenericClassExample<String>("abc");
        GenericClassExample<Number> integerExample = new GenericClassExample<Number>(123);
        System.out.println(stringExample.getClass());
        System.out.println(integerExample.getClass());
        handleMember(integerExample);
        Integer[] integers = {1, 2, 3, 4, 5, 6};
        Double[] doubles = {1.1, 1.2, 1.3, 1.4, 1.5};
        Character[] characters = {'A', 'B', 'C'};
        stringExample.printArray(integers);
        stringExample.printArray(doubles);
        stringExample.printArray(characters);
    }
}
