package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_17_FinansalTsunami {
	/*
	 * ***8.17(Finansal tsunami) Bankalar birbirlerine borç para verirler. Ekonomik kriz durumunda batan bankalar borçlarýný geri ödeyemeyebilirler. Bir bankanýn toplam varlýðý güncel bakiyesi ile diðer bankalara verdiði borçlarýn toplamýdýr. 
	 * Þekil 8.8’deki þema beþ bankayý gösterir. Bu bankalarýn güncel bakiyeleri sýrasýyla  25, 125, 175, 75, ve 181 milyon dolardýr.  1. düðümden 2. düðüme giden ok, 1. bankanýn 2. bankaya 40 milyon dolar borç verdiðini gösterir.

Eðer bir bankanýn toplam varlýðý belli limitin altýndaysa bu banka risk altýnda olarak deðerlendirilir. Bu bankaya verilen borç geri ödenmeyebilir; bu nedenle borç veren banka bunu toplam varlýklarýna ekleyemez. 
Bu sebeple, borç veren bankanýn da toplam varlýklarý limit altýnda kalýrsa bu banka da risk altýnda olarak deðerlendirilir. Tüm risk altýnda olan bankalarý bulan bir program yazýnýz. 
Programýnýz girdiyi aþaðýdaki biçimde okusun. Öncelikle int türden n ve limit deðerlerini okuyacak. n banka sayýsýný, limit ise bankanýn risk altýnda olmayacaðý en az varlýk miktarýný gösterir. 
Banka numarasý 0’dan n-1’e kadar olacak þekilde; banka bilgilerini içeren n satýrý okuyacak.

Satýrdaki ilk sayý bankanýn bakiyesi, ikinci sayý borç para verdiði banka sayýsý ve diðerleri sayý çiftleri olarak devam eder. Her bir sayý çifti borç para alan bankayý gösterir. Bu sayý çiftlerinde bulan ilk sayý borç alan bankanýn numarasý, ikinci sayý borç aldýðý miktarý gösterir. Örneðin; beþ bankaya ait girdileri aþaðýda bulabilirsiniz. (limit deðeri 201’dir.)

5 201
25 2 1 100,5 4 320,5 	125 2 2 40 3 85		175 2 0 125 3 75		75 1 0 125		181 1 2 125

3 numaralý bankanýn toplam varlýklarý (75 + 125) limit deðer olan 201’in altýnda olduðu için bu banka riskli bankadýr. 3 numaralý banka risk altýnda olduðu için, 1 numaralý bankanýn da toplam varlýklarý limitin altýna düþer (125 + 40). 
Bu durumda 1 numaralý banka da risk altýndadýr. Program çýktýsý þu þekilde olmalýdýr.

Risk altýa olan bankalar : 3, 1

(Ýpucu: Borç miktarýný saklamak için iki boyutlu borrowers isimli diziyi kullanýnýz. borrowers[i][j] dizisi i bankasýnýn j bankasýna verdiði borcu göstersin.  j bankasý risk altýnda olursa, borrowers[i][j]’ye 0 deðeri atansýn.)
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("Banka sayýsý ve limit deðeri giriniz : ");
		int bankaSayisi=klavye.nextInt();
		int limitDeger=klavye.nextInt();
		System.out.println("Bankalarýn bakiye, borç verdiði banka sayýsý, borç verdiði bankalarýn nosu ve bu bankalara verdiði borç miktarlarýný sýrasý ile giriniz.");
		
		double[][] borclular = borclularAl(klavye,bankaSayisi);
		klavye.close();
		boolean[] riskliBankalar=riskliBankalar(borclular, limitDeger);
		riskliBankalarYazdir(riskliBankalar);
	}

	public static double[][] borclularAl(Scanner klavye,int bankaSayisi) {
		double borclular[][] =new double[bankaSayisi][bankaSayisi];
		for (int i = 0; i < borclular.length; i++) {
			borclular[i][i]=klavye.nextDouble();
			int borcVerilenBankaSayisi=klavye.nextInt();
			
			for (int j = 0; j < borcVerilenBankaSayisi; j++) {
				int bankaIndeksi=klavye.nextInt();
				borclular[i][bankaIndeksi]=klavye.nextDouble();
			}
		}
		return borclular;
	}
	
	public static double bankaVarlikAl(double[][] borclular,int i) {  // indeksine göre banka varliklarinýn toplamini dönderen metod.
		double bankaVarlik=0;
		for (int j = 0; j < borclular[i].length; j++) {
				bankaVarlik+=borclular[i][j];
			}
		return bankaVarlik;
	}
	
	public static boolean riskliMi(double[][] borclular, double limit, int i) {  // indeksine göre banka risklimi kontrol eden metod.
		if(bankaVarlikAl(borclular, i) < limit) {
			return true;
		}
		return false;
	}
	
	public static boolean[] riskliBankalar(double[][] borclular,double limit) {  // Riskli bankalarý bulan ve boolean diziye atayan metod.
		boolean[] riskliBankalar=new boolean[borclular.length];
		for (int k = 0; k < riskliBankalar.length; k++) {
			for (int i = 0; i < borclular.length; i++) {
				boolean bankaRiskliMi=riskliMi(borclular, limit, i);
				for (int j = 0; j < borclular.length; j++) {
					if(bankaRiskliMi && j != i) {
						borclular[j][i]=0;
					}
				}
				riskliBankalar[i]=riskliMi(borclular, limit, i);
			}
		}
		return riskliBankalar;
	}
	
	public static void riskliBankalarYazdir(boolean[] riskliBankalar) {  // Riskli bankalar boolean dizisini yadýran metod.
		System.out.print("Riskli banka(lar) : ");
		
		int dogruSayac=0;
		for (int i = 0; i < riskliBankalar.length; i++) {
			if(riskliBankalar[i]) {
				System.out.print(i+" ");
				dogruSayac++;
			}
		}
		if(dogruSayac == 0) {
			System.out.print("yoktur");
		}
	}
}
//		Banka sayýsý ve limit deðeri 		5 201
//		Bankalarýn bakiye, borç verdiði banka sayýsý, borç verdiði bankalarýn nosu ve bu bankalara verdiði borç miktarlarý :	25 2 1 100,5 4 320,5 	125 2 2 40 3 85		175 2 0 125 3 75		75 1 0 125		181 1 2 125

