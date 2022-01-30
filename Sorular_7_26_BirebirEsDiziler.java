package Bolum07_DersteYazilanKodlar;
import java.util.Scanner;
public class Sorular_7_26_BirebirEsDiziler {
/*
(Birebir eþ diziler) Karþýlýklarý elemanlarý birebir eþit olan  list1 ve list2 dizilerine birebir eþ diziler denir. Eðer list1 ve list2 birebir eþ dizilerse true dönen aþaðýdaki bildirime sahip bir metot yazýnýz.
public static boolean birebirEsitMi	(int[] list1, int[] list2)
Kullanýcýdan iki tam sayý dizisi girmesini isteyen ve bu dizilerin birebir eþ olup olmadýðýný kontrol eden bir test programý yazýnýz. Programýn örnek akýþýný inceleyiniz. Girilen ilk sayýnýn dizinin eleman sayýsýný göstereceðini unutmayýnýz. Bu sayý dizinin bir elemaný olmayacaktýr.

                     Dizi1’i giriniz:   5  2  5  6  1  6

                     Dizi2’yi giriniz: 5  2  5  6  1  6

                     Iki dizi birebir aynidir


                     Dizi1’i giriniz:   5  2  5  6  6  1

                     Dizi2’yi giriniz: 5  2  5  6  1  6

                     Iki dizi birebir ayni degildir
 */

	public static boolean birebirEsitMi(int[] list1, int[] list2) {
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
	
	public static void main(String[] args) {
		System.out.println("Lütfen ilk  dizinin eleman sayýsýný ve deðerlerini sýrasý ile giriniz.");
		
		Scanner klavye= new Scanner(System.in);
		
		int[] list1 = scannerdanListeAl(klavye);  // Scanner nesnesini alan ve bu nesne ile dizi üreten ve diziyi döndüren methot kullandýk.
		
		System.out.println("Lütfen ikinci  dizinin eleman sayýsýný ve deðerlerini sýrasý ile giriniz.");
		int[] list2=scannerdanListeAl(klavye);
		
		klavye.close();
		
		System.out.println("Ýki dizi birebir "+(birebirEsitMi(list1, list2)?"aynýdýr":"ayný deðildir."));  // Ternary ifadeyi String içinde kullanabilmek için ifadenin tamamýný parantezlere aldýk. 
																										//Eðer bir String deðiþkene atayýp kullanmak isteseydik parantezlere gerek olmayacaktý.
	}

	public static int[] scannerdanListeAl(Scanner klavye) {
		int[] list=new int[klavye.nextInt()];
		
		for (int i = 0; i < list.length; i++) {
			list[i]=klavye.nextInt();
		}
		return list;
	}
	
}

