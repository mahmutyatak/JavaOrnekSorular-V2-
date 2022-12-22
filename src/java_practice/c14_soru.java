package java_practice;

import java.util.*;

public class c14_soru {
    public static void main(String[] args) {
        //Girilen desimal değeri
        // binary(0,1) değere çeviren metodu oluşturunuz.
//Örnek: 12 = 1 1 0 0
        // 2 ye bölerek deva edeceğiz.2 ye bölünmeyinceye kadar devam eder.

        // en son bölümden başlayarak kalanlara bakarak yzılır.

        System.out.println("binary ifadeye çevirmek istediğiniz desimal değer giriniz");
        Scanner scan=new Scanner(System.in);
        int desimalsayi=scan.nextInt();

        System.out.println(desimalsayi+"sayisinin binary karsılığı :"+binaryCevir(desimalsayi));
    }

    private static List<Integer> binaryCevir(int desimalsayi) {
        List<Integer> binary=new ArrayList<>();
        while (desimalsayi>=1){
            binary.add(desimalsayi%2);
            desimalsayi/=2;

        }
      // Collections.reverse(binary);// direk tersine cevirir.1.yol
        List<Integer> binary1=new ArrayList<>();
        for (int i =binary.size()-1; i >=0 ; i--) {
            binary1.add(binary.get(i));
        }

        return binary1;// 6 için cevap 0,1,1 biizm cevabımız 1,1,0 olur
    }
}
