package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q08 {

    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Umit","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */


        String[] isimler={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        List<String> isimlerList = Arrays.asList(isimler);
        String temp="";
        temp=isimlerList.get(2);
        isimlerList.set(2,isimlerList.get(7));
        isimlerList.set(7,temp);
        for (int i = 0; i <10 ; i++) {
            isimler[i]=isimlerList.get(i);
        }
        System.out.println(Arrays.toString(isimler));
    }

}
