package java_practice;

import java.util.Scanner;

public class c08_soru {
    public static void main(String[] args) {
        /*
         1-Kullanıcı tarafından girilen string
          ifadenin içindeki sayısal değerleri toplayan metodu yazınız
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir cumle giriniz");//jsfgasfjh12354sajsb25
        String cumle=scan.nextLine();

        System.out.println("sayısal degerler toplamı"+sayisalIfadeler(cumle));
    }

    private static int sayisalIfadeler(String cumle) {
        int toplam=0;
        String cumleArr[]=cumle.split("");// bütün cümleyi parçalayıp arra ye atadık.
        /*
        for (String each:cumleArr){
            if (Character.isDigit(each.charAt(0))){
                toplam+=Integer.valueOf(each);
            }
        }

         */
        for (int i = 0; i <cumleArr.length ; i++) {
            if (Character.isDigit(cumleArr[i].charAt(0))){//char veri tipinin sayısal olup olmamsına baktı.
                toplam+=Integer.valueOf(cumleArr[i]);
            }

        }
        return toplam;
    }
}

