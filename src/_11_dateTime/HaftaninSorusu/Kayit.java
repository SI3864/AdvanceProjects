package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Kayit {

    List<Kullanici>kisiler = new ArrayList<>();// bos list..

    public List<Kullanici> kayitAl(){
        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi giriniz : ");
        String isim=scan.nextLine();
        Kullanici k1 = new Kullanici(isim, LocalDateTime.now());//
        kisiler.add(k1);//


        return kisiler;


    }
    public void sansliKullanici(List<Kullanici>kll){

        for (Kullanici k:kll) {
            if (k.kayitZamani.getSecond()<10){
                System.out.println("sansli kisisiniz "+k.name+" 5 kilo bal kazandin..");
            }else System.out.println("maalesef "+k.name+" bal kalmadi ..");
        }
    }
    public  void listele(List<Kullanici>kullanicilar){
        for (Kullanici k:kullanicilar){
            System.out.println("adi : "+k.name+" kayit zamani :"+k.kayitZamani);
        }
    }
}
