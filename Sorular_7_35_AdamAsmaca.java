package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_35_AdamAsmaca {
	/*
	 * 
	 ** 7.35 (Oyun: adam asmaca) Rastgele kelime �reten ve her seferinde kullan�c�dan
	 * bir harf girmesini isteyen �rnek ak��taki gibi bir adam asmaca oyunu yaz�n�z.
	 * Kelimedeki her harf y�ld�z olarak g�sterilecek. E�er kullan�c� do�ru harfi
	 * tahmin ederse, bulundu�u yerdeki y�ld�z yerine harf g�sterilecek. Kullan�c�y�
	 * kelimeyi buldu�unda, yanl�� girdi�i harf say�s�n� g�steriniz ve ba�ka bir
	 * kelimeyle yeniden oynamak isteyip istemedi�ini sorunuz. A�a��daki gibi
	 * kelimeleri saklayacak bir dizi olu�turunuz:
	 * 
	 * 
	 * // Bulunmas�n� istedi�iniz kelimeleri bu diziye ekleyiniz.
	 * 
	 * String[] words = {"write", "that", ...};
	 * 
	 * (Tahmin) Bir harf giriniz ******* > p
	 * 
	 * (Tahmin) Bir harf giriniz p****** > r
	 * 
	 * (Tahmin) Bir harf giriniz pr**r** > p
	 * 
	 * p harfi zaten yerlestirildi
	 * 
	 * (Tahmin) Bir harf giriniz pr**r** > o
	 * 
	 * (Tahmin) Bir harf giriniz pro*r** > g
	 * 
	 * (Tahmin) Bir harf giriniz progr** > n
	 * 
	 * n harfi sozcukte yok
	 * 
	 * (Tahmin) Bir harf giriniz progr** > m
	 * 
	 * (Tahmin) Bir harf giriniz progr*m > a
	 * 
	 * Sorulan sozcuk: program. 1 kez kaybettiniz
	 * 
	 * Baska bir sozcuk tahmin etmek ister misiniz? Evetse (E), Hayirsa (H) giriniz.
	 */
	public static void main(String[] args) {
		// Oyunda kullanaca��m�z kelimeleri tutan bir dizi olu�turduk.
		String[] turkceKelimeler = {"buzdolab�", "makas", "televizyon", "defter", "kitap","kalem", "silgi","kalemt�ra�", "a�acak", "bilgisayar", "�anta", "fare", "monit�r","java","volkan","istek"};
		
		boolean oyunDevamEtsinMi = true;

		Scanner klavye = new Scanner(System.in);

		while (oyunDevamEtsinMi) {

			String rassalKelime = turkceKelimeler[(int)(Math.random()*turkceKelimeler.length)];   // Kelimeler dizisinden Rasgele bir kelime almak i�in gerekli kodu yazd�k.

			char[] rassalKelimeHafleri = new char[rassalKelime.length()];    //Kelimenin ahrflerinini tek tek char dizisi olu�turduk ve i�ine doldurduk.
			for (int i = 0; i < rassalKelimeHafleri.length; i++) {
				rassalKelimeHafleri[i] = rassalKelime.charAt(i);
			}
			boolean[] harfBulunmaDurumu = new boolean[rassalKelime.length()];   // Char dizisi uzunlu�unda boolean de�er tutan boolean birdizi olu�turduk. Bu dizinin de�erleri hangi harfi bulup bulmad���m�z�n k�yaslamas�n� tutmu� olacak.
			System.out.println("Aranan kelime " + rassalKelime.length() + " harflidir.");
			
			int yanl�sHarfSayaci = 0;					// yanl�� harf sayaci olu�turduk.
			int bulunanHarfSayaci = 0;				 // bulunan harflerin say�s�n� tuttuk. B�t�n harfler bulunduysa oyun bitebilir.

			while (bulunanHarfSayaci < rassalKelime.length()) {
				System.out.print("(Tahmin) Bir harf giriniz ");

				diziDurumunuYazdir(rassalKelimeHafleri, harfBulunmaDurumu);  // dizidurumunu yani harflerin bulundu�u  kadar�n� ekrana basan methodu yazd�k.

				System.out.print(" > ");

				String harfTahmin = klavye.next().toLowerCase();		//kullan�c�dan harf istedik ve harfi ald�k.
				char karakterTahmin=harfTahmin.charAt(0);			
				

				boolean ayniHarfMi = false;									// harf kelimede tekrar ediyorsa ve zaten yerle�tirilmi� bir harf ise bunun de�erini tuttuk. Ve gerekti�inde resetledik.
				boolean harfIcindeVarmi = false;					
				for (int i = 0; i < harfBulunmaDurumu.length; i++) {    // harfi kullan�c�dan ald���m�zda char dizisi i�indeki durumunu k�yaslad�k  ve bir ��kt� ekrana bast�rd�k.

					if (rassalKelimeHafleri[i] == karakterTahmin && harfBulunmaDurumu[i] && ayniHarfMi == false) {
						System.out.println(karakterTahmin + " harfi zaten yerle�tirilmi�.");
						harfIcindeVarmi = true;
						ayniHarfMi = true;

					} else if (karakterTahmin == rassalKelimeHafleri[i] && harfBulunmaDurumu[i] == false) {
						harfBulunmaDurumu[i] = true;
						bulunanHarfSayaci++;
						harfIcindeVarmi = true;
					}
				}
				if (harfIcindeVarmi == false) {
					System.out.println(karakterTahmin + " harfi s�zc�kte yoktur.");
					yanl�sHarfSayaci++;
				}
			}
			System.out.println(
					" Sorulan s�zc�k " + rassalKelime + "\n " + ((yanl�sHarfSayaci==0)?"Hi� yanl�� tahmin etmediniz.":yanl�sHarfSayaci + " kez yanl�� tahmin ettiniz. "));
			
			System.out.print("Baska bir sozcuk tahmin etmek ister misiniz? Evetse (E), Hayirsa (H) giriniz.");
			
			if(!oyunaDevamM�()) {
				System.out.print("Bir dahaki sefere g�r��mek �zere.");
				oyunDevamEtsinMi=false;
			}
				
		}
		

	}
	public static boolean oyunaDevamM�() {   // oyunun devam edip etmeyece�ini boolean de�er olarak veren methodu yazd�k.
		Scanner input=new Scanner(System.in);
		String str=input.next();
		char secim=str.toLowerCase().charAt(0);
		if(secim=='h') {
			return false;
		}else if(secim=='e') {
			return true;
		}
		return true;
	}
	
	public static void diziDurumunuYazdir(char[] rassalKelimeHafleri, boolean[] harfBulunmaDurumu) {  // dizi durumunu harfin bulunup bulunmama durumuna g�re ekrana basan methodu yazd�k.
		for (int i = 0; i < harfBulunmaDurumu.length; i++) {
			if (harfBulunmaDurumu[i] == false) {
				System.out.print("*");
			} else {
				System.out.print(rassalKelimeHafleri[i]);
			}
		}
	}
	
}
