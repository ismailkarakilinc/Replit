package Week08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static String lameDb(String db, String op, String id, String data) {

        List<String> words = Arrays.asList(db.split("#"));

        if (op.equals("add")){
            for (int i = Integer.parseInt(id)-1; i <words.size() ; i++) {
                words.set(Integer.parseInt(id)-1,id+data);
             //   words.set(i,words.get(Integer.parseInt(i-1)).substring(1));


            }
        }









        return null;
    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }

}
