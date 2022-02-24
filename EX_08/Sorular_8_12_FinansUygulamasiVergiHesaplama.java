package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_12_FinansUygulamasiVergiHesaplama {
	/*
(Finans uygulamas�: vergi hesaplama) Madde 3.5 ComputeTax.java�y� dizi kullanarak yeniden yaz�n�z. Her bir bildirim t�r� i�in alt� farkl� vergi oran� bulunur. Her oran vergilendirilebilir gelirin belirli miktar�na uygulan�r.

�rne�in vergilendirilebilir gelir 400 000$ ve m�kellef bekar olsun; $8,350 i�in vergi oran� 10%, (33,950 - 8,350) i�in vergi oran� %15, (82,250 - 33,950) i�in vergi oran� %25, (171,550 - 82,550) i�in vergi oran� %28, (372,550 - 82,250) i�in vergi oran� %33 ve
 (400,000 - 372,950) i�in vergi oran� %35. Her bildirim t�r� i�in vergi oranlar� ayn�d�r ve bu oranlar a�a��daki dizide verilmi�tir.

double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

Her bildirim t�r� i�in vergi oran�na g�re beyan edilen miktarlar a�a��daki iki boyutlu dizide verilmi�tir.

int[][] vergiDilimleri = {{8350, 33950, 82250, 171550, 372950}, // Single filer // Bekar
					
					{16700, 67900, 137050, 20885, 372950}, // Married jointly  -or qualifying widow(er) // Evli veya E�ler birlikte
					
					{8350, 33950, 68525, 104425, 186475}, // Married separately // E�ler ayr� ayr�
					
					{11950, 45500, 117450, 190200, 372950}}; // Head of household  // Aile reisi


Bekar bir m�kellefin vergilendirilebilir gelirinin 400 000$ oldu�unu varsayal�m. �denecek vergi a�a��daki �ekilde hesaplanabilir.

vergi = vergiDilimleri[0][0] * oranlar[0] +

(vergiDilimleri[0][1] � vergiDilimleri[0][0]) * oranlar[1] +

(vergiDilimleri[0][2] � vergiDilimleri[0][1]) * oranlar[2] +

(vergiDilimleri[0][3] � vergiDilimleri[0][2]) * oranlar[3] +

(vergiDilimleri[0][4] � vergiDilimleri[0][3]) * oranlar[4] +

(400000 � vergiDilimleri[0][4]) * oranlar[5]
	 */

	 public static void main(String[] args) {
		    // Create a Scanner
		    Scanner klavye = new Scanner(System.in);
		    System.out.print("(0-Bekar, 1-Evli veya E�ler birlikte, 2-E�ler ayr� ayr�, 3-Aile reisi)\n Medeni durumu giriniz: ");
		    
		    int medeniDurum = klavye.nextInt();
		 
			int[][] vergiDilimleri = {{8350, 33950, 82250, 171550, 372950}, // Bekar
								
								{16700, 67900, 137050, 20885, 372950}, // Evli veya E�ler birlikte
								
								{8350, 33950, 68525, 104425, 186475}, // E�ler ayr� ayr�
								
								{11950, 45500, 117450, 190200, 372950}};// Aile reisi
			
			double[] oranlar = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};   // Vergi oranlar�
			
			if(medeniDurum < 0 || medeniDurum > 3) {
				System.out.println("Hata: Ge�ersiz Medeni durum");
			    System.exit(1);
			}else {
				System.out.print("Vergilendirilebilir geliri giriniz: ");
			    double gelir = klavye.nextDouble();
				double vergi=vergiHesapla(vergiDilimleri, oranlar, medeniDurum, gelir);   // Bu metodla b�t�n medeni durumlar ve t�m gelir seviyelerinin vergilendirilmesi yap�labilir.
			    System.out.println("Vergi miktar� : " + (int)(vergi * 100) / 100.0);
			}
	  }
	 	
	public static double vergiHesapla(int[][] vergiDilimleri, double[] oranlar,int medeniDurum, double gelir) {   // Bu algoritma  �u github linkinden al�nm��t�r :  
														//   https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_08/Exercise_08_12/Exercise_08_12.java
		double vergi = 0, vergilendirilmisGelir = 0;		// Bu metodla vergi, gelir seviyesini en y�ksekten alarak  0  gelire dogru gidiecek �ekilde vergiyi hesaplayacak �ekilde kurgulanm��t�r.
		for (int i = 4; i >= 0; i--) {
			if (gelir > vergiDilimleri[medeniDurum][i])
					vergi += (vergilendirilmisGelir = gelir - vergiDilimleri[medeniDurum][i]) * oranlar[i + 1];
				gelir -= vergilendirilmisGelir;
		} 
		return vergi += vergiDilimleri[medeniDurum][0] * oranlar[0];    
	}

}

