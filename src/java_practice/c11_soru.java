package java_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c11_soru {
    public static void main(String[] args) {
        String str="Ali'nin 80 adet nutellası var 10'unu yedi 70'i kaldı. ";
        int toplam=0;

        String [] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
           arr[i]=arr[i].replaceAll("\\D","");

            }
        System.out.println(Arrays.toString(arr));
        Integer [] arr2=new Integer[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            if (!arr[i].equals("")){
                arr2[i]=Integer.parseInt(arr[i]);
            }else arr2[i]=0;

        }
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i <arr2.length ; i++) {
            toplam+=arr2[i];
        }
        System.out.println(toplam);
        }


    }

/*
for (int i = 0; i <cumleArr.length ; i++) {
            if (Character.isDigit(cumleArr[i].charAt(0))){//char veri tipinin sayısal olup olmamsına baktı.
                toplam+=Integer.valueOf(cumleArr[i]);
 */