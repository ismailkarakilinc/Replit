package Week08;

import java.util.Scanner;

public class EachCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){

        char chr = 0;
        int lengthBefore = str.length();
        int lengthAfter ;
        int count = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            chr = str.charAt(i);
            if(str.contains(""+chr)){
                lengthAfter = str.replaceAll(""+chr,"").length();
            count = lengthBefore-lengthAfter;
           // str = str.replaceAll(""+str.charAt(i),"");
            
        }
            result += ""+count+chr;
            
    }

        return result;


    }
}

