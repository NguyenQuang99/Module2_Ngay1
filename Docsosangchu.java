package Ungdungdocsothanhchu;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadNumberToWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số cần đọc");
        int number = sc.nextInt();
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = (number % 100) % 10;
        switch (number) {
            case 0 :
                System.out.println("zero");
                break;
            case 1 :
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("Out of ability");

        }
        if(number>= 10 && number < 20) {
            switch (ones) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        }
        if(number >=20 && number < 100) {
            System.out.println( tens + ones);

            switch (tens) {
                case 2:
                    System.out.println("twenty");
                    break;
                case 3:
                    System.out.println("thirty");
                    break;
                case 4:
                    System.out.println("forty");
                    break;
                case 5:
                    System.out.println("fifty");
                    break;
                case 6:
                    System.out.println("seventy");
                    break;
                case 7:
                    System.out.println("eighty");
                    break;
                case 9:
                    System.out.println("ninety");
                    break;
            }
            switch (ones) {
                case 0:
                    System.out.println();
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }

        }
        if(number >=100) {
            System.out.println(hundreds + tens + ones);

            switch (hundreds) {
                case 1:
                    System.out.println("one hundred");
                    break;
                case 2:
                    System.out.println("two hundred");
                    break;
                case 3:
                    System.out.println("three hundred");
                    break;
                case 4:
                    System.out.println("four hundred");
                    break;
                case 5:
                    System.out.println("five hundred");
                    break;
                case 6:
                    System.out.println("six hundred");
                    break;
                case 7:
                    System.out.println("seven hundred");
                    break;
                case 8:
                    System.out.println("eight hundred");
                    break;
                case 9:
                    System.out.println("nine hundred");
                    break;
            }
            switch (tens) {
                case 1:
                    System.out.println("ten");
                    break;
                case 2:
                    System.out.println("twenty");
                    break;
                case 3:
                    System.out.println("thirty");
                    break;
                case 4:
                    System.out.println("forty");
                    break;
                case 5:
                    System.out.println("fifty");
                    break;
                case 6:
                    System.out.println("seventy");
                    break;
                case 7:
                    System.out.println("eighty");
                    break;
                case 9:
                    System.out.println("ninety");
                    break;
            }
            switch (ones) {

                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }


        }

    }
}
