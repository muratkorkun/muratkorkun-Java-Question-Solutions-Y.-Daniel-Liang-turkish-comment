package Bolum09BenimYazdiklarim.sorular_9_08;
/*
 9.8( Fan s�n�f�) Fan isimli bir s�n�f tasarlay�n�z. Bu s�n�fta olmas� gerekenler:
 SLOW, MEDIUM ve FAST isminde 1, 2 ve 3 de�erlerine sahip, fan�n h�z�n� temsil eden �� tane sabit bildiriniz.
 Fan�n h�z� i�in speed isminde int t�rden bir private veri eleman� (varsay�lan de�eri SLOW).
 Fan�n a��k/kapal� bilgisi i�in on isminde boolean t�rden bir private veri eleman� (varsay�lan de�eri false).
 Fan�n duru� a��s� i�in radius isminde double t�rden bir private veri eleman� (varsay�lan de�eri 5).
 Fan�n rengi i�in color isminde string t�rden bir private veri eleman� (varsay�lan de�eri mavi).
 T�m veri elemanlar� i�in eri�im metotlar� ile de�i�tiren metotlar� yaz�n�z.
 Parametresiz constructor varsay�lan bir fan nesnesi yarat�r.
  toString() metodunun geri d�n�� de�eri fan nesnesinin a��klamalar�d�r. E�er fan nesnesi a��k ise bu metot, h�z, a�� ve renk bilgisinden olu�an bir string geri d�ner.
  E�er fan nesnesi kapal�ysa bu metot, fan�n rengi ve a��s�yla �fan kapal�� mesaj�ndan olu�an bir string geri d�ner.
  S�n�f� yazmadan �nce, UML �emas�n� �iziniz. �ki tane Fan nesnesi yaratan bir test program� yaz�n�z: �lk nesnenin h�z� en y�ksek, a��s� 10, rengi sar�, ve durumu a��k olacakt�r.
  �kinci nesnenin h�z� orta, a��s� 5, rengi mavi ve durumu kapal� olacakt�r.  toString metotlar�n� �a��rarak nesnelerin durumunu g�steriniz.
*/

public class Test {
	public static void main(String[] args) {
		Fan f1= new Fan();
		f1.setSpeed(3);
		f1.setRadius(10);
		f1.setColor("Sar�");
		f1.setOn(true);
		Fan f2 = new Fan();
		f2.setSpeed(2);
		f2.setRadius(5);
		f2.setColor("mavi");
		f2.setOn(false);
		System.out.println(f1.toString());
		System.out.println(f2.toString());
	}
	
	

}
