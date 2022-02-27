package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_21_MerkezSehir {
	/*
	 * 	*8.21 (Merkez þehir) Verilen þehirler arasýnda, diðer þehirlere mesafelerin toplamý en küçük olan þehir, merkez þehirdir. 
	 * 		   Kullanýcýdan þehir sayýný ve þehirlerin konumlarýný (koordinat) alan, merkez þehri ve onun diðer þehirlere olan toplam mesafesini gösteren bir program yazýnýz.

                   Sehir sayisini giriniz: 5
                   Sehirlerin koordinatlarini giriniz:
                   2,5  5  5,1  3  1  9  5,4  54  5,5  2,1
                   Merkez sehir (2.5  5.0) koordinatlarindadir.
                   Diger sehirlere olan toplam mesafesi 60.81´dir.                  
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.print("Sehir sayisini giriniz : ");
		int sehirSayisi=klavye.nextInt();
		System.out.print("Sehirlerin koordinatlarini giriniz : ");
		
		double[][] sehirler=matrisAl(sehirSayisi,klavye);
		double[] merkezSehirVeMesafeToplami=merkezSehirveMesafeBul(sehirler);
		System.out.println("Merkez sehir ("+merkezSehirVeMesafeToplami[0]+" "+merkezSehirVeMesafeToplami[1]+") koordinatlarindadir.");
		System.out.print("Diger sehirlere olan toplam mesafesi "+(int)(100*merkezSehirVeMesafeToplami[2])/100.0+"´dir.");
	}
	
	public static double[][] matrisAl(int sehirSayisi,Scanner klavye){
		double[][] sehirler=new double[sehirSayisi][2];
		for (int i = 0; i < sehirler.length; i++) {
			for(int j=0; j< 2; j++) {
				sehirler[i][j]=klavye.nextDouble();
			}
		}
		return sehirler;
	}
	
	public static double[] merkezSehirveMesafeBul(double[][] sehirler) {
		
		double[] merkezSehirVeMesafeToplami=new double[3];
		double enKucukMesafelerToplami=Double.MAX_VALUE;
		double mesafelerToplami=0;
		int merkezSehirIndeksi=-1;
		for(int i=0; i < sehirler.length ; i++) {
			for(int j=0; j < sehirler.length ;j++){
				if(i != j) {
					mesafelerToplami+=mesafeBul(sehirler[i][0], sehirler[i][1], sehirler[j][0], sehirler[j][1]);
				}
			}
			if(enKucukMesafelerToplami > mesafelerToplami ) {
				enKucukMesafelerToplami=mesafelerToplami;
				merkezSehirIndeksi=i;
			}
		}
		merkezSehirVeMesafeToplami[0]=sehirler[merkezSehirIndeksi][0];
		merkezSehirVeMesafeToplami[1]=sehirler[merkezSehirIndeksi][1];
		merkezSehirVeMesafeToplami[2]=enKucukMesafelerToplami;
		return merkezSehirVeMesafeToplami;
	}
	
	public static double mesafeBul(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}


}
