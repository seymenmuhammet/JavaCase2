package com.example.javacase2.study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Functions functions = new Functions();

        //1.Problem
        System.out.print("Km değerini giriniz:");
        double km = scanner.nextDouble();
        Double mil = functions.convertMil(km);
        System.out.println(km +" km "+mil + " mil eder.");

        //2. Problem
        System.out.print("Dikdörtgenin uzun kenarını giriniz:");
        double longEdge = scanner.nextDouble();
        System.out.print("Dikdörtgenin kısa kenarını giriniz:");
        double shortEdge = scanner.nextDouble();
        double area = functions.rectangleArea(shortEdge,longEdge);
        System.out.println("Dikdörtgenin alanı: "+area);

        //3.Problem
        System.out.print("Faktoriyeli alınacak sayıyı giriniz:");
        int number = scanner.nextInt();
        int result = functions.factorial(number);
        System.out.println(number + " sayısının faktoriyeli: "+result);

        //4.Problem
        System.out.print("Bir kelime girin: ");
        String word = scanner.next();
        int count = functions.totalE(word);
        System.out.println(word + " kelimesinde " + count + " adet E harfi vardır.");

        //5.Problem
        System.out.print("Kenar sayısını giriniz: ");
        int edge = scanner.nextInt();
        int interiorAngle = functions.totalAngle(edge);
        System.out.println("Kenar sayısı " + edge + " olan düzgün çokgenin her bir iç açısı: " + interiorAngle + " derecedir.");

        //6.Problem
        System.out.print("Maaş hesaplanacak gün sayısını giriniz: ");
        int day = scanner.nextInt();
        int salary = functions.totalSalary(day);
        System.out.println(day+" gün için maaşınız " +salary+" TL");

        //7.Problem
        System.out.println("Arabanızı kaç saat park edeceksiniz? :");
        int hour = scanner.nextInt();
        int fee = functions.parkingFee(hour);
        System.out.println("Otopark ücreti: " + fee + " TL");

    }
}
