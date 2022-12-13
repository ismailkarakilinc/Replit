package Week06;

import java.util.Scanner;

public class JavaAndPython {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        //WRITE YOUR CODE BELOW

        String java = "java";
        String python = "python";
        int countJava = 0;
        int countPython = 0;
        boolean result = true;

        for (int i = 0 ; i < sentence.length()-3 ; i++){
            if (sentence.substring(i,i+4).equals(java)){
                countJava++;
            }

        }
        for (int i = 0 ; i < sentence.length()-5 ; i++){

            if (sentence.substring(i,i+6).equals(python)){
                countPython++;
            }

            }
        if (countPython == countJava){
            System.out.println(result);
        }else {
            System.out.println(!result);
        }

    }
}
