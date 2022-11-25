package _06_Method_Creation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("cevirim yapacaginiz islemi seciniz : ");
        String islem =scanner.next();
        System.out.println("cevirim miktarini giriniz : ");
        double miktar= scanner.nextDouble();
        donustur(islem,miktar);
    }

    private static void donustur(String islem, double miktar) {
        switch(islem) {
            case "saat" :
                System.out.println("merak ettiign saat "+ miktar*60*60+ " saniyedir ");
                break;
            case "mil" :
                System.out.println("merak ettiign mil "+ miktar*1.61+ " kilometredir ");
                break;
            case "kg" :
                System.out.println("merak ettiign kg "+ miktar*1000+ " gramdir ");
                break;
        }
    }
}

