package Week07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Asdfg {

    public static void main(String[] args) {
        String str = "asdfg";


        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println(list);

        Collections.reverse(list);

        String[] arr = list.toArray(new String[list.size()]);

        System.out.println(Arrays.toString(arr));


        String result = "";

        result = Arrays.toString(arr).replace("[","");
        result = result.replace("","");
        result = result.replace(", ","");
        result = result.replace("]","");

        System.out.println(result);




    }
}

