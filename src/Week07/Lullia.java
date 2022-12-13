package Week07;

public class Lullia {

    public static void main(String[] args) {

        String [] names = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        //we need to check all names
        int counter = 0;
        for (String name : names) { //we need to get each name
            //get the first char
            char firstChar = name.toLowerCase().charAt(0); //we use toLowerCase because first is A last is a
            //get the last char
            char lastChar = name.toLowerCase().charAt(name.length()-1);
            if(firstChar == lastChar)
                counter++;
        }
        System.out.println(counter);
    }
}
