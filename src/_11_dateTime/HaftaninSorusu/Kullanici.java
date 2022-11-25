package _11_dateTime.HaftaninSorusu;

import java.time.LocalDateTime;

public class Kullanici {
    String name;
    LocalDateTime kayitZamani;
    public Kullanici() {// p'siz

    }

    public Kullanici(String name, LocalDateTime kayitZamani) { // p´li
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
}
