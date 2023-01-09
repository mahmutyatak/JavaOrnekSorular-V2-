package İNTERFACEC;

import java.util.Scanner;

public class Daire implements Iislemler{
    Scanner scan=new Scanner(System.in);
    int r=0;
    @Override
    public void alan() {
        System.out.println("dairenin yarıcapını giriniz");
        r=scan.nextInt();
        System.out.println("Alan ="+(3.14*r*r));

    }

    @Override
    public void cevre() {
        System.out.println("cevre ="+(2*3.14*r));
    }
}
