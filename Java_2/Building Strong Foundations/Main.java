import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int studentAge = 19;
        double studentGpa = 3.25;
        String studentFirstName = "Piyush";
        String studentLastName = "Razdan";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);
        boolean studentHasCovid = false;
        String studentName = "Raven";


        System.out.println(studentAge);
        System.out.println(studentGpa);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(studentHasCovid);
        System.out.println(studentName);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGpa);
        System.out.println("What do you want to update it to");

        Scanner input = new Scanner(System.in);
        studentGpa = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGpa);

    }
}
