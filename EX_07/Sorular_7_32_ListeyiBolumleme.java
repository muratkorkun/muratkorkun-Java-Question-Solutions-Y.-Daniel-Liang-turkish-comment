package Bolum07_DersteYazilanKodlar;

import java.awt.List;
import java.util.Scanner;

public class Sorular_7_32_ListeyiBolumleme {
	/*
(Listeyi b�l�mleme) �lk eleman� temel alacak (buna pivot denecek) �ekilde bir diziyi iki b�l�me ay�ran a�a��daki bildirime sahip bir metot yaz�n�z.

public static int partition(int[] list)

	B�l�mleme i�leminden sonra pivot de�ere e�it ve daha k���k olanlar pivottan �nce; pivottan b�y�k olanlar pivottan sonra yer alacak �ekilde dizi yeniden d�zenlenecek. Metot yeni olu�an dizide pivot de�erin bulundu�u indeksi geri d�necek.
	�rne�in dizi {5, 2, 9, 3, 6, 8} girilmi� olsun. B�l�mleme i�leminden sonra dizi {3, 2, 5, 9, 6, 8} �eklinde olacak. Metodu en fazla list.length kadar kar��la�t�rma yapacak �ekilde yaz�n�z. 
	Kullan�c�dan bir dizi girmesini isteyen ve b�l�mleme i�leminden sonra dizinin son durumunu g�steren bir program yaz�n�z. �rnek ak��� inceleyiniz. Girilen ilk say�n�n dizinin eleman say�s�n� g�sterece�ini unutmay�n�z. Bu say� dizinin bir eleman� olmayacakt�r.

                     Diziyi giriniz:           8  10  1  5  16  61  9  11  1
                     Bolumlemeden sonra dizi      9  1  5  1  10  61  11  16
	 */
	
	public static void main(String[] args) {
		System.out.println("L�tfen b�l�mlenmesi i�in say� adetini ve say�lar� s�ras� ile giriniz");
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
															
		int solPointer=1;                                // Dizinin en sa�� i�in bir pointer ve en solu pivotun yan� i�in bir pointer olu�turduk. 
		int sagPointer=list.length-1;					
		int pivot=list[0];										// Listenin ilk eleman�n� pivot olarak ald�k.
		
		while (sagPointer > solPointer ) {						// Sa� pointer�n de�eri  sol pointerdan b�y�k oldu�u m�ddet�e bu while d�ng�s�n� �evirdik. Pointerlar� yanyana gelene kadar bu d�ng�y� �evirmi� olduk.
			//Soldan sa�a dogru tarama yap�yoruz.
			while(sagPointer >= solPointer && pivot >= list[solPointer]) {	// sagP solP den b�y�kse ve pivot solP indisli elemandan b�y�kse solP yi bir art�rd�k yani pointer bir dahaki kontrol i�in bir sa�a kaym�� oldu.
				solPointer++;													//Bu d�ng� �art�m�z son buluncaya kadar devam ediyor.Yani pivot kendinden b�y�k bir elemanla kar��la��ncaya kadar pointer bir sa� kayd�r�l�yor.
			}
			//Sa�dan sola do�ru tarama yap�yoruz.
			while(sagPointer >= solPointer &&  pivot <= list[sagPointer]) {   //Burada bir �stteki i�lemin ayn�s� bu defa pivot un sagki elemanlar ile kontrol� i�in uygulan�yor. 
				sagPointer--;									//Yani pivot kendinden b�y�k elemanla kar��la��nca sagP bir sola kayd�r�l�yor. Pivot kendinden k���k elemanla kar��la��ncaya kadar sagP devaml� sola kayd�r�l�yor.
			}													// Pivot kontrol etti�i elemandan b�y�kse d�ng�ye girmiyor.D�ng� bitiyor.Bu algoritmadaki en b�y�k p�f noktas�  pointerin kendi  g�sterdi�i yeri kontrol etmesi ve sonraki kontrol edece�i yeri belirlemesidir.
		// Takas algoritmas� kullan�yoruz.
			if(sagPointer >= solPointer ) {								
				int gecici=list[sagPointer];					//Burada her bir pointer'�n tak�ld��� indislerdeki elemanlar yer de�i�tiriliyor.Yani sol ba�tan kontrol ederken pivottan k���kleri ge�ip b�y�k elemanda tak�lm���z --
				list[sagPointer]=list[solPointer];				// ve  sa� ba�tan kontrol ederken pivottan b�y�kleri ge�ip  k���k bir elemana tak�lm���z demektir.
				list[solPointer]=gecici;
			}
		}
		
		while (sagPointer > 1 && list[sagPointer] >= pivot) {  // Burada sagPointer'�n oldu�u yerden itibaren pivottan ne kadar b�y�k ve e�it eleman var ise sagpointeri o kadar say�da sola �ekmi� oluyoruz. 
			 sagPointer--;
		}													//  Yani pivottan b�y�k yada e�it olmayan eleman�n oldu�u indise kadar sagPointer'i getirmi�  oluyoruz.
	  // Pivotu yerine koyup indisini d�nderiyoruz.
		if (pivot > list[sagPointer]) {
	      list[0] = list[sagPointer];						// Bunu yapmam�zdaki ama� tabiki pivotu listede olmas� gereken yere koymak ve indisini return etmek.
	      list[sagPointer] = pivot;
	    }
	    return sagPointer;           // sagPointer �n oldu�u noktaya pivot de�erini koydu�umuz i�in sagPointeri indis olarak d�nderiyoruz. 
	}

}
