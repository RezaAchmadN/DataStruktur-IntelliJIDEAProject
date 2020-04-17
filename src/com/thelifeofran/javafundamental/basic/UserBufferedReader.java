package com.thelifeofran.javafundamental.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Program Penjumlahan Sederhana juga");
        int value1 = 0;
        int value2= 0;
        try{
            System.out.print("Masukkan Anka Pertama : ");
            value1 = Integer.parseInt(br.readLine());

            System.out.print("Masukkan Angka Kedua :  ");
            value2 = Integer.parseInt(br.readLine());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        int hasil = value1 + value2;
        System.out.println("Hasilnya adalah : " + hasil);
    }
}
