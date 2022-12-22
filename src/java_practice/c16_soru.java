package java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class c16_soru {
  static   List<String> urunList=new ArrayList<>(Arrays.asList("Portakal","Mandalina","Elma","Ispanak","Muz"));
   static List<Integer> fiyatList=new ArrayList<>(Arrays.asList(10,12,15,10,18));
static double toplam;

    public static void main(String[] args) {

        List<String> urunList=new ArrayList<>(Arrays.asList("Portakal","Mandalina","Elma","Ispanak","Muz"));
        List<Integer> fiyatList=new ArrayList<>(Arrays.asList(10,12,15,10,18));
        System.out.println("===DOYARAN MARKET===");

menu();

    }public static void menu(){
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println(i+1+".urun "+urunList.get(i)+" fiyatı :"+fiyatList.get(i));

        }
        System.out.println("secmek istediğiniz ürün kodunu giriniz");
        int urun=scan.nextInt();
        System.out.println("miktar giriniz :");
        double miktar=scan.nextDouble();
        toplam+=miktar*fiyatList.get(urun-1);

        System.out.println("alışverişe devam etmek istiyormusunuz?  E/H");
        char secim=scan.next().charAt(0);

        if (secim=='e' || secim=='E'){
            menu();
        }else
            System.out.println("ödenecek tutar :"+toplam);








    }
}
