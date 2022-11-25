package deneme;
public class _03_Deneme {
    public static void main(String[] args) {

       String isim = "mehmet";
       String soyisim = "kocagoz";
        System.out.println("isim : " + isim + " " + soyisim);

        String sayi1 = "15";
        String sayi2 = "25";
        int donusum1 =Integer.parseInt(sayi1);
        int donusum2 =Integer.parseInt(sayi2);
        int donusumTop1 = donusum1 + donusum2;
        System.out.println("toplam :" + donusumTop1);
        int donusum3 =Integer.valueOf(sayi1);
        int donusum4 =Integer.valueOf(sayi2);
        int donusumTop2 = donusum3 + donusum4;
        System.out.println("toplam : " + donusumTop2);


    }
}
