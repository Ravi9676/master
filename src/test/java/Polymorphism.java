public class Polymorphism {
    int a;
    public Polymorphism(){
        System.out.println("constructor without parameters");
    }
    public Polymorphism(int a){
        this.a=a;
        System.out.println("constructor with parameters"+a);
    }

    public int currency(){
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
    public int currency(int b) {
        int c = a + b;
        return c;
    }
    public float currency(float a,int b) {
       float c = a + b;
        return c;
    }
}
