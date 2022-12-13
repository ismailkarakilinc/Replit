package Week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShortestWords {

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW


        String[] words = str.replace(" ","").split(",");
        String result = "";

        String str1 = words[0];

        for (String each : words) {
            if (each.length()<str1.length()){
                str1 = each;
            }
        }
        int min = str1.length();

        for (String each1 : words) {
            if (each1.length() == min){
                result += each1+",";
            }
        }
        String[] output = result.split(",");

        System.out.println(Arrays.toString(output));



    }
}
/*
for (int j = i+1; j < word.length-1 ; j++) {

            if (word[i].length()<word[j].length()){

                }
            result = word[i];
            }
        }
        System.out.println(result);

        =============================================================
         for (String each1 : words){
            if (each1.length() == str1.length()){
                System.out.print(each1);
            }

        }
 */
