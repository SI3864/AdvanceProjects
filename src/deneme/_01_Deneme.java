package deneme;

public class _01_Deneme {
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
        int n =5;
        System.out.println("5*5 kare");
        for (int i=1; i<=n; i++) { // 5*5 kare
         for (int j=1; j<=n; j++){
             System.out.print("# ");
         }
            System.out.println();
        }
        System.out.println("sola yatan ters dik ucgen");
        for (int i=1; i<=n; i++) { // sola yatan ters dik ucgen
            for (int j=i; j<=n; j++) // kareden farki bu satirda "j=i;" yapildi
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("sola yatan dik ucgen");
        for (int i=1; i<=n; i++) { // sola yatan dik ucgen
            for (int j=1; j<=i; j++) // kareden farki bu satirda "j<=i" yapildi
                System.out.print("$ ");
            System.out.println();
        }
        System.out.println("saga yatan dik ucgen");
        for (int i=1; i<=n; i++) { // saga yatan dik ucgen
            for (int j = i; j <= n; j++) { // kareden farki bu satirda "j=i;" yapildi
                System.out.print("  "); // burada tirnak ici citf bosluk
            }
            for (int j = 1; j <= i; j++) { // kareden farki bu satirda "j<=i" yapildi
                System.out.print("& ");
            }
            System.out.println();
        }
        System.out.println("eskenar ucgen");
        for (int i=1; i<=n; i++) { // eskenar ucgen
            for (int j = i; j <= n; j++) { // kareden farki bu satirda "j=i;" yapildi
                System.out.print(" "); // burada tirnak ici tek bosluk
            }
            for (int j = 1; j <= i; j++) {// kareden farki bu satirda "j<=i" yapildi
                System.out.print("? ");
            }
            System.out.println();
        }
        System.out.println("4*5 dikdortgen");
        for (int i=1; i<n; i++) { // 4*5 dikdortgen -- kareden farki bu satirda "i<n" yapildi
            for (int j=1; j<=n; j++){
                System.out.print("#"); // tirnak ici bosluk yok
            }
            System.out.println();
        }
        System.out.println("5*5 kare den carpi");
        for (int i=1; i<=n; i++) { // 5*5 kare den carpi oldu
            for (int j=1; j<=n; j++){
                if (i == j || i+j == n+1) // bu satir eklendi
                    System.out.print("# ");
                else                        //bu satir eklendi
                    System.out.print("  ");  //bu satir eklendi ve tirnak cift cosluk
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
