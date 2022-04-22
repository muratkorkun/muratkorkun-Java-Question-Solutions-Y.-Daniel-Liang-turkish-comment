package Bolum09BenimYazdiklarim.Sorular_9_06;

import java.util.Arrays;
import java.util.Random;

import chapter07.SelectionSort;

/**9.6 (Kronometre) StopWatch isimli bir sýnýf tasarlayýnýz. Bu sýnýf;

  startTime ve endTime isimli private veri elemanlarý ve bunlarýn getter metotlarýný içerecek.
  Parametresiz constuctor’ý startTime’ý þu anki zaman olarak ayarlayacak.
  start() metodu startTime veri elemanýna o anki zaman deðerini atayacak.
  stop() metodu endTime veri elemanýna o anki zaman deðerini atayacak.
  getElapsedTime() metodu geçen süreyi milisaniye olarak olarak geri döndürecek.

  Sýnýfý yazmadan önce UML þemasýný çiziniz. Seçimli sýralama (selection sort) algoritmasý ile 100 000 sayýnýn sýralanmasýnda geçen süreyi gösteren bir test programý yazýnýz
 */
public class Test {

	public static void main(String[] args) {
		Kronometre kr1 = new Kronometre();
		
		int[] dizi = new int[100_000];
		Random r1 = new Random(100);
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i]=r1.nextInt(1000);
		}
		
		kr1.basla();
		
		selectionSort(dizi);
		// Sýralanan sayýlarý görmek için ekrana bastýrdým.
		for (int i = 0; i < dizi.length; i++) {
			if((i+1)%50 == 0) {
				System.out.println();
			}else {
				System.out.printf("%4d",dizi[i]);	
			}
		}
		
		kr1.dur();
		System.out.println("Seçimli sýralamada geçen süre : "+kr1.alGecenSure()+" milisaniyedir.");
		//Ýkinci yöntem  getter metodlarýyla gereken datalarý alarak gecen süreyi hesapladýk.
		System.out.println("Seçimli sýralamada geçen süre : "+(kr1.alBitisZamani()-kr1.alBaslangicZamani())+" milisaniyedir.");
	}
	
	  public static void selectionSort(int[] list) {
		    for (int i = 0; i < list.length - 1; i++) {
		      // dizi içindeki en  küçük bulunuyor [i..list.length-1]
		      int currentMin = list[i];
		      int currentMinIndex = i;

		      for (int j = i + 1; j < list.length; j++) {
		        if (currentMin > list[j]) {
		          currentMin = list[j];
		          currentMinIndex = j;
		        }
		      }

		      //  eðer gerekliyse takas yapýyoruz list[i] ile [currentMinIndex];
		      if (currentMinIndex != i) {
		        list[currentMinIndex] = list[i];
		        list[i] = currentMin;
		      }
		    }
		  }

}
