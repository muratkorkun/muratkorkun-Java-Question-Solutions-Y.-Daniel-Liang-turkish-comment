package Bolum09BenimYazdiklarim.Sorular_9_02;
/*9.2 (Stock sýnýfý) Bölüm 9.2’deki Circle sýnýfý gibi Stock isminde bir sýnýf yazýnýz. Bu sýnýf:

 Stok sembolü için  symbol isminde string türünden bir veri elemaný.
 Stok adý için name isminde string türünden bir veri elemaný.
 Bir önceki güne ait stok fiyatýný tutan  previousClosingPrice isminde double türden bir veri elemaný.
 Bir güncel stok fiyatýný tutan currentPrice isminde double türden bir veri elemaný.
 Belirtilen sembol ve isim parametreleri ile bir stok nesnesi yaratan constructor.
 Geri dönüþ deðeri, güncel fiyat (currentPrice) ile bir önceki fiyat (previousClosingPrice) arasýndaki deðiþim olan getChangePercent() metodu.
Sýnýfý yazmadan önce UML þemasýný çiziniz. Stok sembolü ORCL, ismi Oracle Corporation ve bir önceki kapanýþ fiyatý 34.5 
argümanlarý ile Stock türünden nesne yaratan bir program yazýnýz. Güncel fiyatý 34.35 olarak atayýn ve fiyat deðiþim yüzdesini (getChangePercent()) gösterin.
*/
public class Test {
	public static void main(String[] args) {
		Stok oracle = new Stok("ORCL","Oracle Corporation");
		oracle.oncekiKapanisFiyati=34.5;
		oracle.guncelFiyat=34.35;
		
		System.out.print("Fiyat deðiþimi : % ");
		System.out.printf("%.2f",oracle.alDegisimYuzdesi());
		
		
	}

}
