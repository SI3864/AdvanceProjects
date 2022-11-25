package _09_Arrays;

import java.util.Arrays;

public class Q14 {

    public static void main(String[] args) {
        /*  TASK :
         * Congratulations kelimesini Array yontemlerini kullanarak asagidaki outputu
         * alin.
         * input : Congratulations
         * output: [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]    sniitilitirgniC --> o ,a ve u harfini i ye donusturun.

         */

        String str = "Congratulations";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr)); // [C, o, n, g, r, a, t, u, l, a, t, i, o, n, s]
        // Stringin diziye cevrilmis orjinal hali
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("o") || arr[i].equals("a") || arr[i].equals("u"))
                arr[i] = "i";
            String yeni = arr[i].replaceAll(",", "");
            System.out.print(yeni);
        }
        System.out.println();

        /*
        String str="Congratulations";
        String dizi[]=str.split("");
        String dizi2[]=new String[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i].contains("o")||dizi[i].contains("u")||dizi[i].contains("a")){
               dizi[i]=dizi[i].replaceAll("a","i");
               dizi[i]=dizi[i].replaceAll("o","i");
               dizi[i]=dizi[i].replaceAll("u","i");
            }
            dizi2[dizi2.length-1-i]=dizi[i];
        }
        System.out.println(Arrays.toString(dizi2));
        String strnew="";
        for (int i = 0; i <dizi2.length; i++) {
            strnew+=dizi2[i];
        }
        System.out.println(strnew);
         */


    }

}
