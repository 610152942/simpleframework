package demo.pattern.factory.method;

import demo.pattern.factory.entity.IBMMouse;
import demo.pattern.factory.entity.Mouse;

public class IBMMouseFactory extends LenovoMouseFactory {
    @Override
    public Mouse createMouse(){
        return new IBMMouse();
    }
}
