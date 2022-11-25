package _10_List;

import java.util.*;

public class Q09 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */


        Scanner scan = new Scanner(System.in);
        System.out.print("agam bir metin gir : ");//hayat java ile cok kolay
        String arr[] = scan.nextLine().split("");
        //kulanıcıdan gelen metin "" e göre parçalanarak her bir parca arrayin elemanı olarak atandı
        System.out.println(Arrays.toString(arr));
        String enCokTekrarEden = "";
        int maxSayac = 0;//en cok kullanılan harfin sayısı
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {//karşılaştırılan karakter kontrolu-->h
            for (int j = i + 1; j < arr.length; j++) {//karşılaştıran karakter kontrolu -->a,y,a,t.....
                if (arr[i].equalsIgnoreCase(arr[j])) {
                //esit karakterlerin kontrolu yapılıp true durumunda sayac artırılarak
                    // esit karakterler saydırlıdı
                    sayac++;
                }
            }
            if (sayac > maxSayac) {
                maxSayac = sayac;
                enCokTekrarEden = arr[i];
            } else if (sayac == maxSayac) {
                enCokTekrarEden += ", " + arr[i];
            }
            sayac = 1;
        }
        System.out.println(" agam metinde encok aha bu harf var : "+enCokTekrarEden);



        /*
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir string ifade giriniz:");//
        String input=scan.nextLine();
        List<String> karaktervesayi = new ArrayList<>();
        List<Integer> karaktersayi = new ArrayList<>();
        String[] arr1 = input.toLowerCase(Locale.ROOT).split("");// parcalayip kucuk harfe donustu
        int sayac = 0;
        for (int i = 0; i <= arr1.length - 1; i++) {// karsilastirilan kark.kont.
            for (int j = 0; j <= arr1.length - 1; j++) {// karsilastirilan kar. kont.
                if (arr1[i].equals(arr1[j])) {// esit kark.kont.yapilip
                    sayac++;              //true ise artirma
                }
            }
            karaktervesayi.add(sayac + " adet " + arr1[i]);
            sayac = 0;
        }
        Collections.sort(karaktervesayi);
        karaktervesayi=aynıelemanbirkezyazdir(karaktervesayi);

        for (int i = 0; i < karaktervesayi.size() ; i++) {
            karaktersayi.add(Integer.parseInt(karaktervesayi.get(i).replaceAll("\\D", "")));
        }
        int maxkarakterlisayi = 1;
        outerloop:
        for (int i = karaktersayi.size() - 1; i >= 0; i--) {
            for (int j = karaktersayi.size() - 1; j >= 0; j--) {
                if (i != j) {
                    if (karaktersayi.get(i) > karaktersayi.get(j)) {
                        break outerloop;
                    } else {
                        maxkarakterlisayi++;
                    }
                }
            }
        }
        System.out.println("Girilen stringde " + maxkarakterlisayi +
                " adet karakter maksimum sayida kullanılmıştır.");
        for (int i = 0; i < maxkarakterlisayi; i++) {
            if(karaktervesayi.size() - 1-i<0) break;
            System.out.println("-"+ karaktervesayi.get(karaktervesayi.size() - 1-i));
        }
    }
    private static List<String> aynıelemanbirkezyazdir(List<String> karaktervesayi) {
        List<String> tekrarsizList = new ArrayList<>();
        for (int i = 0; i <karaktervesayi.size() ; i++) {
            for (int j = 0; j <karaktervesayi.size() ; j++) {
                if (!tekrarsizList.contains(karaktervesayi.get(i))) {
                    tekrarsizList.add(karaktervesayi.get(i));
                }
            }
        }
        return tekrarsizList;

         */
    }
}

