package java_practice;

import java.util.Scanner;

public class c19_bankacozum2 {
static Scanner scan=new Scanner(System.in);
static String kartNo="1234123412341234";
static String sifre="1234";
static int bakiye=10000;
    public static void main(String[] args) {
          /*
        ATM
Kullanicidan giriş için kart numarasi ve şifresini isteyin,
 eger herhangi birini yanlis girerse tekrar isteyin
 .Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
 Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri
  ekrana yazdirin,
Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme,
 sifre değiştirme ve cikis islemleri olacaktır.
Para çekme ve para gonderme işleminde mevcut bakiyeden
buyuk para çekilemez,
Para gönderme işleminde istenen iban TR ile baslamali ve
toplam 26 karakterli olmali, eger değilse menü ekraninageri donsun.
Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra,
 sifre değişiklik işlemini yapmali,
         */

        giris();

    }

    private static void giris() {
        System.out.println("kart numarasını giriniz");
        String kkartNo=scan.nextLine().replaceAll(" ","");
        System.out.println("sifrenizi giriniz");
        String ksifre=scan.next();

        if (ksifre.equals(sifre)&&kkartNo.equals(kartNo)){
            menu();



        }else{
            System.out.println("kart no veya sifre hatalı");
            scan.nextLine();//Dummy----- ARD ARDA kullanılan scanner objelerinde
            //olusan hatayı önlemek için kullanılır.
            giris();

        }


    }

    private static void menu() {
        System.out.println("********ABC BANK********\n"+
                "1. Bakiye Sorgulama\n"+
                "2. Para Yatırma\n"+
                "3. Para Cekme\n"+
                "4. Para Gönderme\n"+
                "5. Sifre Degistirme\n"+
                "6. Cikis\n"+
                "Seciminiz  :");
        int secim=scan.nextInt();
        switch (secim){
            case 1:{
               bakiyeSorgula();
            }
        case 2:{
            System.out.println("yatırmak istediginiz tutarı giriniz");
            double miktar=scan.nextDouble();
            paraYatirma(miktar);

        }case 3:{
            paraCekme();

        }case 4:{
            paraGonderme();

        }case 5:{
            sifreDegistir();

        }case 6:{
                System.out.println("****** güle güle*****");
                System.exit(0);

        }
            default:{
                System.out.println("yanlis deger girdiniz");
            }

    }
}

    private static void sifreDegistir() {
        System.out.println("eski sifreyi giriniz");
        String esifre=scan.next();
        if (esifre.equals(sifre)){
            System.out.println("yeni sifre giriniz");
            sifre=scan.next();
            scan.nextLine();//dummy yaptık
            giris();// yeni sifreyle girmek için
        }else {
            System.out.println("eski sifre yanlıs");
            sifreDegistir();
        }

    }

    private static void paraGonderme() {
        scan.nextLine();//dummy oluyor hata olaylarına karsı.
        System.out.println("iban no giriniz");
        String iban=scan.nextLine().toUpperCase().replaceAll(" ","");
        if (iban.length()==26 && iban.startsWith("TR")){
            System.out.println("gönderilecek tutarı giriniz");
            double miktar=scan.nextDouble();
            if (miktar<=bakiye){
                bakiye-=miktar;
                bakiyeSorgula();
            }else {
                System.out.println("göndermek istediginiz tutar bakiyeden büyük");
                paraGonderme();
            }

        }
    }

    private static void paraCekme() {
        System.out.println("cekmek istediginiz tutarı giriniz");
        double miktar=scan.nextDouble();

        if (miktar<=bakiye){
            bakiye-=miktar;
            bakiyeSorgula();
        }else {
            System.out.println("cekmek istediginiz tutar bakiyeden buyuk");
            paraCekme();
        }
    }



    private static void paraYatirma(double miktar) {
        bakiye+=miktar;
        bakiyeSorgula();
    }

    private static void bakiyeSorgula() {
        System.out.println("bakiyeniz :"+bakiye+"TL");
        menu();
    }
    }
