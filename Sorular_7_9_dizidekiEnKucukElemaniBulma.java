package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_9_dizidekiEnKucukElemaniBulma {

	public static void main(String[] args) {
		
		Scanner klavye=new Scanner(System.in);
		
		System.out.println("Lütfen içindeki en küçük sayýyý bulabileceðimiz 10 adet sayý giriniz");
		double[] sayiDizisi=new double [10];
		for (int i = 0; i < sayiDizisi.length; i++) {
			sayiDizisi[i]=klavye.nextDouble();
		}
		System.out.println("Girmiþ olduðunuz sayýlarýn en küçüðü :"+min(sayiDizisi));
		

		klavye.close();
	}
	public static double min (double[] dizi) {
		double enKucuk=dizi[0]; //Dizinin ilk elemanýný en küçük olarak kabul edip sonraki elemanlar ile kýyaslayarak en küçük elemaný buluyoruz.
		for (int i = 1; i < dizi.length; i++) {
			if(dizi[i] < enKucuk) {
				enKucuk=dizi[i];
			}
		}
		return enKucuk;
	}

}
