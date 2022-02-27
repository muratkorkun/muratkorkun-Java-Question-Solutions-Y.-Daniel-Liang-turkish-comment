package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_19_DesenTanimaArdisikAyniDortSayi { //  Farklý bir kaynaktan faydalýnýlmýþtýr. 
	// Kaynak :   https://github.com/AmadeuszFilipek/Java-exercises/blob/master/Chapter8/src/Exercises/Exercise19.java

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("Matrisin satýr ve sutun sayýsýný giriniz . ");
		
	        int satirSayisi = klavye.nextInt();
	        int sutunSayisi= klavye.nextInt();
	        int[][] degerler = new int[satirSayisi][sutunSayisi];
	        System.out.println("Degerleri giriniz : ");
	        for (int i = 0; i < degerler.length; i++) {
	            for (int j = 0; j < degerler[i].length; j++) {
	                degerler[i][j] = klavye.nextInt();
	            }
	        }
		klavye.close();
		System.out.println("Matriste ardýþýk 4 sayi "+(ardisikDortluMu(degerler)?"vardýr.":"yoktur."));

	}
	public static boolean ardisikDortluMu(int[][] degerler)  {
		for(int i = 0; i < degerler.length; i++)						//Dikey kontrol
			for(int j = 0; j < degerler[i].length - 3; j++)
				if(degerler[i][j] == degerler[i][j + 1] &&
					 degerler[i][j + 1] == degerler[i][j + 2] &&
					 degerler[i][j + 2] == degerler[i][j + 3])
					return true;
		
		for(int i = 0; i < degerler.length - 3; i++)					//Yatay kontrol
			for(int j = 0; j < degerler[i].length; j++)
				if (degerler[i][j] == degerler[i + 1][j] &&
				    degerler[i + 1][j] == degerler[i + 2][j] &&
				    degerler[i + 2][j] == degerler[i + 3][j])
				 	return true;
		
		for(int i = 0; i < degerler.length - 3; i++)					// Aþaðý akýþ kontrolü
			for(int j = 0; j < degerler[i].length - 3; j++)
				if (degerler[i][j] == degerler[i + 1][j + 1] &&
				    degerler[i + 1][j + 1] == degerler[i + 2][j + 2] &&
				    degerler[i + 2][j + 2] == degerler[i + 3][j + 3])
					return true;
		
		for(int i = degerler.length - 1; i >= 3; i++)					// Yukarý akýþ kontrolü
			for(int j = 0; j < degerler[i].length - 3; j++)	
				if (degerler[i][j] == degerler[i - 1][j + 1] &&
						degerler[i - 1][j + 1] == degerler[i - 2][j + 2] &&
						degerler[i - 2][j + 2] == degerler[i - 3][j + 3])
					return true;
		
		return false;				
	}
}
