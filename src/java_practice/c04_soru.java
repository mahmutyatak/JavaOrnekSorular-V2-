package java_practice;

public class c04_soru {
    public static void main(String[] args) {
        /*
           Bir sayinin mükemmel olup olmadiğini bulan
            bir method yaziniz.
        Mükemmel sayi :
        bir sayinin kendisi hariç bölenlerinin toplamı,
        kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)
         */
        int sayi=28;
        mukemmel(sayi);

    }public static void mukemmel(int sayi){
        int toplam=0;
        for (int i =1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
            }

        }if (toplam==sayi) {
            System.out.println("mükemmel sayi");
        }
        else{
            System.out.println("mükemmel değil");
        }
    }
}
