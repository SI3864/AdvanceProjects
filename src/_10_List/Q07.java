package _10_List;

public class Q07 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int arr1[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        boolean simetrikMi=true;
        for (int i = 0; i <arr1.length ; i++) {
            if(arr1[i]!=arr1[arr1.length-1-i]) {
                simetrikMi=false;
                break;
            }
        }
        if(simetrikMi) {
            System.out.println("Verilen array simetriktir.");
        }
        else System.out.println("Verilen array simetrik değildir.");
    }

}
