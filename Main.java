package sample;

/*

 */

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plus plus = new Plus();
        System.out.println("Result of Plus operation - "+plus.plus(6, 7));
        Minus minus = new Minus();
        System.out.println("Result of Minus operation - " + minus.minus(3, 9));
        Division division = new Division();
        System.out.println("Result of Division operation - " + division.division(3, 0));
        Multiplication multiplication = new Multiplication();
        System.out.println("Result of Multiplication operation - " + multiplication.multiplication(6, 4));



    }
}