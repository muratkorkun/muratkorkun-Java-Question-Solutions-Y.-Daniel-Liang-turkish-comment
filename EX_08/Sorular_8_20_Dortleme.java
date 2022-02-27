package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_20_Dortleme {
/*	***8.20 (Oyun: dörtleme)Dörtleme iki kiþi ile oynanýr. Oyuncular birbirinden farklý renklerde diskleri 
 * 7 sütun ve 6 sýradan oluþan bir boþluklu tahta üzerinde, aþaðýda gösterildiði gibi yukarýdan býrakýrlar.

Oyunun amacý ayný renkte olan 4 diski satýr, sütun ya da çapraz olarak rakibinden önce yan yana getirmektir. 
Program sýrasýyla iki oyuncudan; biri sarý(Y), diðeri kýrmýzý(R) olmak üzere bir disk koymalarýný isteyecek.
 Aþaðýdaki görselde kýrmýzý disk daha koyu, sarý disk daha açýk renkte gösterilmiþtir. 
 Oyuncu oynadýktan sonra program tablonun durumunu gösterecek ve oyunun durumuna karar verecek.  (Kazandýnýz, berabere kaldýnýz, devam edin) Örnek akýþý inceleyiniz:
                    0 - 6 sutunlarindan birine kirmizi bir disk koyun: 0
                    0 - 6 sutunlarindan birine sari bir disk koyun: 3
                   0 - 6 sutunlarindan birine sari bir disk koyun: 6
                  Sari diskli oyuncu kazandi.
 */
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		char tahta[][]=tahtaAl(6,7);
		tahtaYazdir(tahta);
		int sutunNo;
		
		while(true) {						//Oyunu baþlatan ve bitene kadar devam ettiren metod.
			while(true) {
				System.out.print(" 0 - 6 sutunlarindan birine kýrmýzý bir disk koyun : ");
				sutunNo=sutunNoAl(klavye);
				if(tahtaGuncelle(tahta, 'K', sutunNo)) {
					tahtaYazdir(tahta);
					break;
				}
			}
			if(oyunBittiMi(tahta, 'K')){
				break;
			}
			while(true) {
				System.out.print(" 0 - 6 sutunlarindan birine sarý bir disk koyun : ");
				sutunNo=sutunNoAl(klavye);
				if(tahtaGuncelle(tahta, 'S', sutunNo)) {
					tahtaYazdir(tahta);
					break;
				}
			}
			if(oyunBittiMi(tahta, 'S')){
				break;
			}
		}
		klavye.close();
	}
	
	public static char[][] tahtaAl(int satir, int sutun){    // Boþluk karakteri ile düm tahtyý dolduran metod.
		char[][] matris=new char[satir][sutun];
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				matris[i][j]=' ';
			}
		}
		return matris;
	}
	
	public static void tahtaYazdir(char[][] tahta) {		// Tahtayý ekrana yazdýran metod.
		for (int i = 0; i < tahta.length; i++) {
			System.out.println("\t\t\t\t");
			System.out.print("|");
			for (int j = 0; j < tahta[i].length; j++) {
				System.out.print(" "+tahta[i][j]+" |");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
	
	public static int sutunNoAl(Scanner klavye) {			//Uygun sutun numarasý alan metod.
		int sutun=klavye.nextInt();
		while(sutun >6 || sutun <0 ) {
			System.out.print("Hatalý giriþ : slot numarasý 0-6 arasýnda olmalýdýr. ");
			sutun=klavye.nextInt();
		}
		return sutun;
	}
	
	public static boolean tahtaGuncelle(char[][] tahta,char ch,int sutunNo) {  // Tahtayý güncelleyen metod.
		if(tahta[0][sutunNo] !=' ') {
			System.out.print("Seçtiðiniz slot dolu baþka slot seçiniz. ");
			return false;
		}else {
			for (int i = tahta.length-1; i > -1; i--) {
				if(tahta[i][sutunNo]==' ') {
					tahta[i][sutunNo]=ch;
					break;
				}
			}
		}
		return true;
	}
	
	public static boolean oyunBittiMi(char[][] tahta,char oyuncuSembol) {   // Kontrol ettigiði oyuncu sembolüne göre oyun bitme durumlarýný ekrana yazdýran metod.
		if(dortlemeVarMi(tahta, oyuncuSembol)) {
			System.out.print((oyuncuSembol=='K'?"Kýrmýzý":"Sarý")+" oyuncu kazandý.");
			return true;
		}else if(tumKutularDoluMu(tahta)) {
			System.out.print("Berabere kaldýnýz. ");
			return true;
		}
		return false;
	}
	
	public static boolean dortlemeVarMi(char[][] tahta,char ch)  {			// Dörtleme var mý kontrol eden metod.
		for(int i = 0; i < tahta.length; i++)						//Dikey kontrol
			for(int j = 0; j < tahta[i].length - 3; j++)
				if(ch == tahta[i][j] && tahta[i][j] == tahta[i][j + 1] &&
					 tahta[i][j + 1] == tahta[i][j + 2] &&
					 tahta[i][j + 2] == tahta[i][j + 3])
					return true;
		
		for(int i = 0; i < tahta.length - 3; i++)					//Yatay kontrol
			for(int j = 0; j < tahta[i].length; j++)
				if (ch == tahta[i][j] && tahta[i][j] == tahta[i + 1][j] &&
				    tahta[i + 1][j] == tahta[i + 2][j] &&
				    tahta[i + 2][j] == tahta[i + 3][j])
				 	return true;
		
		for(int i = 0; i < tahta.length - 3; i++)					// Aþaðý akýþ kontrolü
			for(int j = 0; j < tahta[i].length - 3; j++)
				if (ch == tahta[i][j] && tahta[i][j] == tahta[i + 1][j + 1] &&
				    tahta[i + 1][j + 1] == tahta[i + 2][j + 2] &&
				    tahta[i + 2][j + 2] == tahta[i + 3][j + 3])
					return true;
		
		for(int i = tahta.length - 1; i >= 3; i--)					// Yukarý akýþ kontrolü
			for(int j = 0; j < tahta[i].length - 3; j++)	
				if (ch == tahta[i][j] && tahta[i][j] == tahta[i - 1][j + 1] &&
						tahta[i - 1][j + 1] == tahta[i - 2][j + 2] &&
						tahta[i - 2][j + 2] == tahta[i - 3][j + 3])
					return true;
		return false;				
	}

	public static boolean tumKutularDoluMu(char[][] tahta) {	// Beraberlik durumu için tüm kutularýn dolu olup olmadýðýný kontrol eden metod.
		for (int i = 0; i < tahta.length; i++) {
			for (int j = 0; j < tahta[i].length; j++) {
				if (tahta[i][j] ==' '){
						return false;
				}
			}
		}
		return true;
	}
}
