package java_practice;

public class c07_soru {
    public static void main(String[] args) {
        /*
        5-MOUNTAIN ARRAY SORUSU : Verilen herhangi bir arrayin
        Mountain Array olup olmadıgını kontrol etmek için bir kod yazınız.

Not:
Mountain Array ==> [0, 2, 5, 3, 1]
Bir array elemanları en büyük degerine kadar sürekli artan, en büyük degerinden sonra sürekli azalan deger alıyorsa Mountain Array' dir.
Mountain Array Degil ==> [5, 2, 7, 1, 4]
Bir array elemanları en büyük degerine kadar sürekli azalan, en büyük degerinden sonra sürekli artan deger alıyorsa Mountain Array degildir
         */
        int []arr={3,5,6,7,4,3,1,0};
        int sayac=1;
        for (int i = 0; i <arr.length-2 ; i++) {
            if (arr[i]<arr[i+1]){
                sayac++;

            }else break;

        }
        for (int i = arr.length-1; i >=1 ; i--) {
            if (arr[i]<arr[i-1]){
                sayac++;

            }else break;
        }
        if (sayac==arr.length){
            System.out.println("Mountain Array");
        }else System.out.println("Mountain Array değil");
    }
}
