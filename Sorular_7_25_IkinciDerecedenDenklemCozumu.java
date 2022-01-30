package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_25_IkinciDerecedenDenklemCozumu {   // Þimdi bu soruda öncelikle neden methoda deðerleri hesaplanmamýþ olan kökler dizisi parametresini istediðini anlayamadým. Yani kökleri belli olmadan neden kökler dizisini almamýz gerekiyor ? 
														//Bu sorunun cevabý sorunun þudur : aslýnda bir method ile bir diziyi alýp tek bir integer deðer bile döndürsen bu method içinde aldýðýmýz dizilere yaptýðýmýz deðiþiklikler uygulanýr.
														// Yani methoda parametre olarak alýnan dizinin kendisi(referansý) deðiþmez fakat içeriði deðiþebilir.Bu deðiþen içeriði dönderdiðimiz int deðer ile baðdaþtýrarak diziyi yazdýrabiliriz.
														//Bu soru çok zorla(ma) üretilmiþ bir soru olmuþ ama yinede bir programcýlýk öðrencisine, öðretmek istedikleri çok önemli kavramlara deðinilmiþ.
	public static void main(String[] args) {

		System.out.println("Denklem köklerin hesabýnýn yapýlmasý için a,b ,c deðerleri giriniz.");
		Scanner klavye = new Scanner(System.in);
		double[] sayilar = new double[3];       // Burada öncelikle a, b, c deðerlerini tutacaðýmýz diziyi oluþturduk.
		double[] kokler = new double[2];		// Burada methoda parametre olarak göndereceðimiz diziyi oluþturduk. Ýlklendirme sonucunda dizinin tüm elemanlarý '0'ile dolduruldu.

		for (int i = 0; i < sayilar.length; i++) {    // Burada Scanner ile kullanýcýdan hesaplanacak olan sayýlarý alýp diziye doldurduk.
			sayilar[i] = klavye.nextDouble();
		}

		klavye.close();							// Scanner i kapattýk.

		int kokSayisi = cozIkinciDereceden(sayilar, kokler);			//Method int deðer döndüðü için dönen deðeri int bir deðiþkene atadýk.Methoda kök sayýsýnýn ve köklerin hesaplanmasý için sayilar dizisini gönderdik.
																		//Yine methoda kökler parametresini gönderip method içinde bulunan kök sayýsý ile ilintili þekilde kökler dizisini doldurduk.
																		//Yani parametre olarak referansýný aldýðýmýz kökler dizisinin içeriðini deðiþtirdik.Daha sonra devam eden kod satýrýmýzda bu deðiþen kökleri kök sayýsýna uygun olacak þekilde yazdýrdýk. 

		if (kokSayisi == 0)													//Köklerin sayýsý 0 ise gereken þekilde yazdýrdýk.
			System.out.println("Denklemde hiçbir kök yoktur.");
		else					
			System.out.printf("Denklemin %d tane gerçek kökü vardýr.\n",kokSayisi);
			for (int i = 0; i < kokSayisi; i++) {								// köklerin sayýsý kadar döngü ile kök numarasýný ve kök deðerlerini ekrana yazdýrdýk.
				System.out.printf("Kök %d: %.6f\n",(i + 1),kokler[i]);			// Burada yeri gelmiþken printf komututun nasýl çalýþtýðýndan bahsedelim. 
									//Temel olarak String içerisinde yazdýrmamýz gereken her bir deðiþken için yer tutucu olarak tabir edilen % ile baþlýyan yer tutucularý deðiþkenin türüne uygun þekilde String içinde kullanýyoruz.
									//Yer tutuculara karþýlýk gelen deðiþkenleri de, String sonuna ve deðiþken aralarýna bir virgül olacak þekilde sýra ile yazýyoruz.
									//Yani yer tutucular String içerisinde herbir deðiþkene karþýlýk tek tek yazýlýr ve yer tutucuya karþýlýk gelen bütün deðiþkenler String sonunda tek tek virgül ile ayrýlarak yazýlýr.
									//Ayný zamanda yer tutucularýn saðýnda solunda istediðiniz þekilde String yazýmýna devam edebilirsiniz. 
									//Yazýlan komutlar sonunda print komutu çalýþtýðýnda bütün deðiþkenler yer tutucularýn yerine ekranda kendini gösterir.
			}
	}

	public static int cozIkinciDereceden(double[] sayilar, double[] kokler) {  
						// Bu method parametre olarak iki farklý dizi alýr, referansýný aldýðý dizilerden birinin elemanlarýný tek tek iþlem yapmak üzere primitive deðiþkenlere kopyalar ve iþlemlerde kullanýr. Not: Referansýnda deðiþiklik yapmaz öylece býrakýr.
												//Referansýný aldýðý diðer dizinin iþlemler sonucuna göre içeriðini deðiþtirir. Not : Referansýnda deðiþiklik yapar.
												//Yine iþlemler sonucuna göre bir int deðeri return eder. 
		double a = sayilar[0];
		double b = sayilar[1];
		double c = sayilar[2];

		int koklerinSayisi = 0;

		double diskriminant = Math.pow(b, 2) - 4 * a * c;									// Programlama alýþtýrmalarý 3.1'in çözümünden gereken hesaplamalar alýnmýþtýr. 

		if (diskriminant > 0) {																//Bu kýsýmda kök sayýsý bulduk ve köklerin deðerlerini gereken deðiþkenlere atadýk.
			kokler[0] = (-b + Math.pow(diskriminant, 0.5)) / (2 * a);
			kokler[1] = (-b - Math.pow(diskriminant, 0.5)) / (2 * a);
			koklerinSayisi = 2;
		} else if (diskriminant == 0) {
			kokler[0] = -b / (2 * a);
			koklerinSayisi = 1;
		}
		return koklerinSayisi;
	}
} // Örneklemler => 1,0 3 1 (Denklemin iki koku vardir: -0.381966 ve -2.61803) =>	// 1 2,0 1 (Denklemin bir koku vardýr: -1) => 1 2 3 (Denklemin hicbir gercek	// koku yoktur.)
