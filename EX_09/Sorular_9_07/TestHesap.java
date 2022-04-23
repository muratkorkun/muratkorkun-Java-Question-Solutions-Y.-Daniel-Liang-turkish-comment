package Bolum09BenimYazdiklarim.Sorular_9_07;
/*9.7 ( Account s�n�f�)  Account isimli bir s�n�f tasarlay�n�z.
 Hesap numaras� i�in, id isminde int t�rden bir private veri eleman� (varsay�lan 0).
 Hesap bakiyesi i�in, balance isminde double t�rden bir private veri eleman� (varsay�lan 0).
 G�ncel faiz oran� i�in annualInterestRate isminde double t�rden bir private veri eleman� (varsay�lan 0).  
 T�m hesaplar�n ayn� faiz oran�na sahip olduklar�n� varsayal�m.
 Hesab�n yarat�ld��� tarih bilgisi i�in dateCreated isminde Date t�r�nde bir private veri eleman�.
 Varsay�lan bir hesap yaratan parametresiz bir constructor.
 Belirtilen id ve bakiye parametreleri ile bir account nesnesi yaratan constructor.
 id, balance, ve annualInterestRate i�in eri�im metotlar� ile de�i�tiren metotlar� yaz�n�z.
 dateCreated i�in eri�im metodu.
 Geri d�n�� de�eri ayl�k faiz oran� olan getMonthlyInterestRate() metodu.
 Geri d�n�� de�eri ayl�k faiz olan getMonthlyInterest() metodu.
 Hesaptan belirtilen miktarda para �ekilmesini sa�layan withdraw metodu.
 Hesaba belirtilen miktarda para yat�r�lmas�n� sa�layan deposit metodu.
 
 S�n�f� yazmadan �nce UML �emas�n� �iziniz. (�pucu:  getMonthlyInterest() metodunun geri d�n�� de�eri faiz oran� de�il, ayl�k faiz miktar� olmal�.
 Ayl�k faiz miktar�; balance * monthlyInterestRate. monthlyInterestRate = annualInterestRate / 12.  annualInterestRate y�zde olarak verilir.�rne�in, %4.5. Bu de�eri 100�e b�lmeniz gerekir.)
 Hesap numaras� (id) 1122, bakiyesi (balance) 20 000$ ve y�ll�k faiz oran� %4.5 de�erleriyle bir Account nesnesi yaratan bir program yaz�n�z. 
 withdraw metodunu kullanarak 2 500$ �ekiniz, deposit metodunu kullanarak 3 000$ yat�r�n�z. Bakiyeyi, ayl�k faizi ve hesab�n a��l�� tarihini g�sterini
 */

public class TestHesap {

	public static void main(String[] args) {
		
		Hesap h1 = new Hesap(1122, 20_000);
		h1.setYillikFaizOrani(4.5);
		h1.paraCek(2500);
		h1.paraYatir(3000);
		System.out.print(h1.getId()+" nolu hesab�n ...\n"+"Bakiyesi : "+h1.getBakiye()+"\nAyl�k faiz miktar� : "+h1.getAylikFaizMiktari()+"\nHesab�n a��l�� tarihi : "+h1.getOlusturulduguTarih());

	}

}