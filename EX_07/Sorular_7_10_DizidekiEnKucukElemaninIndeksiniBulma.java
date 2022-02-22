package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_10_DizidekiEnKucukElemaninIndeksiniBulma {
public static void main(String[] args) {
	System.out.println("Lütfen en küçük elemanýn indeksini bulabileceðimiz 10 adet sayý giriniz");
	
	Scanner klavye=new Scanner(System.in);
	double[] sayiDizisi=new double[10];
	
	for (int i = 0; i < sayiDizisi.length; i++) {
		sayiDizisi[i]=klavye.nextDouble();
	}
	
	klavye.close();
	
	System.out.println("Girmiþ olduðunuz sayýlardan en küçük sayýnýn indeksi : "+enKucukElemaninIndeksi(sayiDizisi));
}
public static int enKucukElemaninIndeksi(double[] dizi) {
	double enKucukEleman=dizi[0];
	int enKucukElemaninIndeksi=0;
	for (int i = 1; i < dizi.length; i++) {
		if (dizi[i] < enKucukEleman) { // Kýyaslama yaptýðýmýzda ilk enküçük elemaný bulduk. Eðer eþitlik durumunu da kontrole ilave etmiþ olsaydýk en küçükden sonraki  en küçüðe eþit olan  sayýlarý da hesaba katmýþ olurduk.Yani son en küçük elemaný bulabilirdik.
			enKucukEleman=dizi[i];
			enKucukElemaninIndeksi=i;
		}
	}
	
	return enKucukElemaninIndeksi;
}
}
