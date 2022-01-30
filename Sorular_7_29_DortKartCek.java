package Bolum07_DersteYazilanKodlar;

public class Sorular_7_29_DortKartCek {
	/*
	 * (Oyun: Dört kart çekme) 52 karttan oluþan bir iskambil destesinden 4 kart çeken ve bu kartlarýn toplam deðerini hesaplayan bir program yazýnýz. 
	 * As, Papaz, Kýz ve Vale için sayýsal deðerler sýrasýyla 1, 13, 12, 11’dir. Programýnýz 24’e ulaþmak için gereken çekme sayýsýný göstersin.
	 */
	public static void main(String[] args) {
		
		int[] deste=karisikDesteyiAl();     
		
		int[] dortKart=new int[4]; 
		
		int turSayisi=0;  
		
		do {
			dortKart=dortKartCek(deste); // 24 toplamý bulunana kadar kart çekildi.
			turSayisi++;      // Kaç turda boyunca kart daðýtýldýðýný hesaplayan bir sayaç oluþturduk ve her kart daðýtým turunda bir artmasýný saðladýk.
			
		} while(!toplam24Mu(dortKart));  // toplam 24 olana kadar çalýþan bir döngü oluþturduk.
		
		System.out.print("Tebrikler "+turSayisi+". turda 24'e ulaþtýnýz.\nKartlarýnýz ====>> \n");
		
		kartlariEkrandaGoster(dortKart);
	}

	public static void kartlariEkrandaGoster(int[] dortKart) {
		String[] kartNumaralari={"As","ikilisi","üçlüsü","dörtlüsü","beþlisi","altýlýsý","yedilisi","sekizlisi","dokuzlusu","onlusu","Oðlaný","Kýzý","Papazý"};  
		
		String[] kartTipleri={"Kupa","Maça","Karo","Sinek"};     // Destede bulunan 0-51 dahil aralýgýndaki kartlarý baðdaþtýrabilmek amacýyla String türündeki Numara ve tip dizilerini  oluþturduk.
		
		for (int i = 0; i < dortKart.length; i++) {
			System.out.println(kartTipleri[dortKart [i] / 13]+" "+kartNumaralari[dortKart [i] % 13]);  //Ýnteger aritmetiðinden faydalanarak çekilen dört kartýn deðerlerini kartTiplerinin ve kartNumaralarýnýn indisleriyle baðdaþtýrdýk.
		}
	}
	
	private static int[] karisikDesteyiAl() {  // Desteyi oluþturduk ve karýþtýrdýk.
		int[] deste=new int[52];
		int temp=0;
		for (int i = 0; i < deste.length; i++) {  //Desteyi oluþturduk.Yani ilklendirdik.
			deste[i]=i;
		}  
		
		int rassalSayi=0;
		
		for (int i = 0; i < deste.length; i++) { 			//Burada rasgele indis numarasý bulup o indisler ile i'inci indislerin deðerlerini yer deðiþtirdik.
			rassalSayi=(int)(Math.random()*52);				//Desteyi karýþtýrdýk.	
			temp=deste[i];
			deste[i]=deste[rassalSayi];
			deste[rassalSayi]=temp;
		}
		return deste;   // Karýþýk desteyi methoddan dönderdik.
	}
	
	public static int[] dortKartCek(int[] deste) {  //Desteden dort kart çektik
		int[] dortKart=new int[4];
	
		for (int i = 0; i < 4; i++) {
			dortKart[i]=deste[(int)(Math.random()*52)];  // Rastgele bir kart çekiliyor.
		}
		return dortKart;
	}
	public static boolean toplam24Mu(int[] deste) {  // Yardýmcý method yazdýk toplam24Mu isminde.
		int toplam=0;
		for (int i = 0; i < deste.length; i++) {
			toplam+=deste[i]%13+1;
		}
		return toplam==24;   //Toplam 24 ise true dönen deðilse false dönen bir metot yazmýþ olduk.
	}
}
