package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */
        List<Integer> notlar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int not = 0;
        double toplam=0;
        System.out.println("Lütfen girmek istediğiniz kadar öğrenci notu giriniz." +
                " Tüm notlar girildikten sonra -1 giriniz.");
        do {
            System.out.print("Lütfen bir not giriniz:");
            not = scan.nextInt();
            if (not < -1) System.out.println("Lütfen geçerli bir not giriniz.");
            else if (not == -1) break;
            else {
                notlar.add(not);
                toplam=toplam+not;
            }
        }
        while (not != -1);
        double ortalama=toplam/notlar.size();
        int sayac=0;
        for (int i = 0; i < notlar.size() ; i++) {
            if(notlar.get(i)>ortalama) sayac++;
        }
        System.out.println("Notlar:"+notlar);
        System.out.println("Ortalama:"+ortalama);
        System.out.println("Ortalamayı geçen öğrenci sayisi:"+sayac);
        /*
        List<Integer> listNotlar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String devam;
        //ortalamasi alinacak list elemanlari kullanicidan alindi
        do {
            System.out.print("Not giriniz : ");
            int ogrNot = scan.nextInt();
            System.out.println("Devam : E/H");
            devam = scan.next();
            listNotlar.add(ogrNot);
        } while (devam.equalsIgnoreCase("E"));
        //ortlama hesaplanmasi..
        int toplam = 0;
        for (int i = 0; i < listNotlar.size(); i++) {
            toplam += listNotlar.get(i);
        }
        double ortalama = toplam / listNotlar.size();
        //ortalamayi geçen ogr sayisi
        int ortlamaGecenSayisi = 0;
        for (int i = 0; i < listNotlar.size(); i++) {
            if (listNotlar.get(i) > ortalama) {
                ortlamaGecenSayisi++;
            }
        }
        System.out.println("girilen notlarin ortalamasi  :" + ortalama);
        System.out.println("ortalama gecen ogr sayisi : " + ortlamaGecenSayisi);

         */
    }
}
