package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_17_FinansalTsunami {
	/*
	 * ***8.17(Finansal tsunami) Bankalar birbirlerine bor� para verirler. Ekonomik kriz durumunda batan bankalar bor�lar�n� geri �deyemeyebilirler. Bir bankan�n toplam varl��� g�ncel bakiyesi ile di�er bankalara verdi�i bor�lar�n toplam�d�r. 
	 * �ekil 8.8�deki �ema be� bankay� g�sterir. Bu bankalar�n g�ncel bakiyeleri s�ras�yla  25, 125, 175, 75, ve 181 milyon dolard�r.  1. d���mden 2. d���me giden ok, 1. bankan�n 2. bankaya 40 milyon dolar bor� verdi�ini g�sterir.

E�er bir bankan�n toplam varl��� belli limitin alt�ndaysa bu banka risk alt�nda olarak de�erlendirilir. Bu bankaya verilen bor� geri �denmeyebilir; bu nedenle bor� veren banka bunu toplam varl�klar�na ekleyemez. 
Bu sebeple, bor� veren bankan�n da toplam varl�klar� limit alt�nda kal�rsa bu banka da risk alt�nda olarak de�erlendirilir. T�m risk alt�nda olan bankalar� bulan bir program yaz�n�z. 
Program�n�z girdiyi a�a��daki bi�imde okusun. �ncelikle int t�rden n ve limit de�erlerini okuyacak. n banka say�s�n�, limit ise bankan�n risk alt�nda olmayaca�� en az varl�k miktar�n� g�sterir. 
Banka numaras� 0�dan n-1�e kadar olacak �ekilde; banka bilgilerini i�eren n sat�r� okuyacak.

Sat�rdaki ilk say� bankan�n bakiyesi, ikinci say� bor� para verdi�i banka say�s� ve di�erleri say� �iftleri olarak devam eder. Her bir say� �ifti bor� para alan bankay� g�sterir. Bu say� �iftlerinde bulan ilk say� bor� alan bankan�n numaras�, ikinci say� bor� ald��� miktar� g�sterir. �rne�in; be� bankaya ait girdileri a�a��da bulabilirsiniz. (limit de�eri 201�dir.)

5 201
25 2 1 100,5 4 320,5 	125 2 2 40 3 85		175 2 0 125 3 75		75 1 0 125		181 1 2 125

3 numaral� bankan�n toplam varl�klar� (75 + 125) limit de�er olan 201�in alt�nda oldu�u i�in bu banka riskli bankad�r. 3 numaral� banka risk alt�nda oldu�u i�in, 1 numaral� bankan�n da toplam varl�klar� limitin alt�na d��er (125 + 40). 
Bu durumda 1 numaral� banka da risk alt�ndad�r. Program ��kt�s� �u �ekilde olmal�d�r.

Risk alt�a olan bankalar : 3, 1

(�pucu: Bor� miktar�n� saklamak i�in iki boyutlu borrowers isimli diziyi kullan�n�z. borrowers[i][j] dizisi i bankas�n�n j bankas�na verdi�i borcu g�stersin.  j bankas� risk alt�nda olursa, borrowers[i][j]�ye 0 de�eri atans�n.)
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("Banka say�s� ve limit de�eri giriniz : ");
		int bankaSayisi=klavye.nextInt();
		int limitDeger=klavye.nextInt();
		System.out.println("Bankalar�n bakiye, bor� verdi�i banka say�s�, bor� verdi�i bankalar�n nosu ve bu bankalara verdi�i bor� miktarlar�n� s�ras� ile giriniz.");
		
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
	
	public static double bankaVarlikAl(double[][] borclular,int i) {  // indeksine g�re banka varliklarin�n toplamini d�nderen metod.
		double bankaVarlik=0;
		for (int j = 0; j < borclular[i].length; j++) {
				bankaVarlik+=borclular[i][j];
			}
		return bankaVarlik;
	}
	
	public static boolean riskliMi(double[][] borclular, double limit, int i) {  // indeksine g�re banka risklimi kontrol eden metod.
		if(bankaVarlikAl(borclular, i) < limit) {
			return true;
		}
		return false;
	}
	
	public static boolean[] riskliBankalar(double[][] borclular,double limit) {  // Riskli bankalar� bulan ve boolean diziye atayan metod.
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
	
	public static void riskliBankalarYazdir(boolean[] riskliBankalar) {  // Riskli bankalar boolean dizisini yad�ran metod.
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
//		Banka say�s� ve limit de�eri 		5 201
//		Bankalar�n bakiye, bor� verdi�i banka say�s�, bor� verdi�i bankalar�n nosu ve bu bankalara verdi�i bor� miktarlar� :	25 2 1 100,5 4 320,5 	125 2 2 40 3 85		175 2 0 125 3 75		75 1 0 125		181 1 2 125

