public class MainMethodOverloading {
    public static void main(String[] args) {
        Polymorphism obj=new Polymorphism();
        Polymorphism obj1=new Polymorphism(10);
        int a= obj.currency(10);
        float b=obj.currency(2.5f,2);
        System.out.println(a);
        System.out.println(b);
    }
}
