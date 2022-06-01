package AccessModifiers;

public class Child1 extends ClassA{
    public int sub(){
        int a=super.add(10,20);
        int sub=a-5;
        return sub;
    }

}
