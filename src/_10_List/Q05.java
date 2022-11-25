package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */


        Scanner scan = new Scanner(System.in);
        int arr[] = new int[6];// boyut belli oldugu icin dogrudan buraya yaziyoruz 6'yi
        for (int i = 0; i < 6; i++) { // kullanicidan istemek bu sekilde oluyor for looplar icin,
            System.out.print("sayi giriniz : "); //sout burada olsun.
            arr[i] = scan.nextInt();
        }
        //method
        System.out.println(tekEleman(arr));// methodu yazdirmak icin yapiyoruz.
    }
    private static ArrayList<Integer> tekEleman(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();//bos list icine tek elemanlar atanacak
        // list olmasinin en onemli nedeni boyutu bilmiyoruz. Boyut bilinmeyinca List yapilir!
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                list.add(arr[i]);// add method'u ile bulunan tek sayilar liste dahil olmus olur.
            }
        }
        return list;

        /*
        Scanner scan = new Scanner(System.in);
        int Arr[]=new int[6];

        for (int i = 0; i <6 ; i++) {
            System.out.print(i+1+" Numaralı elemanın değerini giriniz:");
            Arr[i]=scan.nextInt();
        }
        int Arr2[]=returnodd(Arr);
        System.out.println(Arrays.toString(Arr2));
    }
    private static int [] returnodd(int[] arr) {
        List<Integer> sayilar = new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            if(i%2==1) sayilar.add(i);
        }
        int arrodd[]= new int[sayilar.size()];
        for (int i = 0; i <sayilar.size(); i++) {
            arrodd[i]=sayilar.get(i);
        }
        return arrodd;

         */

    }


}
