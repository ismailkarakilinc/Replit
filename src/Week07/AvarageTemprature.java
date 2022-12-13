package Week07;

import java.util.Scanner;

public class AvarageTemprature {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps

        // from saim: please update to use a loop to have a different sized arrays

        double total = 0.0;
        double result ;

        for (double each : temps) {
            total += each;
        }
        result = total / temps.length;

        System.out.println(result);



    }
}
