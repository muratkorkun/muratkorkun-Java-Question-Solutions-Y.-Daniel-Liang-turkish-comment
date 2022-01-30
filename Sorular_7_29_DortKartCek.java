package Bolum07_DersteYazilanKodlar;

public class Sorular_7_29_DortKartCek {
	/*
	 * (Oyun: D�rt kart �ekme) 52 karttan olu�an bir iskambil destesinden 4 kart �eken ve bu kartlar�n toplam de�erini hesaplayan bir program yaz�n�z. 
	 * As, Papaz, K�z ve Vale i�in say�sal de�erler s�ras�yla 1, 13, 12, 11�dir. Program�n�z 24�e ula�mak i�in gereken �ekme say�s�n� g�stersin.
	 */
	public static void main(String[] args) {
		
		int[] deste=karisikDesteyiAl();     
		
		int[] dortKart=new int[4]; 
		
		int turSayisi=0;  
		
		do {
			dortKart=dortKartCek(deste); // 24 toplam� bulunana kadar kart �ekildi.
			turSayisi++;      // Ka� turda boyunca kart da��t�ld���n� hesaplayan bir saya� olu�turduk ve her kart da��t�m turunda bir artmas�n� sa�lad�k.
			
		} while(!toplam24Mu(dortKart));  // toplam 24 olana kadar �al��an bir d�ng� olu�turduk.
		
		System.out.print("Tebrikler "+turSayisi+". turda 24'e ula�t�n�z.\nKartlar�n�z ====>> \n");
		
		kartlariEkrandaGoster(dortKart);
	}

	public static void kartlariEkrandaGoster(int[] dortKart) {
		String[] kartNumaralari={"As","ikilisi","��l�s�","d�rtl�s�","be�lisi","alt�l�s�","yedilisi","sekizlisi","dokuzlusu","onlusu","O�lan�","K�z�","Papaz�"};  
		
		String[] kartTipleri={"Kupa","Ma�a","Karo","Sinek"};     // Destede bulunan 0-51 dahil aral�g�ndaki kartlar� ba�da�t�rabilmek amac�yla String t�r�ndeki Numara ve tip dizilerini  olu�turduk.
		
		for (int i = 0; i < dortKart.length; i++) {
			System.out.println(kartTipleri[dortKart [i] / 13]+" "+kartNumaralari[dortKart [i] % 13]);  //�nteger aritmeti�inden faydalanarak �ekilen d�rt kart�n de�erlerini kartTiplerinin ve kartNumaralar�n�n indisleriyle ba�da�t�rd�k.
		}
	}
	
	private static int[] karisikDesteyiAl() {  // Desteyi olu�turduk ve kar��t�rd�k.
		int[] deste=new int[52];
		int temp=0;
		for (int i = 0; i < deste.length; i++) {  //Desteyi olu�turduk.Yani ilklendirdik.
			deste[i]=i;
		}  
		
		int rassalSayi=0;
		
		for (int i = 0; i < deste.length; i++) { 			//Burada rasgele indis numaras� bulup o indisler ile i'inci indislerin de�erlerini yer de�i�tirdik.
			rassalSayi=(int)(Math.random()*52);				//Desteyi kar��t�rd�k.	
			temp=deste[i];
			deste[i]=deste[rassalSayi];
			deste[rassalSayi]=temp;
		}
		return deste;   // Kar���k desteyi methoddan d�nderdik.
	}
	
	public static int[] dortKartCek(int[] deste) {  //Desteden dort kart �ektik
		int[] dortKart=new int[4];
	
		for (int i = 0; i < 4; i++) {
			dortKart[i]=deste[(int)(Math.random()*52)];  // Rastgele bir kart �ekiliyor.
		}
		return dortKart;
	}
	public static boolean toplam24Mu(int[] deste) {  // Yard�mc� method yazd�k toplam24Mu isminde.
		int toplam=0;
		for (int i = 0; i < deste.length; i++) {
			toplam+=deste[i]%13+1;
		}
		return toplam==24;   //Toplam 24 ise true d�nen de�ilse false d�nen bir metot yazm�� olduk.
	}
}
