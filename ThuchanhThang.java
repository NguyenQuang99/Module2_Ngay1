package ThuchanhTinhsongaytrongthang;

import java.util.Scanner;

public class month {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which month that you want to count days ? ");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                System.out.println("Thang 2 co 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngay");
                break;
        }

    }
}
