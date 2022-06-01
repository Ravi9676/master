package AccessModifiers;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Child2 extends Parent {
    public int mul(){
        int a= super.add(10,20);
        int mul=a*5;
        return mul;
    }

}
