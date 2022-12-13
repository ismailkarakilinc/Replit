package Week07;

public class Diving {

  static String studentName = "Mike";
  static {
      studentName = "Jordan";
  }

    public static void main(String[] args) {
        studentName = "Jean";
        System.out.println(studentName);
    }
    }

