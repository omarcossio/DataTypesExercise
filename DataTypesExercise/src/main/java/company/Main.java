package company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;

        String studentFirstName = "Omar";
        String studentLastName = "Cossio";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println(studentFirstInitial + " " + studentLastName + " has GPA of: " + studentGPA);
        System.out.println("What do you want ot change it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + "now has a GPA of: " + studentGPA);
    }
}
