package java_practice;

public class c06_soru {
    public static void main(String[] args) {
        /*
        4-String' lerden oluşan bir arrayde öğeler
         'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JMJ
         */
        String [] str={"Kemal","Jonathan","Mark","Jackson","Ali"};

        basHarler(str);
    }public static void basHarler(String[] str){
        String ilkHarfler="";
        for (int i = 0; i <str.length ; i++) {
            if (str[i].endsWith("n") || str[i].endsWith("k")){
                ilkHarfler+=str[i].charAt(0);


            }

        }

        System.out.print(ilkHarfler);

    }
}
