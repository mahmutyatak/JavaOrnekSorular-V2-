package java_practice;

public class c01_soru {
    public static void main(String[] args) {
        //100'den 0'a kadar 13'e tam bölünebilen sayıları ve
        // toplamlarını ekrana yazdırınız (büyükten küçüğe).
int toplam=0;
        System.out.print("13 e bölünen sayılar:");
        for (int i =100; i >=1 ; i--) {
            if (i%13==0){
                System.out.print(i+" ");
             toplam+=i;

            }

        }
        System.out.println("");
        System.out.println("sayıların topamı :"+toplam);
    }
}
