package AccessModifiers;

public class ChildClass extends PolyClass{
    public int add(int a,int b) {
        int c = a + b;
        return c;

    }
    public interface BR{
        public int add();
    }

}
