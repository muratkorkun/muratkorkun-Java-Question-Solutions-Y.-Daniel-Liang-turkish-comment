package Bolum09BenimYazdiklarim.sorular_9_13;
/*
**9.13 (Location s�n�f�) �ki boyutlu bir dizinin en b�y�k eleman�n de�erini ve konumunu belirleyen Location isminde bir s�n�f tasarlay�n�z. 
*Bu s�n�f�n  row, column ve maxValue isminde public veri elemanlar� bulunur. maxValue,  double t�rden iki boyutlu dizinin en b�y�k eleman�n de�erini;
row ve column, int t�rden en b�y�k eleman�n indeksini saklar.
�ki boyutlu bir dizinin en b�y�k eleman�n konumunu geri d�nd�ren, a�a��daki bildirime sahip metodu yaz�n�z.
public static Location locateLargest(double[][] a)
Geri d�n�� de�eri Location t�r�nden bir nesnedir.
 Kullan�c�dan iki boyutlu bir dizi alan ve bu dizinin en b�y�k eleman�n�n sat�r ve s�tun indekslerini g�steren bir test program� yaz�n�z.
 �rnek ak��� inceleyiniz:
           Dizideki satir ve s�tun sayisini giriniz: 3 4
           Diziyi giriniz:
             
                23,5  35  2  10
                4,5  3  45  3,5
                35  44  5,5  9,6
                
             En buyuk eleman (1, 2)�de bulunan 45�tir.
*/

import java.util.Scanner;

public class TestKonum {
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		
		System.out.println("L�tfen matris sat�r ve sutun sayilar�n� giriniz");
		int satirSayisi=klavye.nextInt();
		int sutunSayisi=klavye.nextInt();
		System.out.println("L�tfen matris de�erlerini giriniz");
		
		double[][] matris=matrisAl(satirSayisi, sutunSayisi, klavye);
		klavye.close();
		Konum k = Konum.enBuyugunKonumu(matris);
		
		System.out.print(" En buyuk eleman ("+k.satir+","+k.sutun+")�de bulunan "+k.enBuyukDeger+"�tir.");
	}
	
	public static double[][] matrisAl(int satir, int sutun,Scanner klavye){  // Kullan�c�dan matris alan metod.
		
		double[][] matris=new double[satir][sutun];
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				matris[i][j]=klavye.nextDouble();
			}
		}
		return matris;
	}

}
