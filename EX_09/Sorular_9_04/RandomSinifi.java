package Bolum09BenimYazdiklarim.Sorular_9_04;

import java.util.Random;

/*
*9.4 (Random s�n�f�) K�k de�eri (seed) 1000 olan bir Random nesnesi yaratan  ve 0 ile 100 aras�nda  nextInt(100) metodunu kullanarak ilk 50 rastgele tam say�y� g�steren bir program yaz�n�z.
*/
public class RandomSinifi {
	public static void main(String[] args) {
		Random r1=new Random(1000);
		
		for (int i = 0; i < 50; i++) {
			
			System.out.printf("%4d",r1.nextInt(100));
			if((i+1) %10 == 0) {
				System.out.println();
			}
		}
		
		
	}

}
