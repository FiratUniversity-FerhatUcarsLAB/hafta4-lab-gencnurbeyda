
/*
 * Ad Soyad: Nur Beyda GENÇ
 * Ogrenci No: 250541032
 * Tarih: 05.11.2025
 * Aciklama: Kullanıcıdan öğrenci bilgilerini (Ad, Soyad, No, Yaş, GPA) alan ve ekrana düzenli formatta yazdıran program.
 */

import java.util.Scanner;

public class OgrenciBilgi{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        final double MIN_BASARI_GPA = 2.00;

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        

        
        System.out.print("Adinizi girin: ");
        String ad = input.next();

        
        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();

       
        
        System.out.print("Ogrenci numaraniz: ");
        int ogrNo = input.nextInt();

        
        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        
        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        
        input.close();

        

        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");

        
        System.out.printf("%-20s %s %s\n", "Ad Soyad:", ad, soyad);
        System.out.printf("%-20s %d\n", "Ogrenci No:", ogrNo);
        System.out.printf("%-20s %d\n", "Yas:", yas);

        
        System.out.printf("%-20s %.2f\n", "GPA:", gpa);

        
        System.out.print("%-20s ".formatted("Durum:"));
        if (gpa >= MIN_BASARI_GPA) {
            System.out.println("Basarili Ogrenci");
        } else {
            System.out.println("Basarisiz Ogrenci");
        }
        System.out.println("===============================");
    }
