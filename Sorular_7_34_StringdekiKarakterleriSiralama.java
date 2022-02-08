package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_34_StringdekiKarakterleriSiralama {
	/*
	 * **7.34 (string�deki karakterleri s�ralama) string�leri s�ralanm�� olarak geri
	 * d�nd�ren a�a��daki bildirime sahip bir metod yaz�n�z.
	 * 
	 * public static String sort(String s)
	 * 
	 * �rne�in, sort(�acb�)�nin geri d�n�� de�eri abc.
	 * 
	 * Kullan�c�dan bir string girmesini isteyen ve bu string�in s�ralanm�� halini
	 * g�steren bir test program� yaz�n�z.
	 */
	public static void main(String[] args) {
		System.out.println("L�tfen bir yaz� giriniz");
		Scanner klavye = new Scanner(System.in);

		String str = klavye.nextLine();
		klavye.close();
	
		
		System.out.println("String ifadenin harflerinin k���kten b�y��e s�ralan��� �u �ekildedir : \n"+harfleriSirala(str));

	}

	private static String harfleriSirala(String str) {  
		char[] charDizisi = new char[str.length()];  // String ifadenin  karakter say�s� uzunlu�unda i�i bo� char dizisi olu�turduk.
		
		for (int i = 0; i < charDizisi.length; i++) { // Bu dizinin i�ine string ifadenin karakterlerini atad�k.
			charDizisi[i]=str.charAt(i);
		}

		String yeniStr = "";   // Method String d�nd�rmemizi istedi�inden i�i bo� yeni bir String olu�turduk. 

		for (int i = 0; i < charDizisi.length - 1; i++) {  // selectedSort methodunu char karakterlere uyarlad�k ve char dizisini s�ralad�k.
			char enKucuk = charDizisi[i];
			int enKucukIndis = i;

			for (int j = i + 1; j < str.length(); j++) {  // Burada  enkucuk karakteri ve onun indisini bulduk. A�a��da da buldu�umuz de�erleri swap yapt�k.
				if (enKucuk> charDizisi[j]) {
					enKucuk = charDizisi[j];
					enKucukIndis = j;
				}
			}
																
			if (enKucuk != charDizisi[i]) {      	   // Enkucuk say� ve indisini belirledikten sonra d�� d�ng�n�n herbir turu sonunda sonra swap algoritmas� kulland�k.
				charDizisi[enKucukIndis] = charDizisi[i];
				charDizisi[i] = enKucuk;
			}

		}
		for (int i = 0; i < charDizisi.length; i++) {    // yeni olu�turdu�umuz str dizisine char dizisindeki s�ralanm�� karakterleri tek tek atad�k.
			yeniStr+=charDizisi[i];
		}

		return yeniStr;
	}
}        // �rneklem   ====>    b c d f g a h s k l a  v c b 
