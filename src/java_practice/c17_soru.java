package java_practice;

import java.util.ArrayList;
import java.util.List;

public class c17_soru {
    public static void main(String[] args) {
         /*
        Verilen bir String'deki sesli harf sayısını bulunuz.
         */
        String str="Java çok güzeldir";
       List<String> sesliharfler =new ArrayList<>();
       sesliharfler.add("a");
       sesliharfler.add("e");
        sesliharfler.add("i");
        sesliharfler.add("o");
        sesliharfler.add("u");
        sesliharfler.add("ü");
        sesliharfler.add("ö");
        sesliharfler.add("ı");
        System.out.println(sesliharfler);

        int sayac=0;
        for (int i = 0; i < str.length(); i++) {
            if (sesliharfler.contains(str.substring(i,i+1))){
                sayac++;
            }
        }
        System.out.println(sayac);
    }
}
