package deneme;

public class _05_deneme {
    public static void main(String[] args) {
        int weeks = 3;
        int days = 7;
        // outer loop
        for(int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);
            // inner loop
            for(int j = 1; j <= days; ++j) {
                // break ile ic dongu durur
                if(i == 2) {
                    break;
                }
                System.out.println("  Days: " + j);
            }

        }

        System.out.println("+++++++++++++");

        int hafta = 3;
        int gun = 7;
        // outer loop
        for(int i = 1; i <= hafta; ++i) {
            System.out.println("hafta: " + i);
            // inner loop
            for(int j = 1; j <= gun; ++j) {
                // continue ile ic dongu dewam eder
                if(j % 2 != 0) {
                    continue;
                }
                System.out.println("  gun: " + j);
            }
        }

        System.out.println("+++++++++++++");

     int n =5;
     for (int i =0; i < n; i++){ // outer
         for (int j =0; j < n; j++){ // inner
             System.out.print("* ");
         }
         System.out.println();
     }

     System.out.println("+++++++++++++");

       int s = 5 , i =1;
        while (s > i){ // outer
            for (int j = 0; j < s; j++) { // inner
                System.out.print("* ");
            }
            System.out.println();
            ++i;
        }
        System.out.println("+++++++++++++");

        int input =5;
        for (int d = 1; d <= input ; d++) {
            for (int j = 1; j <= input; j++) {
                System.out.print((d * j) + " ");
            }
            System.out.println("");
        }


    }
}
