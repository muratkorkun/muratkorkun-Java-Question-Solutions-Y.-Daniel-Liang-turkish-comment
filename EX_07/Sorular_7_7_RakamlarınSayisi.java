package Bolum07_DersteYazilanKodlar;


public class Sorular_7_7_RakamlarýnSayisi {
	public static void main(String[] args) {
		
		final int DIZIUZUNLUGU=100; //dizi uzunluðunu sabit deðiþkene atadýk.
		int[] sayiDizisi=new int[DIZIUZUNLUGU];
		
		for (int i = 0; i < sayiDizisi.length; i++) {  // dizinin her indisine 0-9 aralýðnda rastgele bir sayý atadýk.
			sayiDizisi[i]=aralikdaRastgeleSayiUret(0, 9); // belli bir aralýkda rastgele sayý üreten metodu kullandýk
		}
		int[] saymalar=new int [10];// sayiDizisindeki sayýlarýn kaç kere tekrar ettiðini tutabilmemiz için 10 adet indis olacak þekilde saymalar dizisini oluþturduk.
		
		for (int i = 0; i < sayiDizisi.length; i++) {// Bu döngü ile sayýDizisinin i indisindeki deðerin hangi j rakamýný denk geldiðini kýyasladýk.Ve saymalar dizisindeki j indisini 1 artýrdýk.
			for (int j = 0; j < saymalar.length; j++) {
				if (sayiDizisi[i]==j) {
					saymalar[j]++; 
				}
			}
		}
		
		for (int i = 0; i < sayiDizisi.length; i++) {//Burada rastgele doldurulmuþ olan sayiDizisini ekrana yazdýrdýk.
			if(i % 25 == 0) {  // Burada her 25 inci döngüde bir satýr atlama iþlemini yaptýk.
				System.out.println();
			}
			System.out.printf("%3d",sayiDizisi[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < saymalar.length; i++) {// Burada saymalar dizisindeki elemanlarý sýrasý ile ve deðeri ile birlikte yazdýrýyoruz.
			
			System.out.println(i+" sayýsý "+saymalar[i]+" defa tekrarlanmýþtr");
		}
	
	}

	public static int aralikdaRastgeleSayiUret(int number1, int number2) { // belli bir aralýkda rastgele sayý üreten metodu yazdýk.
		
		int sayi=(int)(Math.random()*(number2+1-number1))+number1;
		return sayi;
		
	}
	
}
