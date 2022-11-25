package _10_List;

import java.util.ArrayList;
import java.util.Scanner;
public class CiftRakamlarBasa {
    //Kullanicidan alinan sayinin icindeki cift rakamlari basa alan kod olusturuyoruz
    // input: 123456 output:246135
    public static void main(String[] args) {
        String sayi;
        int  depo;
        char myChar;
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi alalim : ");
        sayi= scan.nextLine().replaceAll("\\D","" );//aldigimiz stringin icinde sayi olmayan elemanlari yok ediyoruz.
        ArrayList <Integer> liste=new ArrayList<> (); // sonucu depolayacagimiz list variable'ini olusturuyoruz
        for (int i = 0; i <sayi.length() ; i++) {
            myChar=sayi.charAt(i);
            liste.add(Integer.parseInt(Character.toString(myChar)));
            //aldigimiz rakamlari liste variable'ina arraylist olarak aliyoruz
        }
        System.out.println(liste);          //string ifadeyi int olarak yazdiriyoruz
        for (int i = 0; i <sayi.length() ; i++)
        {
            if(liste.get(i)%2==0){
                depo= liste.get(i);
                liste.remove(i);
                liste.add(0, depo);
            }
        }
        System.out.println(liste);
    }
}