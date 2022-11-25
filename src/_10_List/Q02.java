package _10_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

         */

        List<String> list1=new ArrayList<>();
        String arr1[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        list1=d2arraytolist(arr1);
        System.out.println(list1);
    }
    public static List<String> d2arraytolist(String[][] arr1) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                list.add(arr1[i][j]);
            }
            Collections.sort(list);
        }
        return list;
    }
}
