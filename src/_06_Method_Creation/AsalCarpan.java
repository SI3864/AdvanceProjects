package _06_Method_Creation;

import java.util.Scanner;

public class AsalCarpan {
	static 	int bolen=0;
	static boolean isAsal=true;
	

	public static void main(String[] args) {
		/* TASK :
		 * Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir
		 * METHOD create ediniz.
		 * 
		 * Ör: Input : 50 
		 *     Bolenler : 2,5,10,20,50 
		 *     Asal Bolenler: 2,5 
		 *     En buyuk asal carpan: 5
		 */

		Scanner scan = new Scanner (System.in);
		System.out.println("sayi giriniz : ");
		int sayi = scan.nextInt();
		asalCarpan(sayi);

	}

	private static void asalCarpan(int sayi) {
		int asalbolen=0;
		for (int i = 2; i<=sayi; i++) {

			if (sayi%i == 0){
				bolen=i ;
				asalMi(bolen);
			}if (isAsal){
				asalbolen=bolen;
			}
		}
		System.out.println(asalbolen);
	}

	private static boolean asalMi(int bolen) {
		for (int i = 2; i<bolen; i++) {
			if (bolen%i==0){ // bolen sayisini tum tamsayilar sifir degilse
							// bu sayi kendisinden baska hic bir sayi ya bolunmez
				isAsal=false;
				break;
			}
		}
		return isAsal;
	}


}