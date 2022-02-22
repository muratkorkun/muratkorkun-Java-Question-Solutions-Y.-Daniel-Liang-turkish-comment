package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_9_dizidekiEnKucukElemaniBulma {

	public static void main(String[] args) {
		
		Scanner klavye=new Scanner(System.in);
		
		System.out.println("L�tfen i�indeki en k���k say�y� bulabilece�imiz 10 adet say� giriniz");
		double[] sayiDizisi=new double [10];
		for (int i = 0; i < sayiDizisi.length; i++) {
			sayiDizisi[i]=klavye.nextDouble();
		}
		System.out.println("Girmi� oldu�unuz say�lar�n en k����� :"+min(sayiDizisi));
		

		klavye.close();
	}
	public static double min (double[] dizi) {
		double enKucuk=dizi[0]; //Dizinin ilk eleman�n� en k���k olarak kabul edip sonraki elemanlar ile k�yaslayarak en k���k eleman� buluyoruz.
		for (int i = 1; i < dizi.length; i++) {
			if(dizi[i] < enKucuk) {
				enKucuk=dizi[i];
			}
		}
		return enKucuk;
	}

}
