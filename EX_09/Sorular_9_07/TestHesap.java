package Bolum09BenimYazdiklarim.Sorular_9_07;
/*9.7 ( Account sýnýfý)  Account isimli bir sýnýf tasarlayýnýz.
 Hesap numarasý için, id isminde int türden bir private veri elemaný (varsayýlan 0).
 Hesap bakiyesi için, balance isminde double türden bir private veri elemaný (varsayýlan 0).
 Güncel faiz oraný için annualInterestRate isminde double türden bir private veri elemaný (varsayýlan 0).  
 Tüm hesaplarýn ayný faiz oranýna sahip olduklarýný varsayalým.
 Hesabýn yaratýldýðý tarih bilgisi için dateCreated isminde Date türünde bir private veri elemaný.
 Varsayýlan bir hesap yaratan parametresiz bir constructor.
 Belirtilen id ve bakiye parametreleri ile bir account nesnesi yaratan constructor.
 id, balance, ve annualInterestRate için eriþim metotlarý ile deðiþtiren metotlarý yazýnýz.
 dateCreated için eriþim metodu.
 Geri dönüþ deðeri aylýk faiz oraný olan getMonthlyInterestRate() metodu.
 Geri dönüþ deðeri aylýk faiz olan getMonthlyInterest() metodu.
 Hesaptan belirtilen miktarda para çekilmesini saðlayan withdraw metodu.
 Hesaba belirtilen miktarda para yatýrýlmasýný saðlayan deposit metodu.
 
 Sýnýfý yazmadan önce UML þemasýný çiziniz. (Ýpucu:  getMonthlyInterest() metodunun geri dönüþ deðeri faiz oraný deðil, aylýk faiz miktarý olmalý.
 Aylýk faiz miktarý; balance * monthlyInterestRate. monthlyInterestRate = annualInterestRate / 12.  annualInterestRate yüzde olarak verilir.Örneðin, %4.5. Bu deðeri 100’e bölmeniz gerekir.)
 Hesap numarasý (id) 1122, bakiyesi (balance) 20 000$ ve yýllýk faiz oraný %4.5 deðerleriyle bir Account nesnesi yaratan bir program yazýnýz. 
 withdraw metodunu kullanarak 2 500$ çekiniz, deposit metodunu kullanarak 3 000$ yatýrýnýz. Bakiyeyi, aylýk faizi ve hesabýn açýlýþ tarihini gösterini
 */

public class TestHesap {

	public static void main(String[] args) {
		
		Hesap h1 = new Hesap(1122, 20_000);
		h1.setYillikFaizOrani(4.5);
		h1.paraCek(2500);
		h1.paraYatir(3000);
		System.out.print(h1.getId()+" nolu hesabýn ...\n"+"Bakiyesi : "+h1.getBakiye()+"\nAylýk faiz miktarý : "+h1.getAylikFaizMiktari()+"\nHesabýn açýlýþ tarihi : "+h1.getOlusturulduguTarih());

	}

}