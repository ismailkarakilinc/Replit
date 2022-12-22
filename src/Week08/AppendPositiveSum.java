package Week08;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPositiveSum {

    //create your method below

    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){

        int result = 0;

        ArrayList<Integer> list1 = new ArrayList<>();

        for (int each : list) {
            if (each > 0 ){
                list1.add(each);
            }

        }

        for (int each1 : list1 ) {

            result += each1;
        }
        list1.add(result);



        return list1;

    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }

}
