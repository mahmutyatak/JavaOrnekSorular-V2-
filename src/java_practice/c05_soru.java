package java_practice;

import java.util.Random;
import java.util.Scanner;

public class c05_soru {
    public static void main(String[] args) {
        /*

3-kullanıcının istediği büyüklükte diziye 0-100 arası rastgele sayılarla doldurup kaçının ortalamanın altında,kaçının ortalamanın üzerinde olduğunu bulan metodu bulunuz

         */
ortalamaSayila();

    }public static void ortalamaSayila(){
        Scanner scan=new Scanner(System.in);
        System.out.println("dizinin boyutunu giriniz");
        int boyut=scan.nextInt();
        int [] arr=new int[boyut];
        int toplam=0;
        int sayac=0;
        for (int i = 0; i <boyut ; i++) {
            Random rnd=new Random();
            int a=rnd.nextInt(100);
            System.out.print(a+" ");
            arr[i]=a;
            toplam+=a;
        }
        double ortalama=toplam/boyut;
        int alt=0,ust=0,esit=0;
        for (int i = 0; i <arr.length ; i++) {
            if (ortalama>arr[i]){
               alt++;
            } else if (ortalama<arr[i]) {
                ust++;
            }else esit++;

        }
        System.out.println("ortalam :"+ortalama+"\nortalama altında "+alt+ " kadar sayı var"+
                "\nortalama üstünde  "+ust+" kadar sayı var\n"+
                esit+"adet sayı ortalamaya esit");


    }
}
