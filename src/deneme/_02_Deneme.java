package deneme;

public class _02_Deneme {
    public static void main(String[] args) {
        /* TASK :
            Aşağıdaki şekilde çıktı veren programı print içerisinde
            sadece bir tane # kullanarak yazıdırınız

           #####
           #####
           #####
           #####
           #####
         */
       int n = 8 ;
       for (int i = 1 ; i <=n ; i++){
           for (int j = 1 ; j <=i ; j++){
               System.out.print("# ");
           }
           System.out.println();
       }
        System.out.println("5*5 kare den ici bos kare");
        for (int i=1; i<=n; i++) { // 5*5 kare den ici bos kare
            for (int j=1; j<=n; j++){
                if (i==1 || j==1 || i==n || j==n) // bu satir eklendi
                    System.out.print("# ");
                else                        //bu satir eklendi
                    System.out.print("  ");  //bu satir eklendi ve tirnak cift cosluk
            }
            System.out.println();
        }
    }

}
