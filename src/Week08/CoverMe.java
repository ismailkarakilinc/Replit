package Week08;

import java.util.Scanner;

public class CoverMe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverMe) {
        // your code here

        String result = "";
        String expect = "["+ coverMe + "]" ;

        if(main.contains(coverMe)){
            result = main.replaceAll(coverMe,expect);
        }else {
            result = "["+main+"]";
        }

        return result;
    }

}

