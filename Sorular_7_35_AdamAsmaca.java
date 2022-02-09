package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_35_AdamAsmaca {
	/*
	 * 
	 ** 7.35 (Oyun: adam asmaca) Rastgele kelime üreten ve her seferinde kullanýcýdan
	 * bir harf girmesini isteyen örnek akýþtaki gibi bir adam asmaca oyunu yazýnýz.
	 * Kelimedeki her harf yýldýz olarak gösterilecek. Eðer kullanýcý doðru harfi
	 * tahmin ederse, bulunduðu yerdeki yýldýz yerine harf gösterilecek. Kullanýcýyý
	 * kelimeyi bulduðunda, yanlýþ girdiði harf sayýsýný gösteriniz ve baþka bir
	 * kelimeyle yeniden oynamak isteyip istemediðini sorunuz. Aþaðýdaki gibi
	 * kelimeleri saklayacak bir dizi oluþturunuz:
	 * 
	 * 
	 * // Bulunmasýný istediðiniz kelimeleri bu diziye ekleyiniz.
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
		// Oyunda kullanacaðýmýz kelimeleri tutan bir dizi oluþturduk.
		String[] turkceKelimeler = {"buzdolabý", "makas", "televizyon", "defter", "kitap","kalem", "silgi","kalemtýraþ", "açacak", "bilgisayar", "çanta", "fare", "monitör","java","volkan","istek"};
		
		boolean oyunDevamEtsinMi = true;

		Scanner klavye = new Scanner(System.in);

		while (oyunDevamEtsinMi) {

			String rassalKelime = turkceKelimeler[(int)(Math.random()*turkceKelimeler.length)];   // Kelimeler dizisinden Rasgele bir kelime almak için gerekli kodu yazdýk.

			char[] rassalKelimeHafleri = new char[rassalKelime.length()];    //Kelimenin ahrflerinini tek tek char dizisi oluþturduk ve içine doldurduk.
			for (int i = 0; i < rassalKelimeHafleri.length; i++) {
				rassalKelimeHafleri[i] = rassalKelime.charAt(i);
			}
			boolean[] harfBulunmaDurumu = new boolean[rassalKelime.length()];   // Char dizisi uzunluðunda boolean deðer tutan boolean birdizi oluþturduk. Bu dizinin deðerleri hangi harfi bulup bulmadýðýmýzýn kýyaslamasýný tutmuþ olacak.
			System.out.println("Aranan kelime " + rassalKelime.length() + " harflidir.");
			
			int yanlýsHarfSayaci = 0;					// yanlýþ harf sayaci oluþturduk.
			int bulunanHarfSayaci = 0;				 // bulunan harflerin sayýsýný tuttuk. Bütün harfler bulunduysa oyun bitebilir.

			while (bulunanHarfSayaci < rassalKelime.length()) {
				System.out.print("(Tahmin) Bir harf giriniz ");

				diziDurumunuYazdir(rassalKelimeHafleri, harfBulunmaDurumu);  // dizidurumunu yani harflerin bulunduðu  kadarýný ekrana basan methodu yazdýk.

				System.out.print(" > ");

				String harfTahmin = klavye.next().toLowerCase();		//kullanýcýdan harf istedik ve harfi aldýk.
				char karakterTahmin=harfTahmin.charAt(0);			
				

				boolean ayniHarfMi = false;									// harf kelimede tekrar ediyorsa ve zaten yerleþtirilmiþ bir harf ise bunun deðerini tuttuk. Ve gerektiðinde resetledik.
				boolean harfIcindeVarmi = false;					
				for (int i = 0; i < harfBulunmaDurumu.length; i++) {    // harfi kullanýcýdan aldýðýmýzda char dizisi içindeki durumunu kýyasladýk  ve bir çýktý ekrana bastýrdýk.

					if (rassalKelimeHafleri[i] == karakterTahmin && harfBulunmaDurumu[i] && ayniHarfMi == false) {
						System.out.println(karakterTahmin + " harfi zaten yerleþtirilmiþ.");
						harfIcindeVarmi = true;
						ayniHarfMi = true;

					} else if (karakterTahmin == rassalKelimeHafleri[i] && harfBulunmaDurumu[i] == false) {
						harfBulunmaDurumu[i] = true;
						bulunanHarfSayaci++;
						harfIcindeVarmi = true;
					}
				}
				if (harfIcindeVarmi == false) {
					System.out.println(karakterTahmin + " harfi sözcükte yoktur.");
					yanlýsHarfSayaci++;
				}
			}
			System.out.println(
					" Sorulan sözcük " + rassalKelime + "\n " + ((yanlýsHarfSayaci==0)?"Hiç yanlýþ tahmin etmediniz.":yanlýsHarfSayaci + " kez yanlýþ tahmin ettiniz. "));
			
			System.out.print("Baska bir sozcuk tahmin etmek ister misiniz? Evetse (E), Hayirsa (H) giriniz.");
			
			if(!oyunaDevamMÝ()) {
				System.out.print("Bir dahaki sefere görüþmek üzere.");
				oyunDevamEtsinMi=false;
			}
				
		}
		

	}
	public static boolean oyunaDevamMÝ() {   // oyunun devam edip etmeyeceðini boolean deðer olarak veren methodu yazdýk.
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
	
	public static void diziDurumunuYazdir(char[] rassalKelimeHafleri, boolean[] harfBulunmaDurumu) {  // dizi durumunu harfin bulunup bulunmama durumuna göre ekrana basan methodu yazdýk.
		for (int i = 0; i < harfBulunmaDurumu.length; i++) {
			if (harfBulunmaDurumu[i] == false) {
				System.out.print("*");
			} else {
				System.out.print(rassalKelimeHafleri[i]);
			}
		}
	}
	
}
