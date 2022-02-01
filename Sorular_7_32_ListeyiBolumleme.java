package Bolum07_DersteYazilanKodlar;

import java.awt.List;
import java.util.Scanner;

public class Sorular_7_32_ListeyiBolumleme {
	/*
(Listeyi bölümleme) Ýlk elemaný temel alacak (buna pivot denecek) þekilde bir diziyi iki bölüme ayýran aþaðýdaki bildirime sahip bir metot yazýnýz.

public static int partition(int[] list)

	Bölümleme iþleminden sonra pivot deðere eþit ve daha küçük olanlar pivottan önce; pivottan büyük olanlar pivottan sonra yer alacak þekilde dizi yeniden düzenlenecek. Metot yeni oluþan dizide pivot deðerin bulunduðu indeksi geri dönecek.
	Örneðin dizi {5, 2, 9, 3, 6, 8} girilmiþ olsun. Bölümleme iþleminden sonra dizi {3, 2, 5, 9, 6, 8} þeklinde olacak. Metodu en fazla list.length kadar karþýlaþtýrma yapacak þekilde yazýnýz. 
	Kullanýcýdan bir dizi girmesini isteyen ve bölümleme iþleminden sonra dizinin son durumunu gösteren bir program yazýnýz. Örnek akýþý inceleyiniz. Girilen ilk sayýnýn dizinin eleman sayýsýný göstereceðini unutmayýnýz. Bu sayý dizinin bir elemaný olmayacaktýr.

                     Diziyi giriniz:           8  10  1  5  16  61  9  11  1
                     Bolumlemeden sonra dizi      9  1  5  1  10  61  11  16
	 */
	
	public static void main(String[] args) {
		System.out.println("Lütfen bölümlenmesi için sayý adetini ve sayýlarý sýrasý ile giriniz");
		Scanner klavye=new Scanner(System.in);
		int[] dizi=new int[klavye.nextInt()];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i]=klavye.nextInt();
		}
		klavye.close();
		
		int pivot=dizi[0];
		int pivotIndis=listeBolumleme(dizi);
		System.out.println("pivot : "+pivot+" pivot indisi : "+pivotIndis);
		
		for (int sayi : dizi) {
			System.out.print(sayi+"  ");
		}
	}
	
	public static int listeBolumleme(int[] list) {
															
		int solPointer=1;                                // Dizinin en saðý için bir pointer ve en solu pivotun yaný için bir pointer oluþturduk. 
		int sagPointer=list.length-1;					
		int pivot=list[0];										// Listenin ilk elemanýný pivot olarak aldýk.
		
		while (sagPointer > solPointer ) {						// Sað pointerýn deðeri  sol pointerdan büyük olduðu müddetçe bu while döngüsünü çevirdik. Pointerlarý yanyana gelene kadar bu döngüyü çevirmiþ olduk.
			//Soldan saða dogru tarama yapýyoruz.
			while(sagPointer >= solPointer && pivot >= list[solPointer]) {	// sagP solP den büyükse ve pivot solP indisli elemandan büyükse solP yi bir artýrdýk yani pointer bir dahaki kontrol için bir saða kaymýþ oldu.
				solPointer++;													//Bu döngü þartýmýz son buluncaya kadar devam ediyor.Yani pivot kendinden büyük bir elemanla karþýlaþýncaya kadar pointer bir sað kaydýrýlýyor.
			}
			//Saðdan sola doðru tarama yapýyoruz.
			while(sagPointer >= solPointer &&  pivot <= list[sagPointer]) {   //Burada bir üstteki iþlemin aynýsý bu defa pivot un sagki elemanlar ile kontrolü için uygulanýyor. 
				sagPointer--;									//Yani pivot kendinden büyük elemanla karþýlaþýnca sagP bir sola kaydýrýlýyor. Pivot kendinden küçük elemanla karþýlaþýncaya kadar sagP devamlý sola kaydýrýlýyor.
			}													// Pivot kontrol ettiði elemandan büyükse döngüye girmiyor.Döngü bitiyor.Bu algoritmadaki en büyük püf noktasý  pointerin kendi  gösterdiði yeri kontrol etmesi ve sonraki kontrol edeceði yeri belirlemesidir.
		// Takas algoritmasý kullanýyoruz.
			if(sagPointer >= solPointer ) {								
				int gecici=list[sagPointer];					//Burada her bir pointer'ýn takýldýðý indislerdeki elemanlar yer deðiþtiriliyor.Yani sol baþtan kontrol ederken pivottan küçükleri geçip büyük elemanda takýlmýþýz --
				list[sagPointer]=list[solPointer];				// ve  sað baþtan kontrol ederken pivottan büyükleri geçip  küçük bir elemana takýlmýþýz demektir.
				list[solPointer]=gecici;
			}
		}
		
		while (sagPointer > 1 && list[sagPointer] >= pivot) {  // Burada sagPointer'ýn olduðu yerden itibaren pivottan ne kadar büyük ve eþit eleman var ise sagpointeri o kadar sayýda sola çekmiþ oluyoruz. 
			 sagPointer--;
		}													//  Yani pivottan büyük yada eþit olmayan elemanýn olduðu indise kadar sagPointer'i getirmiþ  oluyoruz.
	  // Pivotu yerine koyup indisini dönderiyoruz.
		if (pivot > list[sagPointer]) {
	      list[0] = list[sagPointer];						// Bunu yapmamýzdaki amaç tabiki pivotu listede olmasý gereken yere koymak ve indisini return etmek.
	      list[sagPointer] = pivot;
	    }
	    return sagPointer;           // sagPointer ýn olduðu noktaya pivot deðerini koyduðumuz için sagPointeri indis olarak dönderiyoruz. 
	}

}
