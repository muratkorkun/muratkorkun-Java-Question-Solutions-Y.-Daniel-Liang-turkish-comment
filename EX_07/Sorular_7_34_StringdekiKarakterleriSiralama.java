package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_34_StringdekiKarakterleriSiralama {
	/*
	 * **7.34 (string’deki karakterleri sýralama) string’leri sýralanmýþ olarak geri
	 * döndüren aþaðýdaki bildirime sahip bir metod yazýnýz.
	 * 
	 * public static String sort(String s)
	 * 
	 * Örneðin, sort(”acb”)’nin geri dönüþ deðeri abc.
	 * 
	 * Kullanýcýdan bir string girmesini isteyen ve bu string’in sýralanmýþ halini
	 * gösteren bir test programý yazýnýz.
	 */
	public static void main(String[] args) {
		System.out.println("Lütfen bir yazý giriniz");
		Scanner klavye = new Scanner(System.in);

		String str = klavye.nextLine();
		klavye.close();
	
		
		System.out.println("String ifadenin harflerinin küçükten büyüðe sýralanýþý þu þekildedir : \n"+harfleriSirala(str));

	}

	private static String harfleriSirala(String str) {  
		char[] charDizisi = new char[str.length()];  // String ifadenin  karakter sayýsý uzunluðunda içi boþ char dizisi oluþturduk.
		
		for (int i = 0; i < charDizisi.length; i++) { // Bu dizinin içine string ifadenin karakterlerini atadýk.
			charDizisi[i]=str.charAt(i);
		}

		String yeniStr = "";   // Method String döndürmemizi istediðinden içi boþ yeni bir String oluþturduk. 

		for (int i = 0; i < charDizisi.length - 1; i++) {  // selectedSort methodunu char karakterlere uyarladýk ve char dizisini sýraladýk.
			char enKucuk = charDizisi[i];
			int enKucukIndis = i;

			for (int j = i + 1; j < str.length(); j++) {  // Burada  enkucuk karakteri ve onun indisini bulduk. Aþaðýda da bulduðumuz deðerleri swap yaptýk.
				if (enKucuk> charDizisi[j]) {
					enKucuk = charDizisi[j];
					enKucukIndis = j;
				}
			}
																
			if (enKucuk != charDizisi[i]) {      	   // Enkucuk sayý ve indisini belirledikten sonra dýþ döngünün herbir turu sonunda sonra swap algoritmasý kullandýk.
				charDizisi[enKucukIndis] = charDizisi[i];
				charDizisi[i] = enKucuk;
			}

		}
		for (int i = 0; i < charDizisi.length; i++) {    // yeni oluþturduðumuz str dizisine char dizisindeki sýralanmýþ karakterleri tek tek atadýk.
			yeniStr+=charDizisi[i];
		}

		return yeniStr;
	}
}        // örneklem   ====>    b c d f g a h s k l a  v c b 
