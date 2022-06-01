package PageObjectModel;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        /*HashMap<String,Integer> obj=new HashMap<String,Integer>();
        obj.put("Firstname",20);
        obj.put("secondname",2);
        System.out.println(obj.get("Firstname"));*/

        String country="america";
        HashMap<Character,Integer> map=new HashMap<>();

        map.put(null,1);
        map.put(null,2);
        map.put('s',null);
        map.put('n',null);
        System.out.println(map.get('s'));

        for (int i=0;i<=country.length()-1;i++){
            char ch=country.charAt(i);
            int count=1;
            if(map.containsKey(ch)){
                int exitstingcount=map.get(ch);
                exitstingcount=exitstingcount+1;
               // map.replaceAll(ch ,exitstingcount);
            }
            else{
                map.put(ch,count);
            }
        }
                for (int i=0;i<=country.length()-1;i++){
                char ch=country.charAt(i);
                System.out.println(ch+""+"is repeated"+" "+map.get(ch)+" "+"times");
                }
        }
}


