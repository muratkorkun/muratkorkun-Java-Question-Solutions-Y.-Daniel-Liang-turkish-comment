package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_12_FinansUygulamasiVergiHesaplama {
	/*
(Finans uygulamasý: vergi hesaplama) Madde 3.5 ComputeTax.java’yý dizi kullanarak yeniden yazýnýz. Her bir bildirim türü için altý farklý vergi oraný bulunur. Her oran vergilendirilebilir gelirin belirli miktarýna uygulanýr.

Örneðin vergilendirilebilir gelir 400 000$ ve mükellef bekar olsun; $8,350 için vergi oraný 10%, (33,950 - 8,350) için vergi oraný %15, (82,250 - 33,950) için vergi oraný %25, (171,550 - 82,550) için vergi oraný %28, (372,550 - 82,250) için vergi oraný %33 ve
 (400,000 - 372,950) için vergi oraný %35. Her bildirim türü için vergi oranlarý aynýdýr ve bu oranlar aþaðýdaki dizide verilmiþtir.

double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

Her bildirim türü için vergi oranýna göre beyan edilen miktarlar aþaðýdaki iki boyutlu dizide verilmiþtir.

int[][] vergiDilimleri = {{8350, 33950, 82250, 171550, 372950}, // Single filer // Bekar
					
					{16700, 67900, 137050, 20885, 372950}, // Married jointly  -or qualifying widow(er) // Evli veya Eþler birlikte
					
					{8350, 33950, 68525, 104425, 186475}, // Married separately // Eþler ayrý ayrý
					
					{11950, 45500, 117450, 190200, 372950}}; // Head of household  // Aile reisi


Bekar bir mükellefin vergilendirilebilir gelirinin 400 000$ olduðunu varsayalým. Ödenecek vergi aþaðýdaki þekilde hesaplanabilir.

vergi = vergiDilimleri[0][0] * oranlar[0] +

(vergiDilimleri[0][1] – vergiDilimleri[0][0]) * oranlar[1] +

(vergiDilimleri[0][2] – vergiDilimleri[0][1]) * oranlar[2] +

(vergiDilimleri[0][3] – vergiDilimleri[0][2]) * oranlar[3] +

(vergiDilimleri[0][4] – vergiDilimleri[0][3]) * oranlar[4] +

(400000 – vergiDilimleri[0][4]) * oranlar[5]
	 */

	 public static void main(String[] args) {
		    // Create a Scanner
		    Scanner klavye = new Scanner(System.in);
		    System.out.print("(0-Bekar, 1-Evli veya Eþler birlikte, 2-Eþler ayrý ayrý, 3-Aile reisi)\n Medeni durumu giriniz: ");
		    
		    int medeniDurum = klavye.nextInt();
		 
			int[][] vergiDilimleri = {{8350, 33950, 82250, 171550, 372950}, // Bekar
								
								{16700, 67900, 137050, 20885, 372950}, // Evli veya Eþler birlikte
								
								{8350, 33950, 68525, 104425, 186475}, // Eþler ayrý ayrý
								
								{11950, 45500, 117450, 190200, 372950}};// Aile reisi
			
			double[] oranlar = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};   // Vergi oranlarý
			
			if(medeniDurum < 0 || medeniDurum > 3) {
				System.out.println("Hata: Geçersiz Medeni durum");
			    System.exit(1);
			}else {
				System.out.print("Vergilendirilebilir geliri giriniz: ");
			    double gelir = klavye.nextDouble();
				double vergi=vergiHesapla(vergiDilimleri, oranlar, medeniDurum, gelir);   // Bu metodla bütün medeni durumlar ve tüm gelir seviyelerinin vergilendirilmesi yapýlabilir.
			    System.out.println("Vergi miktarý : " + (int)(vergi * 100) / 100.0);
			}
	  }
	 	
	public static double vergiHesapla(int[][] vergiDilimleri, double[] oranlar,int medeniDurum, double gelir) {   // Bu algoritma  þu github linkinden alýnmýþtýr :  
														//   https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_08/Exercise_08_12/Exercise_08_12.java
		double vergi = 0, vergilendirilmisGelir = 0;		// Bu metodla vergi, gelir seviyesini en yüksekten alarak  0  gelire dogru gidiecek þekilde vergiyi hesaplayacak þekilde kurgulanmýþtýr.
		for (int i = 4; i >= 0; i--) {
			if (gelir > vergiDilimleri[medeniDurum][i])
					vergi += (vergilendirilmisGelir = gelir - vergiDilimleri[medeniDurum][i]) * oranlar[i + 1];
				gelir -= vergilendirilmisGelir;
		} 
		return vergi += vergiDilimleri[medeniDurum][0] * oranlar[0];    
	}

}

