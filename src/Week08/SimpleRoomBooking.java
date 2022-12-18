package Week08;

import java.util.Scanner;

public class SimpleRoomBooking {

    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // WRITE YOUR CODE BELOW:


        if(month == 7 && 1 <= day && day<=8 && year == 2018 && isAvailable == false){
            isAvailable = true;
        } else if (month == 7 && 1 <= day && day<=8 && year == 2018 && isAvailable == true) {
           isAvailable = false;
        } else if ((month == 7 && day>8 && year == 2018) || (month != 7 && year == 2018) && isAvailable == false ) {
            isAvailable = false;
        } else if ((month == 7 && day>8 && year == 2018) || (month != 7 && year == 2018) && isAvailable == true) {
            isAvailable = true;
        } else if (year != 2018 && isAvailable == false){
            isAvailable = true;
        }else if (year != 2018 && isAvailable == true){
            isAvailable = false;
        }
        return isAvailable;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}
