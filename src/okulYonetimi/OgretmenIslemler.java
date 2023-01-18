package okulYonetimi;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OgretmenIslemler implements Islemler {
Scanner scan=new Scanner(System.in);
static int sicilNo=1000;
static ArrayList<Ogretmen> ogretmenlist=new ArrayList<>();
void ogrtMenu(){
    System.out.println("============= İŞLEMLER =============\n" +
            "\t\t 1-EKLEME\n" +
            "\t\t 2-ARAMA\n" +
            "\t\t 3-LİSTELEME\n" +
            "\t\t 4-SİLME\n" +
            "\t\t Q-ÇIKIŞ\n" +
            "\n" +
            "\tSEÇİMİNİZ:");
    try {
        int secim=scan.nextInt();
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
               ogrtMenu();
           }
       }

    }catch (InputMismatchException e){
        String islem=scan.nextLine();
        if (islem.equalsIgnoreCase("q")){
            AnaMenu anamenu=new AnaMenu();
            anamenu.menu();
        }else {
            System.out.println("yanlış secim");
            ogrtMenu();
        }
    }
}





    @Override
    public void ekleme() {

        System.out.print("ogrtemnin adini giriniz");
        String ad=scan.nextLine();
        scan.nextLine();
        System.out.print("ogretmenin soyadini giriniz");
        String soyad=scan.nextLine();
        System.out.print("ogretmenin tc no sunu giriniz");
        String tcNO=tckontrol(scan.nextLine());
        System.out.print("ogretmenin yasini giriniz");
        int yas=scan.nextInt();
        scan.nextLine();
        System.out.print("ogretmenin bolumunu giriniz");
        String bolum=scan.nextLine();
        //sicil no sunu otomatik yaptık
        Ogretmen ogretmen=new Ogretmen(ad,soyad,tcNO,yas,bolum,sicilNo++);
        ogretmenlist.add(ogretmen);
        System.out.println(ogretmenlist);
        ogrtMenu();


    }

    private String tckontrol(String tcNO) {
        String[] tcNoArr = tcNO.split("");
        boolean kontrol = true;
        for (String each: tcNoArr) {
            if (!Character.isDigit(each.charAt(0))){
                kontrol = false;
            }
        }
        if (!kontrol){
            System.out.println("TC NO HATALI!!!");
            tckontrol(scan.next());
            //menu();
        }
        return tcNO;

    }

    @Override
    public void arama() {
        System.out.println("aranacak kisinin tc no sunu giriniz");
        String tcNo=scan.next();
        boolean kontrol=true;
        for (Ogretmen each:ogretmenlist
             ) {
            if (each.getTcNo().equals(tcNo)){
                System.out.println(each);
                kontrol=false;

            }
        }
        if (kontrol){
            System.out.println(tcNo+" boyle bir tc nolu kişi yok");

        }
        ogrtMenu();
    }

    @Override
    public void listeleme() {
        for (Ogretmen each:ogretmenlist
             ) {
            System.out.println(each);
        }
        ogrtMenu();
    }

    @Override
    public void silme() {
    scan.nextLine();
        System.out.println("silinecek kisinin tc no sunu giriniz");
        String tcno=scan.nextLine();
        boolean kontrol=false;
        for (int i = 0; i <ogretmenlist.size() ; i++) {
            if (ogretmenlist.get(i).getTcNo().equals(tcno)){
                System.out.println("silinecek eleman"+ogretmenlist.get(i));
                ogretmenlist.remove(i);
                kontrol=true;
                ogrtMenu();
        }

            }

        if (!kontrol){
            System.out.println("böyle bir tc yok");
            ogrtMenu();
        }

    }
}
