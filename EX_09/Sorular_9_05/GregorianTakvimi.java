package Bolum09BenimYazdiklarim.Sorular_9_05;

import java.util.GregorianCalendar;

/*
*9.5 (GregorianCalendar sýnýfýný kullanýn) Java API’sinin  java.util paketinde GregorianCalendar sýnýfý bulunmaktadýr. 
*Bu sýnýfý gün, ay ve yýl bilgisini elde etmek için kullanabilirsiniz. Parametresiz constructor ile þu anki tarih 
*bilgisine sahip bir nesne yaratýlabilir, get(GregorianCalendar.YEAR),  get(GregorianCalendar.MONTH) ve get(GregorianCalendar.DAY_OF_MONTH) 
* metotlarý ile yýl, ay ve gün bilgisini elde edebilirsiniz. Aþaðýdaki iki görevi gerçekleþtiren bir program yazýnýz.

Þu anki gün, ay ve yýlý gösterin.
GregorianCalendar sýnýfýnýn setTimeInMillis(long) metodunu 1 Ocak 1970’ten itibaren geçen zamaný vererek istenilen tarih için kullanabilirsiniz.
 Metoda 1234567898765L deðerini argüman olarak geçin ve yýl, ay ve günü gösteriniz.
*
*@yazar Muratkorkun
*/


public class GregorianTakvimi {
	public static void main(String[] args) {
		GregorianCalendar gt1 = new GregorianCalendar();
		
		System.out.println(gt1.get(GregorianCalendar.DAY_OF_MONTH)+" "+gt1.get(GregorianCalendar.MONTH)+" "+gt1.get(GregorianCalendar.YEAR));
		
		gt1.setTimeInMillis(1234567898765L);
		
		// Gün ay ve yýl gösterimi
		System.out.println(gt1.get(GregorianCalendar.DAY_OF_MONTH)+" "+gt1.get(GregorianCalendar.MONTH)+" "+gt1.get(GregorianCalendar.YEAR));
		
	
	}

	
	
	
	

}
