package com.thelifeofran.javafundamental.basic;

import java.util.Scanner;

public class UserScanner {
    public static void main (String[] args){
        String value2,hasil;
        Integer value1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sederhana banget");
        System.out.print("Masukan Angka Pertama : ");
        value1 = scanner.nextInt();
        System.out.print("Masukan Angka Kedua : ");
        value2 = scanner.next();
        hasil = value1 + value2;
        System.out.println("Hasilnya adalah : " + hasil);
    }
}
