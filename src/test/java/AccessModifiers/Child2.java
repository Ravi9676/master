package AccessModifiers;

public class Child2 extends ClassA{
    public int mult(){
        int a=super.add(10,20);
        int mult=a*5;
        return mult;

    }
}
