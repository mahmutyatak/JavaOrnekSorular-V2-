package java_practice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Menu {

    Scanner scan=new Scanner(System.in);
    static int numara=1000;
    ArrayList<Kayit> ogrList=new ArrayList<>();
    void islemler(){
        System.out.println("============= İŞLEMLER =============");
        System.out.println("Yapma istediğiniz işlemi giriniz\n1-Ekleme\n2-Arama\n3-Listeleme\n4-Silme\nQ-Cikis ");

        try {
            int secim=scan.nextInt();
            switch (secim){
                case 1:{
                  ekleme1();

                } case 2:{
                    System.out.println("aranacak ogrncinin tc no sunu giriniz");
                    arama(scan.next());

                } case 3:{
                    listeleme();


                } case 4:{
                    silme();

                } default:{
                    System.out.println("hatalı değer girniz.");
                    islemler();
                }




            }


        }catch (InputMismatchException e){
            String islem=scan.next();
            if (islem.equalsIgnoreCase("q")){
                System.out.println("------sistemden cıkılıyor.------");
                System.exit(0);//BREAK LA AYNI

            }else {
                System.out.println("hatalı giriş yapıldı ");
                islemler();
            }
        }
    }

    private void silme() {
        System.out.println("SİLİNECEK OGRENCİNİNİ TC NO SUNU GİRİNİZ");
        String tcno=scan.next();
        boolean kontrol=true;
        for (int i = 0; i <ogrList.size() ; i++) {
            if (ogrList.get(i).getKimlikNo().equals(tcno)){
                ogrList.remove(i);
                kontrol=false;
                listeleme();
                islemler();
            }
            }
        if (kontrol){
            System.out.println("bu tc ye ait ogrenci yok");
            islemler();
        }

        }


    private void listeleme() {
        for (Kayit each:ogrList
        ) {
            System.out.println(each);
            System.out.println("---------");
        }
        islemler();
    }

    private void arama(String tcno) {

        for (Kayit each:ogrList
             ) {
            if (each.getKimlikNo().equals(tcno)){
                System.out.println("aranan ogrenci ="+each);
                islemler();
            }

        }

            System.out.println("bu tc ye ait ogrenci yok");
            islemler();


    }

    private void ekleme1() {
        scan.nextLine();
        System.out.println("ogrenci adı soyadı");
        String adSoyad=scan.nextLine();
        System.out.println("öğrenci tc kimlik no");
        String tcno= tcnoKontrol(scan.next());
        System.out.println("ogrenci yası");
        int yas=scan.nextInt();
        System.out.println("ogrenci sınıfı");
        String sinif=scan.next();
        Kayit ogrenci=new Kayit(adSoyad,tcno,yas,++numara,sinif);
        ogrList.add(ogrenci);
        listeleme();
        islemler();

    }

    private String tcnoKontrol(String tcno) {
        String tcNoArr[]=tcno.split("");
        boolean kontrol=true;
        for (String each:tcNoArr
             ) {
            if (!Character.isDigit(each.charAt(0))){
                kontrol=false;
            }
        }
        if (!kontrol){
            System.out.println("girilen tc no hatalı");
           islemler();
        }
        return tcno;
    }
}
