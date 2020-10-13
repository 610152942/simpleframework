package demo.pattern.factory.method;

import demo.pattern.factory.entity.LenovoMouse;
import demo.pattern.factory.entity.Mouse;

public class LenovoMouseFactory  implements MouseFactory{
    @Override
    public Mouse createMouse() {
        return new LenovoMouse();
    }
}
