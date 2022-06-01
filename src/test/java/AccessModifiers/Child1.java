package AccessModifiers;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Child1 extends Parent {
    public int sub(){
        int a= super.add(10,20);
        int sub=a-5;
        return sub;
    }
}
