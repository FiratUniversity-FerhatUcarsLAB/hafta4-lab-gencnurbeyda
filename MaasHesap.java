
/*
 * Ad Soyad: Nur Beyda GENÇ
 * Ogrenci No: 250541032
 * Tarih: 05.11.2025
 * Aciklama: Çalışan bilgilerini alıp detaylı maaş bordrosu oluşturan program.
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        // --- Sabit Tanımlamalar (Zorunlu) ---
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;
        final int STANDART_AYLIK_SAAT = 160;
        final double MESAI_CARPANI = 1.5;
        final int STANDART_AYLIK_IS_SAATI = 176;
        final int STANDART_AYLIK_IS_GUNU = 22;

        Scanner input = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("MAAS HESAPLAMA SISTEMI GIRIS");
        System.out.println("====================================");

  

       
        System.out.print("Calisan Ad Soyadini Girin: ");
        String adSoyad = input.nextLine();

       
        System.out.print("Aylik Brut Maas (TL): ");
        double brutMaas = input.nextDouble();

        
        System.out.print("Haftalik Calisma Saati: ");
        int haftalikCalismaSaati = input.nextInt();

        
        System.out.print("Toplam Mesai Saati Sayisi: ");
        int mesaiSaati = input.nextInt();

        input.close();

        
        
        double saatlikBrutUcret = brutMaas / STANDART_AYLIK_SAAT;
        double mesaiUcreti = saatlikBrutUcret * mesaiSaati * MESAI_CARPANI;
        double toplamGelir = brutMaas + mesaiUcreti;

        
        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisiKesintisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisiKesintisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi + gelirVergisiKesintisi + damgaVergisiKesintisi;

        
        double netMaas = toplamGelir - toplamKesinti;

        
        double kesintiOraniYuzde = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / STANDART_AYLIK_IS_SAATI;
        double gunlukNetKazanc = netMaas / STANDART_AYLIK_IS_GUNU;


        
        final String CIZGI = "----------------------------";

        System.out.println("\n====================================");
        System.out.println("MAAS BORDROSU");
        System.out.println("====================================");

        
        System.out.printf("%-28s %s\n", "Calisan:", adSoyad);

        
        System.out.println("\nGELIRLER:");
        System.out.printf("%-28s : %.2f TL\n", "Brut Maas", brutMaas);
        
        System.out.printf("%-28s : %.2f TL\n", "Mesai Ucreti (" + mesaiSaati + " saat)", mesaiUcreti);
        System.out.println(CIZGI);
        System.out.printf("%-28s : %.2f TL\n", "TOPLAM GELIR", toplamGelir);

        
        System.out.println("\nKESINTILER:");
        
        System.out.printf("%-28s : %.2f TL\n", "SGK Kesintisi (" + String.format("%.1f", SGK_ORANI * 100) + "%)", sgkKesintisi);
        System.out.printf("%-28s : %.2f TL\n", "Gelir Vergisi (" + String.format("%.1f", GELIR_VERGISI_ORANI * 100) + "%)", gelirVergisiKesintisi);
        
        System.out.printf("%-28s : %.2f TL\n", "Damga Vergisi (" + String.format("%.1f", DAMGA_VERGISI_ORANI * 100) + "%)", damgaVergisiKesintisi);
        System.out.println(CIZGI);
        System.out.printf("%-28s : %.2f TL\n", "TOPLAM KESINTI", toplamKesinti);

        
        System.out.println("\n----------------------------");
        System.out.printf("%-28s : %.2f TL\n", "NET MAAS", netMaas);
        System.out.println("====================================");

        
        System.out.println("\nISTATISTIKLER:");
        
        System.out.printf("%-28s : %.2f %%\n", "Toplam Kesinti Orani", kesintiOraniYuzde);
        
        System.out.printf("%-28s : %.2f TL\n", "Saatlik Net Kazanc", saatlikNetKazanc);
        System.out.printf("%-28s : %.2f TL\n", "Gunluk Net Kazanc", gunlukNetKazanc);
        System.out.println("====================================");
    }
}
