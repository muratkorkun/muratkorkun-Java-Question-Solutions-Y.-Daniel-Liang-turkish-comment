package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_27_EsDiziler {
	/*
(Eþ diziler) Ayný elemanlara sahip olan list1 ve list2 dizilerine eþ diziler denir. Eðer  list1 ve list2  eþ dizilerse true dönen aþaðýdaki bildirime sahip bir metod yazýnýz.

public static boolean esMi(int[] list1, int[] list2)

Kullanýcýdan iki tam sayý dizisi girmesini isteyen ve bu dizilerin eþ olup olmadýðýný kontrol eden bir test programý yazýnýz. Programýn örnek akýþýný inceleyiniz: Girilen ilk sayýnýn dizinin eleman sayýsýný göstereceðini unutmayýnýz. Bu sayý dizinin bir elemaný olmayacaktýr.

                     Dizi1’i giriniz:   5  2  5  6  6  1

                     Dizi2’yi giriniz: 5  5  2  6  1  6

                     Iki dizi birbirine estir


                     Dizi1’i giriniz:   5  5  5  6  6  1

                     Dizi2’yi giriniz: 5  2  5  6  1  6

                     Iki dizi birbirine es degildir
	 */

	
	public static boolean esMi(int[] list1,int[] list2) {
		
		int a=list1.length;
		int b=list2.length;
		
		if(list1 == list2) {  // iki dizinin referansý eþit ise yani ikiside ayný nesneyi gösteriyorsa kesinlikle bunlar eþ deðildir. 
					//Bu soruya özel olarak dizileri kullanýcýdan aldýðýmýz için dizilerin referansý ayný olmayacaktýr fakat main methodda oluþturulmuþ ve referansý birbirine atanmýþ dizilerde test edilme ihtimaline yönelik bu kontrol kýsmýnýda ekledik.
			return false;
		}
		else if(a != b) {	//Ýki dizinin uzunluðu eþit deðil ise bu diziler eþ deðildir.
			return false;
		}
		else if(birebirEsitMi(list1, list2)) {   // Bir önceki soruyu çözerken yazdýðýmýz methodu burada kullandýk. Ýki dizi birerbir eþit ise kesinlikle bunlar eþ deðillerdir.
			return false;
		}else {
	// Ýlk dizinin her bir elemaný için diðer dizide eþi var mý diye kontrol ettik.Bu kontrolü yaparken ikinci dizinin j'inci elemanýna denk geldiðimizde bu elemanýnýn diðer döngülerde tekrar kontrol edilmesini önlemeye çalýþtýk.
			//Bunun  için boolean bir dizi oluþturduk ve her eþitlik doðrulamasýnda bu boolean dizinin j'inci elemanýný true'ya deðiþtirdik. Bunu yaparken ayný zamanda listedeVarSayaci'mizi 1 artýrdýk. 
			//ListedeVarSayac'ýmýz eðer dizi uzunluðu kadar bir sayýya eriþti ise bu 2 dizinin her elemanýnýn eþlik durumu kontrol edilmiþ ve doðrulanmýþ demektir.
			//Bir diðer çözüm yöntemi olarak kontrolEdilmeDurumu dizisinin her elemaný true oldu ise bu  diziler eþ dizilerdir diyebilirdik.
			boolean[] kontrolEdilmeDurumu=new boolean[a];     
			int listedeVarSayaci=0;
			for (int i = 0; i < kontrolEdilmeDurumu.length; i++) {
				for (int j = 0; j < kontrolEdilmeDurumu.length; j++) {
					if(list1[i] == list2[j] && kontrolEdilmeDurumu[j]==false) {
						kontrolEdilmeDurumu[j]=true;
						listedeVarSayaci++;
						
					}
				}
			}
			if(listedeVarSayaci == a) {
				return true;     // Sayacýmýz eðer dizi uzunluðuna ulaþtýysa diziler eþtir. True döndük.
			}
		}
		return false;  // Yukarýdaki kontrollerden dizilerin eþ olduðu sonucu çýkmadý ise false return ettik.
	}
	
	public static boolean birebirEsitMi(int[] list1, int[] list2) {   // Yardýmcý method olarak kullandýk.
		int a=list1.length;
		int b=list2.length;
		
		if(list1==list2) {   // iki dizi ayný referansý gösteriyorsa  zaten birebir aynýdýr. True dönderdik.
			return true;
		}
		else if(a != b) {   // Ýki dizi uzunluðu biribirinden farklýise kesinlikle bunlar birerbir ayný deðildir. False dönderdik.
			return false;
		}
		else if( a==b ) {			// iki dizi uzunluðu birbirine eþit ise for döngüsü ile her bir dizinin ayný indisindeki deðerleri karþýlaþtýrdýk.Bunun sonucunda eðer bir defa bile deðerler birbirine eþit deðil sonucu çýkýyorsa false dönderdik.
			for (int i = 0; i < a; i++) {
				if(list1[i] != list2[i]) {
					return false;
				}
			}
		}						//Hiç bir zaman buraya kadar false deðeri gelmedi ise true deðerini dönderdik. Yani yanlýþlamalardan sonra false deðeri gelmiyorsa true döndük. 
									//En baþtaki referans eþitliði durumunu (true durumu en sonda olacak zaten ne gerek var en baþta kontrol etmeye diye sorarsanýz) kontrol etmemizin sebebi cpu ya gereksiz yük bindirmemek içindir.
		return true;
	}
	
	public static int[] scannerdanListeAl(Scanner klavye) { // Yardýmcý method ile scannerdan dizi oluþturduk.Oluþturduðumuz diziyi dönderdik.
		int[] list=new int[klavye.nextInt()];
		
		for (int i = 0; i < list.length; i++) {
			list[i]=klavye.nextInt();
		}
		return list;
	}
	public static void main(String[] args) {
		
			System.out.println("Lütfen ilk  dizinin eleman sayýsýný ve deðerlerini sýrasý ile giriniz.");
			
			Scanner klavye= new Scanner(System.in);
			
			int[] list1 = scannerdanListeAl(klavye);  // Scanner nesnesini alan ve bu nesne ile dizi üreten ve diziyi döndüren methot kullandýk.
			
			System.out.println("Lütfen ikinci  dizinin eleman sayýsýný ve deðerlerini sýrasý ile giriniz.");
			int[] list2=scannerdanListeAl(klavye);
			
			klavye.close();
			
			System.out.println("Ýki dizi birbirine "+(esMi(list1, list2)?"eþtir.":"eþ deðildir.")); 
									// Ternary ifadeyi String içinde kullanabilmek için ifadenin tamamýný parantezlere aldýk. 
									//Eðer bir String deðiþkene atayýp kullanmak isteseydik parantezlere gerek olmayacaktý.
	}
}

