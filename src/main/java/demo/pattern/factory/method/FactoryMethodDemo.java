package demo.pattern.factory.method;

import demo.pattern.factory.entity.Mouse;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        MouseFactory mf = new IBMMouseFactory();
        Mouse mouse = mf.createMouse();
        mouse.sayHi();
    }
}
