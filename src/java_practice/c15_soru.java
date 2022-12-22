package java_practice;

import java.util.Scanner;
import java.util.function.BiFunction;

public class c15_soru {
    public static void main(String[] args) {
        /*
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor. 2. Adim :
         * Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari
         * goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi bitirmek isteyene
         * kadar tekrarla. 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini
         * toplam fiyata ekle. 4. Adim : Alisveris bitince toplam odemesi gereken tutari
         * goster.
         *
         */
        Scanner scan=new Scanner(System.in);
        int elma=5;
        int armut=10;
        int muz=20;
        int ayva=15;
        int mandalina=12;
        String urun="";

        double kilo=0;
        String bitis="q";
        double toplam=0;
        do {
            System.out.println("almak istediginiz urunu(elma,armut,muz,ayva,mandalina) seklinde yazınız" +
                    "\n ürünleriniz bittiginde 'q' ya basınız");
            urun=scan.next();
            if (urun.equalsIgnoreCase(bitis))break;
            System.out.println("kac kilo istersiniz");
            kilo=scan.nextDouble();
            if (kilo<=0){
                System.out.println("hatalı giris");
            }
            if (urun.equalsIgnoreCase("elma")){
                toplam+=kilo*elma;
            }else   if (urun.equalsIgnoreCase("armut")){
                toplam+=kilo*armut;
            }else if (urun.equalsIgnoreCase("muz")){
                toplam+=kilo*muz;
            }else if (urun.equalsIgnoreCase("ayva")){
                toplam+=kilo*ayva;
            }else if (urun.equalsIgnoreCase("mandalina")){
                toplam+=kilo*mandalina;
            }else
                System.out.println("hatali giris");




        }while (!urun.equalsIgnoreCase(bitis));

        System.out.println("aldiginiz urunler toplami :"+toplam+"TL");

    }
}
