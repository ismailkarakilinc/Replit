package Week08;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
public class CombineArrays {

    public static ArrayList<String> combine(String[] r1, String[] r2){

        // your code here

        ArrayList<String>  result =  new ArrayList<>();

        for (String each : r1) {
            result.add(each);
        }
        for (String each1 : r2) {
            result.add(each1);
        }

        return result;






    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combine(strs,strs2));

    }
}
