package Ramesh;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        String country="Chennaram";
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<=country.length()-1;i++){
            char ch=country.charAt(i);
            int count=1;
            if(map.containsKey(ch)){
                int existingcount=map.get(ch);
                existingcount=existingcount+1;
                map.replace(ch,existingcount);
            }
            else {
                map.put(ch,count);
            }
        }
        for (int i=0;i<=country.length()-1;i++){
            char ch=country.charAt(i);
            System.out.println(ch+" "+"is repeated"+" "+map.get(ch)+" "+"times");
        }



    }
}
