package Inheritance;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class PmainClass {
    public static void main(String[] args) {
        Class obj=new Class();
        int c=obj.add(2,3);
        System.out.println(c);
       float d= obj.add(2.5f,1.5f);
       System.out.println(d);
       Polymorphism obj1=new Class();
       int f=obj1.add(10,20);
       System.out.println(f);



    }
}
