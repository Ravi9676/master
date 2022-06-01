package Ramesh;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class NameChange {
    public static void main(String[] args) {
        String output="";
        String s1="My name is Naveen  ";
       // System.out.println(s1.replaceAll("Naveen","Ramesh"));
        System.out.println(s1.indexOf('N',4));
        int position=s1.indexOf("name");
        int endposition=s1.indexOf("Naveen");
        System.out.println(s1.substring(position));
        System.out.println(s1.substring(position,endposition));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replaceAll(" ",""));
        System.out.println(s1.trim());
        System.out.println(s1.charAt(3));
        char[] ch=s1.toCharArray();
        System.out.println(ch.length);System.out.println(ch[3]);
        System.out.println(s1.lastIndexOf(s1));
        String[] s2=s1.split(" ");
        for(int i=0;i<=s2.length-1;i++){
            if (s2[i].equalsIgnoreCase("naveen")){
                s2[i]="Ramesh";
            }
            output=output+" "+s2[i];
        }
        System.out.println(output);
    }
}
