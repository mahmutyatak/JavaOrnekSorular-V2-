package java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C12_soru {
    public static void main(String[] args) {
        /*
Verilen bir arrayin elemanlarını ardışık toplamını hesaplayan metodu yazınız
input={ 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
output={3, 5+1, 2+7+9, 2+3+5+7}
       {3,  6,   18,     17}
*/
        int [] arr={3,5,1,2,7,9,2,3,5,7};
        int toplam=0;
        int sayi1=0;
        List<Integer> yeniList=new ArrayList<>();



        for (int i = 0; i <arr.length ; i+=sayi1) {
            for (int j = i; j <=i+sayi1; j++) {
                toplam+=arr[j];

            }
            yeniList.add(toplam);

            System.out.print(toplam+",");
            toplam=0;
            sayi1++;

        }
        int [] arr2=new int[yeniList.size()];
        for (int i = 0; i <yeniList.size() ; i++) {
            arr2[i]=yeniList.get(i);

        }
        System.out.println("==========");
        System.out.println(Arrays.toString(arr2));
    }

}
