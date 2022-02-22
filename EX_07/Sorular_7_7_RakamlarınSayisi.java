package Bolum07_DersteYazilanKodlar;


public class Sorular_7_7_Rakamlar�nSayisi {
	public static void main(String[] args) {
		
		final int DIZIUZUNLUGU=100; //dizi uzunlu�unu sabit de�i�kene atad�k.
		int[] sayiDizisi=new int[DIZIUZUNLUGU];
		
		for (int i = 0; i < sayiDizisi.length; i++) {  // dizinin her indisine 0-9 aral��nda rastgele bir say� atad�k.
			sayiDizisi[i]=aralikdaRastgeleSayiUret(0, 9); // belli bir aral�kda rastgele say� �reten metodu kulland�k
		}
		int[] saymalar=new int [10];// sayiDizisindeki say�lar�n ka� kere tekrar etti�ini tutabilmemiz i�in 10 adet indis olacak �ekilde saymalar dizisini olu�turduk.
		
		for (int i = 0; i < sayiDizisi.length; i++) {// Bu d�ng� ile say�Dizisinin i indisindeki de�erin hangi j rakam�n� denk geldi�ini k�yaslad�k.Ve saymalar dizisindeki j indisini 1 art�rd�k.
			for (int j = 0; j < saymalar.length; j++) {
				if (sayiDizisi[i]==j) {
					saymalar[j]++; 
				}
			}
		}
		
		for (int i = 0; i < sayiDizisi.length; i++) {//Burada rastgele doldurulmu� olan sayiDizisini ekrana yazd�rd�k.
			if(i % 25 == 0) {  // Burada her 25 inci d�ng�de bir sat�r atlama i�lemini yapt�k.
				System.out.println();
			}
			System.out.printf("%3d",sayiDizisi[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < saymalar.length; i++) {// Burada saymalar dizisindeki elemanlar� s�ras� ile ve de�eri ile birlikte yazd�r�yoruz.
			
			System.out.println(i+" say�s� "+saymalar[i]+" defa tekrarlanm��tr");
		}
	
	}

	public static int aralikdaRastgeleSayiUret(int number1, int number2) { // belli bir aral�kda rastgele say� �reten metodu yazd�k.
		
		int sayi=(int)(Math.random()*(number2+1-number1))+number1;
		return sayi;
		
	}
	
}
