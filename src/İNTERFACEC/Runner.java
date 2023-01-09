package İNTERFACEC;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("============= İŞLEMLER =============");
        System.out.println("Yapma istediğiniz işlemi giriniz\n1-Kare\n2-dikdörtgrn\n3-daire\nseciniz ");
        int secim=scan.nextInt();
        switch (secim){
            case 1:{
                Kare kare=new Kare();
                kare.alan();
                kare.cevre();

            } case 2:{
                Dikdortgen dikdortgen=new Dikdortgen();
                dikdortgen.alan();
                dikdortgen.cevre();

            } case 3:{
                Daire daire=new Daire();
                daire.alan();
                daire.cevre();

            }
        }


    }
}
