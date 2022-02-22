package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_21_FasulyeMakinesi {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);

		System.out.println("Kaç top atmak istersiniz"); 
		int topSayisi = klavye.nextInt();
		
		System.out.println("Lütfen fasülye makinesinin kaç bölmeli olacaðýný giriniz");
		
		int slotSayisi = klavye.nextInt();

		klavye.close();

		fasulyeMakinesi(topSayisi, slotSayisi);   // topSayisini ve slotSayisini alan metodu aþaðýda yazdýk.

	}

	public static void fasulyeMakinesi(int topSayisi, int slotSayisi) {
		int[] slotlar = new int[slotSayisi];

		for (int i = 0; i < topSayisi; i++) {    // toplarý tek tek atýyoruz

			String[] topRotasyon = new String[slotSayisi - 1];  //top rotasyon sayýsý slot sayýsýndan daima 1 eksik olacaðýndan topRotasyon dizimizin sayýsýný bu þekilde belirledik. Bu diziyi her bir iç döngü çalýþmadan önce tur baþýnda sýfýrladýk.
			double yonlerToplami = 0;       // yonlerToplami'ni aþaðýda hesapladýk ve her yeni top atýldýðýnda bu sayýyý da sýfýrladýk.

			for (int j = 0; j < topRotasyon.length; j++) {  // burada rotasyon dizisinin eleman sayýsý kadar her bir top için rastgele bir rotasyon dizisi oluþturduk.
				double rastgeleYon = Math.random();  // 0-1 aralýðýnda rastgele bir sayý oluþturduk 

				if (rastgeleYon < 0.5) {
					topRotasyon[j] = "sol ";      // Bu sayýyý karþýlýk gelen yöne çevirdik.  Daha sonra rotasyon dizisi içine  atadýk.
					yonlerToplami += -0.5;        // Burada  her bir slotun ortadan ne kadar sola  gittiðini hesaplamak için 0.5 deðerini yonlerToplami'ndan çýkarttýk.
				} else {
					topRotasyon[j] = "sag ";
					yonlerToplami += 0.5;            // Burada  her bir slotun ortadan ne kadar saða  gittiðini hesaplamak için 0.5 deðerini yonlerToplami'ndan ekledik..
				}
				System.out.print(topRotasyon[j]);   // oluþan rotasyon dizimizi içerideki  döngü içinden çýkmadan tek tek yazdýrdýk. Yani rotasyon dizisi içine, deðeri atama yapar yapmaz hemen ardýndan ekrana yazdýrdýk.
			}
			slotlar[(int) (yonlerToplami + (0.5 * topRotasyon.length))]++;  // Burada  slotlar dizimizin içindeki hangi indisin (yani yönlerToplami'ndan gelen sayý) içine top düþtüðünü hesapladýk ve uygun indisin sayýsýný 1 artýrdýk. (integer aritmetiðinden faydalandýk.)
			System.out.println();
		}
		
		System.out.print("Slotlarýn içindeki toplarýn sayýsý : ");
		for (int sayi : slotlar) {   // Burada atýlan toplarýn  slotlar dizisinde hangi indislerde biriktiðini ekrana yazdýrarak gördük.
			System.out.print(sayi+" ");
		}
		
		slotlariYazdir(topSayisi, slotlar);

	}

	public static void slotlariYazdir(int topSayisi, int[] slotlar) {
		for (int i = topSayisi; i > 0; i--) {              // Burada satýr sayýsýnýn en fazla atýlan top sayýsý kadar olabileceðinden  ve topSayisi kadar dýþ döngü oluþturduk.
			for (int j = 0; j < slotlar.length; j++) {         // Dýþ döngüyü topSayisi'ndan 0'a kadar dönderdik. Çünki  dýþ döngünün ilk dönen deðeri ile iç döngüde slotlar dizisinin j'inci elemanýnda(yani slotunda) bu deðer var mý diye kontrol ettik.
				if (i != slotlar[j]) {							// Eðer dýþ döngüden gelen deðer ile slotlarýn j'inci deðeri birbirine eþit deðil ise boþluk bastýk.
					System.out.print(" ");
				} else {
					System.out.print("O");                 // Aksi halde dýþ döngüden gelen deðer ile slotlarýn j'inci deðeri birbirine eþit ise bir tane "O" bastýk.  
					slotlar[j]--;							// Ve slotlarýn j'inci deðerini 1 azalttýk.Çünki her satýrda bir i ve slot[j] karþýlaþtýrmasý yapýldýðýndan yazdýðýmýz deðeri 1 azaltmamýz gerekti.Burada yazdýðýmýz komut ile alltan kaçýncý satýrdaki hangi sütunda doluluk olduðunu anlamýþ olduk.
				}
			}
			System.out.println();           // Satýr atmalak için boþ print komutu.
		}
	}

}    // Örneklem : 50 topu 10 slotlu fasulyemakinesi'ne atalým. =>  50 10  bu sayýlarý konsol ekranýna kopyalayýp entere basarsanýz program tek seferde çalýþacaktýr. 
		//Ýlginç bir þekilde bilgisdayarda simüle ettiðimiz galton makineside gerçek hayattaki galton makinesine benzer sonuçlar veriyor. Ortadaki ve ortaya yakýn slotlar her zaman toplarýn yýðýldýðý yerler oluyor.
