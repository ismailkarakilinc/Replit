package Week08;

import java.util.ArrayList;
import java.util.Scanner;

public class Fuel {

    public static int refuels(ArrayList<Integer> deliveries, int gasTank) {

        int total = 0;

        for (int each : deliveries) {
            if (each<gasTank){
                total += 1;
            }else {
            total += each/gasTank;
        }
        }



        return total;
    }



    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuels(list, fuel));

    }

}
