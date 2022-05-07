package Inheritance;

import net.bytebuddy.implementation.bind.annotation.Super;

public class ChildClass  extends ParentClass{
    int a=super.addition();
    public ChildClass(int a) {
        super(a);

    }
    public int child(){
        //a=super.addition();
        int b=a+10;
       return b;
    }
    public int add(int c){
        int b=a+10;
             return b;
    }
    public int sub(int a){
        int b=a-2;
        return b;
    }
}
