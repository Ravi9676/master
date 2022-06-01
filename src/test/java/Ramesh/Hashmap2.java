package Ramesh;

import java.util.HashMap;

public class Hashmap2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        map.put(null,60);
        map.put("navya",100);
        map.put("ramesh",90);
        map.put("us",80);
        map.put(null,20);
        map.put("naveen",null);
        map.put("navya",70);
        map.put("laxmi",null);
        //map.put(null,null);
       // System.out.println(map);
       map.forEach((k,v)->System.out.println(k+":"+v));
        /*for(String key:map.keySet()){
            System.out.println(map.get(key));
        }*/

    }

}
