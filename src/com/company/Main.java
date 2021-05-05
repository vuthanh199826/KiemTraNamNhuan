package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap nam can kiem tra vao day");
        int year = sc.nextInt();
        boolean check = false;
        if (year % 4 == 0 && year % 100 != 0) {
            check = true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            check = true;
        }
        if (check == true) {
            System.out.println(" nam " + year + "la nam nhuan");
        } else {
            System.out.println(" nam " + year + "la nam khong nhuan");
        }
    }
}
