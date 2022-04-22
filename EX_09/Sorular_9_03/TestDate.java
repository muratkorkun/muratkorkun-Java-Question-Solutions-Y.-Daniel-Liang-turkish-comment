package Bolum09BenimYazdiklarim.Sorular_9_03;

/**
 * 9.3 ( Date sýnýfý) Bir Date nesnesi yaratýn ve geçen zamaný (elapsed time)
 * 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, 100000000000
 *  olarak ayarlayýn ve tarih - zamaný sýrasýyla toString() metodunu kullanarak gösteriniz.
 */
public class TestDate {
	private static long gecenZamanMsBaslangic = 10_000;
	private static long gecenZamanMsBitis =100000000000L;

	public static void main(String[] args) {

		java.util.Date date1 = new java.util.Date();

		while (true) {
			date1.setTime(gecenZamanMsBaslangic);
			System.out.println(date1.toString());
			gecenZamanMsBaslangic *= 10;
			if (gecenZamanMsBaslangic >= gecenZamanMsBitis) {
				break;
			}
		}
	}
}
