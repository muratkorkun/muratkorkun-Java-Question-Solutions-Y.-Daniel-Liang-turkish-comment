package Bolum09BenimYazdiklarim.sorular_9_13;
/*
**9.13 (Location sýnýfý) Ýki boyutlu bir dizinin en büyük elemanýn deðerini ve konumunu belirleyen Location isminde bir sýnýf tasarlayýnýz. 
*Bu sýnýfýn  row, column ve maxValue isminde public veri elemanlarý bulunur. maxValue,  double türden iki boyutlu dizinin en büyük elemanýn deðerini;
row ve column, int türden en büyük elemanýn indeksini saklar.
Ýki boyutlu bir dizinin en büyük elemanýn konumunu geri döndüren, aþaðýdaki bildirime sahip metodu yazýnýz.
public static Location locateLargest(double[][] a)
Geri dönüþ deðeri Location türünden bir nesnedir.
 Kullanýcýdan iki boyutlu bir dizi alan ve bu dizinin en büyük elemanýnýn satýr ve sütun indekslerini gösteren bir test programý yazýnýz.
 Örnek akýþý inceleyiniz:
           Dizideki satir ve sütun sayisini giriniz: 3 4
           Diziyi giriniz:
             
                23,5  35  2  10
                4,5  3  45  3,5
                35  44  5,5  9,6
                
             En buyuk eleman (1, 2)´de bulunan 45´tir.
*/

import java.util.Scanner;

public class TestKonum {
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		
		System.out.println("Lütfen matris satýr ve sutun sayilarýný giriniz");
		int satirSayisi=klavye.nextInt();
		int sutunSayisi=klavye.nextInt();
		System.out.println("Lütfen matris deðerlerini giriniz");
		
		double[][] matris=matrisAl(satirSayisi, sutunSayisi, klavye);
		klavye.close();
		Konum k = Konum.enBuyugunKonumu(matris);
		
		System.out.print(" En buyuk eleman ("+k.satir+","+k.sutun+")´de bulunan "+k.enBuyukDeger+"´tir.");
	}
	
	public static double[][] matrisAl(int satir, int sutun,Scanner klavye){  // Kullanýcýdan matris alan metod.
		
		double[][] matris=new double[satir][sutun];
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				matris[i][j]=klavye.nextDouble();
			}
		}
		return matris;
	}

}
