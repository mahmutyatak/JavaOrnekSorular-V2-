package java_practice;

public class c03_soru {
    public static void main(String[] args) {
        /*
        Girilen bir stringdeki a harfi sayısını bulunuz.
         ama c harfine gelirse
 * döngüden çıkılsın
 *
 * Bugün hava oldukca güzel.-> 2
         */
        String str="bagan hava cok güzel";
        int sayac=0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a'){
                sayac++;
            } else if (str.charAt(i)=='c') {
                break;

            }
        }
        System.out.println(sayac);
    }
}
