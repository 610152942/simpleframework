package demo.pattern.factory.entity;

public class LenovoKeyboard implements Keyboard {
    @Override
    public void sayHello() {
        System.out.println("我是联想键盘");
    }
}
