package Inheritance;

import javax.print.attribute.standard.PDLOverrideSupported;

public class MethodOverloading {
    public static void main(String[] args) {
        PolyClass obj=new PolyClass();
        PolyClass obj1=new PolyClass(10);
       int a= obj.currency(20);
     float b= obj.currency(2.5f,2);
     System.out.println(a);
     System.out.println(b);
    }
}
