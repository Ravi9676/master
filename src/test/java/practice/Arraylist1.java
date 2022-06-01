package practice;

import java.util.ArrayList;

public class Arraylist1 {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add("navya");
        for (int i=0;i<= obj.size()-1;i++){
            System.out.println(obj.get(i));
        }
        System.out.println(obj.get(0));
        System.out.println(obj.size());
    }
}
