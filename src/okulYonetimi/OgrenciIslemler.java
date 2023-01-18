package okulYonetimi;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgrenciIslemler implements Islemler {
Scanner scan=new Scanner(System.in);
static ArrayList<Ogrenci> ogrenciListesi=new ArrayList<>();
static int no=100;
void ogrenciMenu(){
    System.out.println("============= İŞLEMLER =============\n" +
            "\t\t 1-EKLEME\n" +
            "\t\t 2-ARAMA\n" +
            "\t\t 3-LİSTELEME\n" +
            "\t\t 4-SİLME\n" +
            "\t\t Q-ÇIKIŞ\n" +
            "\n" +
            "\tSEÇİMİNİZ:");
    int secim=0;
    try {
        secim=scan.nextInt();
        switch (secim){
            case 1:{
                ekleme();
                break;
            }
            case 2:{
                arama();
                break;
            }
            case 3:{
                listeleme();
                break;
            }
            case 4:{
                silme();
                break;
            }
            default:{
                System.out.println("yanlis secim");
                ogrenciMenu();
            }
        }

    }catch (InputMismatchException e){
        String islem=scan.nextLine();
        if (islem.equalsIgnoreCase("q")){
            AnaMenu anamenu=new AnaMenu();
            anamenu.menu();
        }else {
            System.out.println("yanlış secim");
            ogrenciMenu();
        }
    }
}






    @Override
    public void ekleme() {
        scan.nextLine();
        System.out.print("ogrencinin adini giriniz");
        String ad=scan.nextLine();
        System.out.print("ogrencinin soyadini giriniz");
        String soyad=scan.nextLine();
        System.out.print("ogrencinin tc no sunu giriniz");
        String tcNO=scan.nextLine();
        System.out.print("ogrencininn yasini giriniz");
        int yas=scan.nextInt();
        scan.nextLine();
        System.out.print("ogrencinin sinifini giriniz");
        String sinif=scan.nextLine();
        Ogrenci ogrenci=new Ogrenci(ad,soyad,tcNO,yas,no++,sinif);
        ogrenciListesi.add(ogrenci);
        System.out.println(ogrenciListesi);
        ogrenciMenu();

    }

    @Override
    public void arama() {
        System.out.println("aranacak kisinin tc no sunu giriniz");
        String tcNo=scan.next();
        boolean kontrol=true;
        for (Ogrenci each:ogrenciListesi
        ) {
            if (each.getTcNo().equals(tcNo)){
                System.out.println(each);
                kontrol=false;

            }
        }
        if (kontrol){
            System.out.println(tcNo+" boyle bir tc nolu kişi yok");
            arama();
        }
        ogrenciMenu();

    }

    @Override
    public void listeleme() {
        for (Ogrenci each:ogrenciListesi
             ) {
            System.out.println(each);
        }
ogrenciMenu();
    }

    @Override
    public void silme() {
        System.out.println("silinecek kisinin tc no sunu giriniz");
        String tcNo=scan.next();
        for (int i = 0; i <ogrenciListesi.size() ; i++) {
            if (ogrenciListesi.get(i).getTcNo().equals(tcNo)){
                System.out.println("silinecek ogrenci"+ogrenciListesi.get(i));
                ogrenciListesi.remove(i);
            }


        }
        ogrenciMenu();
    }
}
