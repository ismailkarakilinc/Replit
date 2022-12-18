package Week08;

import java.util.Scanner;
import java.util.ArrayList;

public class Nanuk {

    public static boolean hunt(ArrayList<String> result,int wayStones,int boast) {







    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));

    }

}
