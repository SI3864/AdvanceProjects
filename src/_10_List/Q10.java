package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */


    public static void main(String[] args) {

        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        System.out.println(ardisikTopla(arr));
    }
    private static ArrayList<Integer> ardisikTopla(int[] arr) {
        ArrayList<Integer> toplananSayilarList = new ArrayList<>();
        int count = 0;
        int toplananSayiAdedi = 1;
        while (arr.length - toplananSayiAdedi >= count) {//sayılar bitene action
            int toplam = 0;
            for (int i = 0; i <= count; i++) {
                toplam += arr[toplananSayiAdedi - 1 + i];
            }
            count++;
            toplananSayiAdedi += count;
            toplananSayilarList.add(toplam);
        }
        return toplananSayilarList;

/*
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen hesaplanmasını istediğiniz ardışık arrayin derecesini giriniz:");
        int derece = scan.nextInt();
        int uzunluk = 0;
        for (int i = 1; i <= derece; i++) {
            uzunluk += i;
        }
        int arr[] = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.print("Lütfen hesaplanmasını istediğiniz arrayin " + (i + 1) + ". elemanını giriniz:");
            arr[i] = scan.nextInt();
        }
        int arr2[] = new int[derece];
        arr2 = ardisikarraytopla(arr, derece);
        System.out.println(Arrays.toString(arr2));
    }
    private static int[] ardisikarraytopla(int[] arr, int derece) {
        int arr2[] = new int[derece];
        int uzunluk = 0;
        for (int i = 0; i < derece; i++) {
            uzunluk += i;
            for (int j = uzunluk; j <= uzunluk + i; j++) {
                arr2[i] += arr[j];
            }
        }
        return arr2;

 */

    }

}

