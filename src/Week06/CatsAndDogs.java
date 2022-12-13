package Week06;

import java.util.Scanner;

public class CatsAndDogs {

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        String cat = "cat";
        String dog = "dog";
        int catCount = 0;
        int dogCount = 0;

        boolean result = true;

        for (int i = 0; i < str.length()-2; i++) {

            if (str.substring(i,i+3).equals(cat)){
                catCount++;
            }
            if (str.substring(i,i+3).equals(dog)){
                dogCount++;
            }


        }
        if (dogCount==catCount){
            System.out.println(result);
        }else {
            System.out.println(!result);
        }

    }
}
