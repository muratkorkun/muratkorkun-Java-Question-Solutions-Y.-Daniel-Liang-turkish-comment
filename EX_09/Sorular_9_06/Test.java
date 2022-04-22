package Bolum09BenimYazdiklarim.Sorular_9_06;

import java.util.Arrays;
import java.util.Random;

import chapter07.SelectionSort;

/**9.6 (Kronometre) StopWatch isimli bir s�n�f tasarlay�n�z. Bu s�n�f;

  startTime ve endTime isimli private veri elemanlar� ve bunlar�n getter metotlar�n� i�erecek.
  Parametresiz constuctor�� startTime�� �u anki zaman olarak ayarlayacak.
  start() metodu startTime veri eleman�na o anki zaman de�erini atayacak.
  stop() metodu endTime veri eleman�na o anki zaman de�erini atayacak.
  getElapsedTime() metodu ge�en s�reyi milisaniye olarak olarak geri d�nd�recek.

  S�n�f� yazmadan �nce UML �emas�n� �iziniz. Se�imli s�ralama (selection sort) algoritmas� ile 100 000 say�n�n s�ralanmas�nda ge�en s�reyi g�steren bir test program� yaz�n�z
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
		// S�ralanan say�lar� g�rmek i�in ekrana bast�rd�m.
		for (int i = 0; i < dizi.length; i++) {
			if((i+1)%50 == 0) {
				System.out.println();
			}else {
				System.out.printf("%4d",dizi[i]);	
			}
		}
		
		kr1.dur();
		System.out.println("Se�imli s�ralamada ge�en s�re : "+kr1.alGecenSure()+" milisaniyedir.");
		//�kinci y�ntem  getter metodlar�yla gereken datalar� alarak gecen s�reyi hesaplad�k.
		System.out.println("Se�imli s�ralamada ge�en s�re : "+(kr1.alBitisZamani()-kr1.alBaslangicZamani())+" milisaniyedir.");
	}
	
	  public static void selectionSort(int[] list) {
		    for (int i = 0; i < list.length - 1; i++) {
		      // dizi i�indeki en  k���k bulunuyor [i..list.length-1]
		      int currentMin = list[i];
		      int currentMinIndex = i;

		      for (int j = i + 1; j < list.length; j++) {
		        if (currentMin > list[j]) {
		          currentMin = list[j];
		          currentMinIndex = j;
		        }
		      }

		      //  e�er gerekliyse takas yap�yoruz list[i] ile [currentMinIndex];
		      if (currentMinIndex != i) {
		        list[currentMinIndex] = list[i];
		        list[i] = currentMin;
		      }
		    }
		  }

}
