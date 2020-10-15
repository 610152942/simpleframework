package demo.api.assignable;

public class AssignableDemo {
    public static void main(String[] args) {
        System.out.println("1.FirstClass.class.isAssignableFrom(FirstClass.class) : " + FirstClass.class.isAssignableFrom(FirstClass.class));
        System.out.println("2.FirstClass.class.isAssignableFrom(SecondClass.class) : " + FirstClass.class.isAssignableFrom(SecondClass.class));
        System.out.println("3.SecondClass.class.isAssignableFrom(FirstClass.class) : " + SecondClass.class.isAssignableFrom(FirstClass.class));
        System.out.println("4.FirstClass.class.isAssignableFrom(ThirdClass.class) : " + FirstClass.class.isAssignableFrom(ThirdClass.class));
        System.out.println("5.FirstClass.class.isAssignableFrom(UnrelevantClass.class) : " + FirstClass.class.isAssignableFrom(UnrelevantClass.class));

        System.out.println("6.FirstInterFace.class.isAssignableFrom(FirstInterFace.class)：" + FirstInterface.class.isAssignableFrom(FirstInterface.class));
        System.out.println("7.FirstInterFace.class.isAssignableFrom(SecondInterface.class)：" + FirstInterface.class.isAssignableFrom(SecondInterface.class));
        System.out.println("8.SecondInterface.class.isAssignableFrom(FirstInterface.class)：" + SecondInterface.class.isAssignableFrom(FirstInterface.class));
        System.out.println("9.FirstInterFace.class.isAssignableFrom(ThirdInterface.class)：" + FirstInterface.class.isAssignableFrom(ThirdInterface.class));
        System.out.println("10.FirstInterFace.class.isAssignableFrom(UnrelevantInterface.class)：" + FirstInterface.class.isAssignableFrom(UnrelevantInterface.class));

        System.out.println("ThirdInterface.class.isAssignableFrom(ThirdClass.class): " + ThirdInterface.class.isAssignableFrom(ThirdClass.class));
        System.out.println("FirstInterface.class.isAssignableFrom(ThirdClass.class): " + FirstInterface.class.isAssignableFrom(ThirdClass.class));
    }
}
