package demo.pattern.factory.entity;

import demo.annotation.TestAnnotation;

public class HpMouse  implements Mouse {
    @Override
    @TestAnnotation
    public void sayHi() {
        System.out.println("我是惠普鼠标");
    }
}