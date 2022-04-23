package Bolum09BenimYazdiklarim.sorular_9_08;
/*
 9.8( Fan sýnýfý) Fan isimli bir sýnýf tasarlayýnýz. Bu sýnýfta olmasý gerekenler:
 SLOW, MEDIUM ve FAST isminde 1, 2 ve 3 deðerlerine sahip, fanýn hýzýný temsil eden üç tane sabit bildiriniz.
 Fanýn hýzý için speed isminde int türden bir private veri elemaný (varsayýlan deðeri SLOW).
 Fanýn açýk/kapalý bilgisi için on isminde boolean türden bir private veri elemaný (varsayýlan deðeri false).
 Fanýn duruþ açýsý için radius isminde double türden bir private veri elemaný (varsayýlan deðeri 5).
 Fanýn rengi için color isminde string türden bir private veri elemaný (varsayýlan deðeri mavi).
 Tüm veri elemanlarý için eriþim metotlarý ile deðiþtiren metotlarý yazýnýz.
 Parametresiz constructor varsayýlan bir fan nesnesi yaratýr.
  toString() metodunun geri dönüþ deðeri fan nesnesinin açýklamalarýdýr. Eðer fan nesnesi açýk ise bu metot, hýz, açý ve renk bilgisinden oluþan bir string geri döner.
  Eðer fan nesnesi kapalýysa bu metot, fanýn rengi ve açýsýyla ‘fan kapalý’ mesajýndan oluþan bir string geri döner.
  Sýnýfý yazmadan önce, UML þemasýný çiziniz. Ýki tane Fan nesnesi yaratan bir test programý yazýnýz: Ýlk nesnenin hýzý en yüksek, açýsý 10, rengi sarý, ve durumu açýk olacaktýr.
  Ýkinci nesnenin hýzý orta, açýsý 5, rengi mavi ve durumu kapalý olacaktýr.  toString metotlarýný çaðýrarak nesnelerin durumunu gösteriniz.
*/

public class Test {
	public static void main(String[] args) {
		Fan f1= new Fan();
		f1.setSpeed(3);
		f1.setRadius(10);
		f1.setColor("Sarý");
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
