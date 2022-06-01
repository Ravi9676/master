package PageObjectModel;

import java.util.HashMap;
import java.util.Map;

public class map1 {
    public static void main(String[] args) {
        HashMap<String,Integer>abc=new HashMap<String, Integer>();
        abc.put(null,60);
        abc.put("shankar",100);
        abc.put("ravi",98);
        abc.put(null,50);
        abc.put("india",1);
        abc.put("naveen",null);
        abc.put("lakshmi",70);
      //  abc.put(null,null);
      //  System.out.println(abc);
        //abc.forEach((K,V)->System.out.println(K+":"+V));
        /*for(Map.Entry<String,Integer> item:abc.entrySet()){
            String key= item.getKey();
            int value=abc.get(key);
            System.out.println(value);
        }*/
        for(String key:abc.keySet()){
            System.out.println(abc.get(key));
        }
    }
}
