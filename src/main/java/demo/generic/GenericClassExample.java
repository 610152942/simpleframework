package demo.generic;

import lombok.Data;

@Data
public class GenericClassExample<T> {
    //member这个成员变量的类型为T,T的类型由外部指定
    private T member;
    //泛型构造方法形参member的类型也为T，T的类型由外部指定
    public GenericClassExample(T member){
        this.member = member;
    }
    public T handleSomething(T target){
        return target;
    }
    public String sayHello(String name){
        return "Hello " + name;
    }
    public static <T> void printArray(T[] inputArray){
        for (T element : inputArray){
            System.out.printf("%s", element);
            System.out.printf(" ");
        }
        System.out.println();
    }
}
