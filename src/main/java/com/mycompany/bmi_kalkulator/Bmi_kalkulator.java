package com.mycompany.bmi_kalkulator;

import java.util.Scanner;

public class Bmi_kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int jenis_kelamin, hasil;
            float berat, tinggi, bmi, meter;
            double broca;
 
        System.out.println("Menghitung Berat Badan");
        System.out.println("Jenis Kelamin: ");
        System.out.println("1. Laki-Laki");
        System.out.println("2. Perempuan");
       
            System.out.print("Masukan Jenis Kelamin: ");
            jenis_kelamin = in.nextInt();
            System.out.print("Masukan Berat Badan: ");
            berat = in.nextFloat();
            System.out.print("Masukan Tinggi Badan: ");
            tinggi = in.nextFloat();
            meter = tinggi / 100;
       
        bmi = (berat/(meter * meter));
 
        System.out.print("BMI: " + bmi + " ");
        if (bmi < 19){
            System.out.println("Kurus");
        } else if (bmi <= 23){
            System.out.println("Normal");
        } else if (bmi < 25){
            System.out.println("Gemuk");
        } else {
            System.out.println("Obesitas");
        }
        
        switch (jenis_kelamin)
        {
            case 1 : broca = ((tinggi-100)-(0.10 * (tinggi-100))); break;
            case 2 : broca = ((tinggi-100)-(0.15 * (tinggi-100))); break;
                default : broca = 0;
        }
     
    }
}
