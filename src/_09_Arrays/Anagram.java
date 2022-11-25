package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */
		Scanner input =new Scanner(System.in);
		System.out.print ("Lutfen Anagram icin 1. degeri giriniz : ");
		String str1 =input.nextLine().toLowerCase().replace(" ","");
		System.out.print("Lutfen Anagram icin 2. degeri giriniz : ");
		String str2 =input.nextLine().toLowerCase().replace(" ","");
		
		System.out.println(isAnagram(str1, str2));
	}
		public static boolean isAnagram(String str1,String str2) {
		//boolean isAnagram =false;
		char [] arr1 = str1.replace(" ", "").toLowerCase().toCharArray();
		char [] arr2 = str2.replace(" ", "").toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
		/*
			Scanner scan = new Scanner(System.in);
			System.out.print("Lütfen ilk kelimeyi giriniz:");
			String str1=scan.next().toLowerCase(Locale.ROOT);
			System.out.print("Lütfen ikinci kelimeyi giriniz:");
			String str2=scan.next().toLowerCase(Locale.ROOT);
			isAnagram(str1,str2);
		}
	private static void isAnagram(String str1, String str2) {

		if(str1.length()!=str2.length()) System.out.println("Kelimeler anagram değildir.");
		else{
			String arr1[]=new String[str1.length()];
			String arr2[]=new String[str2.length()];
			for (int i = 0; i <str1.length(); i++) {
				arr1[i]=str1.substring(i,i+1);
			}
			Arrays.sort(arr1);
			for (int i = 0; i <str2.length(); i++) {
				arr2[i]=str2.substring(i,i+1);
			}
			Arrays.sort(arr2);
			if(Arrays.toString(arr1).equals(Arrays.toString(arr2))) System.out.println("Kelimeler anagramdır");
			else System.out.println("Kelimeler anagram değildir.");
		}

		 */
	}

}
