package okulYonetimi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnaMenu {
Scanner scan=new Scanner(System.in);
    void menu(){
        System.out.println("====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t 1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t 2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t Q- ÇIKIŞ\n"+
                "\t SECİMİNİZ: ");
        try {
            int secim=scan.nextInt();
            switch (secim){
                case 1:{
                    OgrenciIslemler ogrenciMenu=new OgrenciIslemler();
                    ogrenciMenu.ogrenciMenu();
                    break;

                } case 2:{
                    OgretmenIslemler ogretmenMenu=new OgretmenIslemler();
                    ogretmenMenu.ogrtMenu();
                    break;
                }
                default:{
                    System.out.println("yanlis secim");
                    menu();
                }
            }


        }catch (InputMismatchException e){
            String secim=scan.nextLine();
            if (secim.equalsIgnoreCase("q")){
                System.out.println("güle güle");
                System.exit(0);
            }else {
                System.out.println("yanlis secim");
                menu();
            }



        }
    }
}
