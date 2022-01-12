package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_10_DizidekiEnKucukElemaninIndeksiniBulma {
public static void main(String[] args) {
	System.out.println("L�tfen en k���k eleman�n indeksini bulabilece�imiz 10 adet say� giriniz");
	
	Scanner klavye=new Scanner(System.in);
	double[] sayiDizisi=new double[10];
	
	for (int i = 0; i < sayiDizisi.length; i++) {
		sayiDizisi[i]=klavye.nextDouble();
	}
	
	klavye.close();
	
	System.out.println("Girmi� oldu�unuz say�lardan en k���k say�n�n indeksi : "+enKucukElemaninIndeksi(sayiDizisi));
}
public static int enKucukElemaninIndeksi(double[] dizi) {
	double enKucukEleman=dizi[0];
	int enKucukElemaninIndeksi=0;
	for (int i = 1; i < dizi.length; i++) {
		if (dizi[i] < enKucukEleman) { // K�yaslama yapt���m�zda ilk enk���k eleman� bulduk. E�er e�itlik durumunu da kontrole ilave etmi� olsayd�k en k���kden sonraki  en k����e e�it olan  say�lar� da hesaba katm�� olurduk.Yani son en k���k eleman� bulabilirdik.
			enKucukEleman=dizi[i];
			enKucukElemaninIndeksi=i;
		}
	}
	
	return enKucukElemaninIndeksi;
}
}
