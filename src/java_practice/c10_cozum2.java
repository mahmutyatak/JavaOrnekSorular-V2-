package java_practice;

import java.util.Arrays;

public class c10_cozum2 {
    public static void main(String[] args) {
        int arr1[] = {0, 2, 5, 3, 1};

        int [] arr2 = {5, 2, 7, 1, 4};
        mountainArray(arr1);

      mountainArray(arr2);


    }

    public static void mountainArray(int[] arr) {
        int enbuyuk = 0;
        int enbuyukindex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > enbuyuk) {
                enbuyuk = arr[i];
                enbuyukindex = i;
            }
        }
        boolean kontrol = true;
        for (int i = enbuyukindex; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                continue;
            } else {
                kontrol = false;
                break;
            }
        }
        if (kontrol) {
            for (int i = enbuyukindex; i >= 1; i--) {
                if (arr[i] > arr[i - 1]) {
                    continue;
                } else {
                    kontrol = false;
                    break;
                }
            }
        }
            if (kontrol) {
                System.out.println(Arrays.toString(arr) + "mountain arraydir");
            } else
                System.out.println(Arrays.toString(arr) + "mountain array degildir.");

        }
    }
