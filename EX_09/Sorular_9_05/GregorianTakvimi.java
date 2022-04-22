package Bolum09BenimYazdiklarim.Sorular_9_05;

import java.util.GregorianCalendar;

/*
*9.5 (GregorianCalendar s�n�f�n� kullan�n) Java API�sinin  java.util paketinde GregorianCalendar s�n�f� bulunmaktad�r. 
*Bu s�n�f� g�n, ay ve y�l bilgisini elde etmek i�in kullanabilirsiniz. Parametresiz constructor ile �u anki tarih 
*bilgisine sahip bir nesne yarat�labilir, get(GregorianCalendar.YEAR),  get(GregorianCalendar.MONTH) ve get(GregorianCalendar.DAY_OF_MONTH) 
* metotlar� ile y�l, ay ve g�n bilgisini elde edebilirsiniz. A�a��daki iki g�revi ger�ekle�tiren bir program yaz�n�z.

�u anki g�n, ay ve y�l� g�sterin.
GregorianCalendar s�n�f�n�n setTimeInMillis(long) metodunu 1 Ocak 1970�ten itibaren ge�en zaman� vererek istenilen tarih i�in kullanabilirsiniz.
 Metoda 1234567898765L de�erini arg�man olarak ge�in ve y�l, ay ve g�n� g�steriniz.
*
*@yazar Muratkorkun
*/


public class GregorianTakvimi {
	public static void main(String[] args) {
		GregorianCalendar gt1 = new GregorianCalendar();
		
		System.out.println(gt1.get(GregorianCalendar.DAY_OF_MONTH)+" "+gt1.get(GregorianCalendar.MONTH)+" "+gt1.get(GregorianCalendar.YEAR));
		
		gt1.setTimeInMillis(1234567898765L);
		
		// G�n ay ve y�l g�sterimi
		System.out.println(gt1.get(GregorianCalendar.DAY_OF_MONTH)+" "+gt1.get(GregorianCalendar.MONTH)+" "+gt1.get(GregorianCalendar.YEAR));
		
	
	}

	
	
	
	

}
