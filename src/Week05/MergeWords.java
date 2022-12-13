package Week05;

import java.util.Scanner;

public class MergeWords {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        //WRITE YOUR CODE BELOW

        int merge = 3;
        String word10 = word1.substring(0,1);
        String word11 = word1.substring(1,2);
        String word12 = word1.substring(2);
        String word20 = word2.substring(0,1);
        String word21 = word2.substring(1,2);
        String word22 = word2.substring(2);

        if (word1.length() == merge && word2.length()==merge){
            System.out.println(word10+word20+word11+word21+word12+word22);
        }else {
            System.out.println("cannot merge");
        }

    }
}
