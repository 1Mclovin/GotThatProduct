package question4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your lucky number?");
        int luckyNumber = scanner.nextInt();

        System.out.println("What is your name??");
        String name = scanner.next();
        scanner.close();

        System.out.println("Your name is "+ name +" and you said your lucky number is "+ luckyNumber);




    }





}
