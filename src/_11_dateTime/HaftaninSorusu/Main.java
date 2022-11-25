package _11_dateTime.HaftaninSorusu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //System.out.println("isleminizi seciniz : ");

        Kayit yeniKayit = new Kayit();// obj ile meth. call


        List<Kullanici>kisi = new ArrayList<>();
        boolean cikilsinMi=false;
        while (!cikilsinMi){
            System.out.println("lutfen \n1: Kayit al\n2: sansli kisi bul\n3: kisileri listele\n4: cikis");
            System.out.print("isleminizi seciniz : ");
            int islem = scan.nextInt();
            switch(islem){
                case 1:
                    kisi=yeniKayit.kayitAl();
                    break;
                    case 2:
                    yeniKayit.sansliKullanici(kisi);
                    break;
                case 3:
                    yeniKayit.listele(kisi);
                    break;
                case 4:
                    cikilsinMi=true;
                    break;
                    default:
                        System.out.println("hatali veri girdiniz..");
                        break;
            }

        }

    }
}
