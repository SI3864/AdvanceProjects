package _06_Method_Creation;

import java.util.Arrays;

public class Q05 {

    public static void main(String[] args) {
         /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */
        String cumle = "haydi cumle yaz";
        String bosluk = " ";
        harfKacKereKullanılmıs(cumle, bosluk);
    }
    private static void harfKacKereKullanılmıs(String cumle, String bosluk) {
        int sayac = 1;
        String karakterler[] = cumle.split("");
        System.out.println(Arrays.toString(karakterler));
        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(bosluk)) {
                sayac++;
            }
        }
        System.out.println("cumlede " + (sayac) + " adet kelime vardır.");
    }
}
