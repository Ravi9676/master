package Ramesh;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<Integer>();
       // obj.get(1).toString();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);
       // obj.add("Ramesh");
        for(int i=0;i<=obj.size()-1;i++){
            System.out.println(obj.get(i));
        }

        System.out.println(obj.get(0));
        HashMap<String,Integer> obj1=new HashMap<String,Integer>();
        obj1.put("Firstname",10);
        obj1.put("secondname",2);

        System.out.println(obj1.get("Firstname"));



    }

}
