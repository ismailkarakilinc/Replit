package Week08;

public class Lullia2 {

    public static void main(String[] args) {

        String[] arr1 = {"anna", "level", "Java"};
        String element;
        int result = 0;

        for (int i = 0; i < arr1.length; i++) {
                 element = arr1[i];
            //System.out.println(element);
            String reverseElement = "";
            for (int j = element.length()-1; j >= 0 ; j--){
                reverseElement += element.charAt(j);
            }
            //System.out.println(reverseElement);
            if (reverseElement.equals(element)){
                result++;
            }
        }
        System.out.println(result);
    }
}


