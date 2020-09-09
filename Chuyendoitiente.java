package Chuyendoitiente;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.print("Nhập tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Giá trị tiền việt" + quydoi);
    }
}
