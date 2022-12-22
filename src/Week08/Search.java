package Week08;

import java.util.*;

public class Search {

    public static String search(ArrayList<String> strs, String find) {
        // complete the method

        String result = "";

        for (String each : strs) {
            if (each.equals(find)){
                result += each;
            }

        }
        if (result.isEmpty()){
            result = "search failed";
        }

        return result;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String find = in.next();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        System.out.println(search(list, find));
    }

}
