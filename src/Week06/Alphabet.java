package Week06;

public class Alphabet {

    public static void main(String[] args) {

        String result = "";
        String result1 = "";

        for (char i ='A' ; i <= 'Z' ; i++){

            result += i;
        }
        System.out.println(result);

        for (char j = 'Z' ; j >= 'A' ; j--){
            result1 += j;

    }
        System.out.println(result1.toLowerCase());
}
}
