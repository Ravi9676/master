package Inheritance;

import net.bytebuddy.implementation.bind.annotation.Super;

public class ChildClass  extends ParentClass{

    public ChildClass(int a) {
        super(a);

    }
    public int child(){
        int a=super.addition();
        int b=a+10;
       return b;
    }
    public int add(int a){
        int b=a+10;
             return b;
    }
    public int sub(int a){
        int b=a-2;
        return b;
    }
}
