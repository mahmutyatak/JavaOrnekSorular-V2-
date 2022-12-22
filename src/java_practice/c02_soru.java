package java_practice;

public class c02_soru {
    public static void main(String[] args) {
        //0-255 e kadar olan harflerin ,
        // sayı ve harf değerini konsola yazdırınız.

        for (int i = 0; i <255 ; i++) {
            if (i>='a'&& i<='z'){
                System.out.print(i+" ");
                System.out.print((char)i+" ");
            }
            if (i>='A'&& i<='Z'){
                System.out.print(i+" ");
                System.out.print((char)i+" ");
            }

        }
    }
}
