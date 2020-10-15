package demo.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumStarvingSingleton {
    private EnumStarvingSingleton(){}
    public static EnumStarvingSingleton getInstance(){
        return ContainerHolder.HOLDER.instance;
    }
    private enum ContainerHolder{
        HOLDER;
        private EnumStarvingSingleton instance;
        ContainerHolder(){
            instance = new EnumStarvingSingleton();
        }
    }

//    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        Class clazz = ContainerHolder.class;
//        Constructor constructor = clazz.getDeclaredConstructor(String.class, int.class);
//        constructor.setAccessible(true);
//        System.out.println(EnumStarvingSingleton.getInstance());
//        System.out.println(constructor.newInstance());
//    }

}
