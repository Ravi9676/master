package Ramesh;

public class Child extends Parent {

    public Child(int a) {
        super(a);
    }
    public int childproperty(){
        int a=super.addition();
       int b=a+10;
        return b;
    }
}
