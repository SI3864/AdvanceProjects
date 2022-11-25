package JavaProjects.P06_KahveMakinesi.Kahve_makinesi01;

import java.util.Scanner;

public class KahveMakinesi {

    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);

        System.out.println("************************");
        System.out.println("-----Kahve Makinesi-----");
        System.out.println("************************");
        String islemler = "1.Türk Kahvesi\n" + "2.Filtre Kahve\n" + "3.Espresso\n" +
                "4.Americano\n" + "5.Cappicino\n" + "6.Cıkıs";
        System.out.println(islemler);
        System.out.println("************************");

        while (true) {
            System.out.print("Yapmak istediginiz islemin numarasini giriniz : ");
            String hangiKahve = scanner.nextLine();

            if (hangiKahve.equals("6")) {
                System.out.println("Kahve Makinesi Sisteminden cikiliyor...");
                break;
            } else if (hangiKahve.equals("1")) {
                System.out.println("Türk kahvesi hazırlanıyor...");
            } else if (hangiKahve.equals("2")) {
                System.out.println("Filtre kahve hazırlanıyor...");
            } else if (hangiKahve.equals("3")) {
                System.out.println("Espresso hazırlanıyor...");
            } else if (hangiKahve.equals("4")) {
                System.out.println("Americano hazırlanıyor...");
            } else if (hangiKahve.equals("5")) {
                System.out.println("Cappicino hazırlanıyor...");
            } else {
                System.out.println("Hatalı tuşlama yaptınız.Tekrar deneyiniz...");
                break;
            }

            System.out.print("\nSüt eklememizi ister misiniz?\n" + "1.Evet\n" + "2.Hayır\n" + "Tuslayiniz: ");
            String sut = scanner.nextLine();

            if (sut.equals("1")) {
                System.out.println("Süt ekleniyor...");
            } else if (sut.equals("2")) {
                System.out.println("Sut eklenmiyor...");
            } else {
                System.out.println("Hatali islem yaptiniz...");
                break;
            }

            System.out.print("\nSeker ister misiniz?\n" + "1.Evet\n" + "2.Hayır\n" + "Tuslayiniz: ");
            String seker = scanner.nextLine();

            if (seker.equals("1")) {
                System.out.print("Kaç seker olsun: ");
                int kacSeker = scanner.nextInt();
                scanner.nextLine();
                System.out.println(kacSeker + " seker ekleniyor");
            } else if (seker.equals("2")) {
                System.out.println("Şeker eklenmiyor ");
            } else {
                System.out.println("Hatalı giris yaptınız. Tekrar deneyiniz...");
                break;
            }

            System.out.print("\nHangi boyutta olsun?\n" + "1.Buyuk Boy\n" + "2.Orta Boy\n" + "3.Kucuk Boy\n" + "Tuslayiniz: ");
            String boyut = scanner.nextLine();

            if (boyut.equals("1")) {
                System.out.println("Buyuk Boy Kahveniz hazirlaniyor...");
            } else if (boyut.equals("2")) {
                System.out.println("Orta Boy Kahveniz hazirlaniyor...");
            } else if (boyut.equals("3")) {
                System.out.println("Kucuk Boy Kahveniz hazirlaniyor...");
            } else {
                System.out.println("Hatali gırıs yaptınız. Tekrar deneyiniz...");
                break;
            }


            System.out.println("\nKahveniz hazir. Afiyet olsun !!!");
            break;

        }

    }
}
