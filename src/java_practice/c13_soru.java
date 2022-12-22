package java_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class c13_soru {
    public static void main(String[] args) {
        /*
         * Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
         * 1-1-2-3-5-8-13-21-34....
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = scan.nextInt();
        List<Integer> fibonchiList = new ArrayList<>();
        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3 = 0;
        fibonchiList.add(0);
        fibonchiList.add(1);
        do {

            sayi3 = sayi2 + sayi1;
            if (sayi3>sayi)break;
            fibonchiList.add(sayi3);
            sayi1 = sayi2;
            sayi2 = sayi3;
        } while (sayi3 < sayi);
        System.out.println(fibonchiList);


        System.out.println("=====2.yol");
        fibonchiList.clear();
        fibonchiList.add(0);
        fibonchiList.add(1);
        for (int i = 2; i <sayi ; i++) {
            sayi3=fibonchiList.get(fibonchiList.size()-2)+fibonchiList.get(fibonchiList.size()-1);
            fibonchiList.add(sayi3);
        }
        System.out.println(fibonchiList);
    }
}




        //System.out.println(yeniList(fibonchiList, sayi));
    /*
    }public static List<Integer> yeniList( List<Integer> fibonchiList,int sayi){
        List<Integer> yeniList=new ArrayList<>();
        for (int i = 0; i <fibonchiList.size() ; i++) {
            if (sayi>=fibonchiList.get(i)){
                yeniList.add(fibonchiList.get(i));
            }
        }

        return yeniList;
    }
}

     */


