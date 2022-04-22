package Bolum09BenimYazdiklarim.Sorular_9_02;
/*9.2 (Stock s�n�f�) B�l�m 9.2�deki Circle s�n�f� gibi Stock isminde bir s�n�f yaz�n�z. Bu s�n�f:

 Stok sembol� i�in  symbol isminde string t�r�nden bir veri eleman�.
 Stok ad� i�in name isminde string t�r�nden bir veri eleman�.
 Bir �nceki g�ne ait stok fiyat�n� tutan  previousClosingPrice isminde double t�rden bir veri eleman�.
 Bir g�ncel stok fiyat�n� tutan currentPrice isminde double t�rden bir veri eleman�.
 Belirtilen sembol ve isim parametreleri ile bir stok nesnesi yaratan constructor.
 Geri d�n�� de�eri, g�ncel fiyat (currentPrice) ile bir �nceki fiyat (previousClosingPrice) aras�ndaki de�i�im olan getChangePercent() metodu.
S�n�f� yazmadan �nce UML �emas�n� �iziniz. Stok sembol� ORCL, ismi Oracle Corporation ve bir �nceki kapan�� fiyat� 34.5 
arg�manlar� ile Stock t�r�nden nesne yaratan bir program yaz�n�z. G�ncel fiyat� 34.35 olarak atay�n ve fiyat de�i�im y�zdesini (getChangePercent()) g�sterin.
*/
public class Test {
	public static void main(String[] args) {
		Stok oracle = new Stok("ORCL","Oracle Corporation");
		oracle.oncekiKapanisFiyati=34.5;
		oracle.guncelFiyat=34.35;
		
		System.out.print("Fiyat de�i�imi : % ");
		System.out.printf("%.2f",oracle.alDegisimYuzdesi());
		
		
	}

}
