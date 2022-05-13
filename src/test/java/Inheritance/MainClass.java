package Inheritance;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class MainClass {
    public static void main(String[] args) {
     //   ParentClass obj1=new ParentClass(5);
        ChildClass obj=new ChildClass(2);
        int d=obj.addition();
      int c =obj.child();
        System.out.println(c);
        int e=obj.add(d);
        System.out.println(e);
        int f=obj.sub(d);
        System.out.println(f);




    }


}
