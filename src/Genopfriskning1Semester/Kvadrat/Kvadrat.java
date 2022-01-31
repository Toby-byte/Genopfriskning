package Genopfriskning1Semester.Kvadrat;

import java.util.Scanner;

public class Kvadrat {
static Scanner scanner = new Scanner(System.in);

void createKvadrat(int randomNumberFromUser, String typeOfChar) {

    String lineString = "";

    for (int i = 0; i < randomNumberFromUser; i++) {
        lineString+=typeOfChar+" ";
    }
    for (int i = 0; i < randomNumberFromUser; i++) {
        System.out.println(lineString);
    }
}

public static void main(String[] args) {
        System.out.println("Please input a random number :)");
        Kvadrat kvadrat = new Kvadrat();
        int randomNumberFromUser = scanner.nextInt();
        scanner.nextLine();

        System.out.println("please input a character");
        String typeOfChar = scanner.nextLine();

        kvadrat.createKvadrat(randomNumberFromUser,typeOfChar);

    }
}
