package İNTERFACEC;

import java.util.Scanner;

public class Dikdortgen implements Iislemler{
    Scanner scan=new Scanner(System.in);
    int kenar1=0;
    int kenar2=0;
    @Override
    public void alan() {
        System.out.println("dikdörtgenin kenarlarını giriniz");
        kenar1=scan.nextInt();
        kenar2=scan.nextInt();
        System.out.println("Alan ="+(kenar1*kenar2));

    }

    @Override
    public void cevre() {
        System.out.println("cevre ="+(kenar1+kenar2)*2);
    }
}
