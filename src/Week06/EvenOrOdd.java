package Week06;

public class EvenOrOdd {

    public static void main(String[] args) {


        String resultEven = "";
        String resultOdd = "" ;

        for (int i = 1 ; i <= 20 ; i++){
            if (i % 2 == 0){
                if (i==20){
                    resultEven+=i;
                } else {
                    resultEven += i + " ";
                }

            } else{
                if (i==19){
                    resultOdd += i;
                }else{
                    resultOdd += i + " ";
                }

            }

        }
        System.out.println(resultEven);
        System.out.println(resultOdd);

            }
        }
