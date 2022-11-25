package _09_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketProject {
    static List<String> gunler = new ArrayList<>(Arrays.asList(" Pazartesi", " Sali", " Carsamba", " Persembe", " Cuma", " Cumartesi", " Pazar"));//1. adım
    static List<Double> gunlukKazanclar = new ArrayList<>();//2. adım
    static double ciro = 0;

    public static void main(String[] args) {

        int gun = 0;
        Scanner sc = new Scanner(System.in);
        while (gun < 7) {//3. adım
            System.out.print(gunler.get(gun) + " gününün kazancını giriniz : ");//gunler listinden aldığım gün için kullanııcdan o günün hasılatını istedim.
            double gunlukhasilat = sc.nextDouble();//istediğim hasılatı gunluk hasılata atadım
            gunlukKazanclar.add(gunlukhasilat);//aldığım günlük hasılatı gunlukKazanclar listine ekledim.
            ciro += gunlukhasilat;//aldığım günlük hasılatı kasaya ekledim.
            gun++;//0 1 2 3 4 5 6 .günleri çağırdım.
        }
        getOrtalamaKazanc();
        getOrtalamaninUstundeKazancGünleri();
        getOrtalamaninAltindaKazancGünleri();

        System.out.println("günlükkazanclar : " + gunlukKazanclar);
        System.out.println("ciro  : " + ciro);
        System.out.println("ortalama kazanç : " + getOrtalamaKazanc());
        System.out.println("ortalamanın üstündeki gün : " + getOrtalamaninUstundeKazancGünleri());
        System.out.println("ortalamanın altındaki gün : " + getOrtalamaninAltindaKazancGünleri());
    }

    private static String getOrtalamaninAltindaKazancGünleri() {//6. adım
        String ortAltGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < getOrtalamaKazanc()) {
                ortAltGun += gunler.get(i);
            }
        }
        return ortAltGun;
    }

    private static String getOrtalamaninUstundeKazancGünleri() {//5.adım
        String ortUstGun = "";
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > getOrtalamaKazanc()) {
                ortUstGun += gunler.get(i);
            }
        }
        return ortUstGun;
    }

    private static double getOrtalamaKazanc() {//4. adım
        double ortalama = ciro / 7;
        return ortalama;
    }
}
