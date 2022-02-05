package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_31_IkýSiraliListeyiBirlestirmeVer_2 {
	/*
	 * 7.31 (Sýralý iki diziyi birleþtirme) Ýki sýralý diziyi birleþtirip yeni bir
	 * sýralý dizi oluþturan aþaðýdaki bildirime sahip bir metot yazýnýz.
	 * 
	 * public static int[] merge(int[] list1, int[] list2)
	 * 
	 * Metodu en fazla list1.length + list2. length toplam sayýsýný geçmeyecek kadar
	 * karþýlaþtýrma yapacak þekilde yazýnýz. Kullanýcýdan iki sýralý dizi girmesini
	 * isteyen ve birleþtirilmiþ diziyi gösteren bir test programý yazýnýz. Örnek
	 * akýþý inceleyiniz. Girilen ilk sayýnýn dizinin eleman sayýsýný göstereceðini
	 * unutmayýnýz. Bu sayý dizinin bir elemaný olmayacaktýr.
	 * 
	 * Dizi1’i giriniz:     5 1 5 16 61 111                                örneklem     //   10 -334 -67 -67 -34  -23 -12  -5 -5  0  999
	 * 																			     	// 	 15  1 2 4 5 5 6  09 16 34 56 61 67 98 111 447 
	 * Dizi2’yi giriniz:    4 2 4 5 6                                   
	 * 
	 * Birlestirilmis dizi  1 2 4 5 5 6 16 61 111                           		    //  -334 -67 -67 -34 -23 -12 -5 -5 0 1 2 4 5 5 6 9 16 34 56 61 67 98 111 447 999 
	 */
	public static void main(String[] args) {
		System.out.println("Dizi1'i giriniz ilk sayý dizinin eleman sayýsý olacaktýr.");
		Scanner klavye = new Scanner(System.in);

		int[] list1 = new int[klavye.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = klavye.nextInt();
		}

		System.out.println("Dizi2'i giriniz ilk sayý dizinin eleman sayýsý olacaktýr.");
		int[] list2 = new int[klavye.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = klavye.nextInt();
		}
		klavye.close();

		int[] listBirlesik = birlestir(list1, list2);
		for (int i = 0; i < listBirlesik.length; i++) {
			System.out.print(listBirlesik[i] + " ");
		}
	}

	public static int[] birlestir(int[] list1, int[] list2) {
		int isaretci_1 = 0;
		int isaretci_2 = 0;
		int birlesikListeIndis = 0;
		int[] birlesikListe = new int[list1.length + list2.length];

		while (birlesikListeIndis < list1.length + list2.length) {   // Döngümüzü liste 1 ve  liste 2 nin toplamýna kadar  olacak þekilde ayarladýk.  Listeleri pointerlar ile izleyerek dizi elemlarýný karþýlaþtýrdýk. 

			if (list1[isaretci_1] <= list2[isaretci_2] && isaretci_1 < list1.length - 1) {  //Burada liste1 de iþaretçinin gösterdiði deðer liste2 nin iþaretçisinin gösterdiði deðerden küçük mü yada eþit mi kýyasladýk .Eðer doðru ise birlesik listemize atadýk ve iþaretçimizi bir ilerlettik.
				birlesikListe[birlesikListeIndis] = list1[isaretci_1];
				isaretci_1++;
			} else if (list1[isaretci_1] <= list2[isaretci_2] && isaretci_1 == list1.length) {//Burada eðer liste1 in sonuna  ulaþýldý ise son elemanýn birleþik listeye atamasýný yaptýk. Ve diðer listede kalan elmanlarýn hepsini birlesik listeye atadýk. 
				birlesikListe[birlesikListeIndis] = list1[isaretci_1];
				while(isaretci_2 <list2.length) {
				
					birlesikListe[list1.length+isaretci_2]=list2[isaretci_2];  // Liste1'in yazýlmasý zaten bittiyse liste1'in indis saysýna liste2'nin iþaretçisinin sayýsýný ekleyerek birlesikListe'nin indisine gereken atamayý yaptýk.
					birlesikListeIndis++;						//Her atamadan sonra birlesikIndis'i bir artýrdýk . Büyük döngüye  birlesikListe dizimiz hazýrlandý tamam iþ bitti  diyebilmek için bunu yaptýk.
					isaretci_2++;                            //Yine iþaretciyi bir ilerletttik.
				}
				
			} else if (list1[isaretci_1] > list2[isaretci_2] && isaretci_2 < list2.length - 1) {  // Eðer liste1'in iþaret edilen elemaný büyükse liste2'nin iþaret edilen elemanýndan  ve iþaretçi_2 küçükse liste2'nin son indisinden bu blok çalýþsýn dedik. 
				birlesikListe[birlesikListeIndis] = list2[isaretci_2];								//Çünki son elemana denk gelen iþaretçiyi ayrýca denetledik.
				isaretci_2++;
			}
			else if (list1[isaretci_1] > list2[isaretci_2] && isaretci_2 == list2.length - 1) {  // Burada iþaretçi_2 için son elemaný gösterme durumunu denetledik.
				birlesikListe[birlesikListeIndis] = list2[isaretci_2];						// liste2'nin son atamasýný yaptýk
				while(isaretci_1 <list1.length) {											//liste1'de kalan elemanlarýn hepsi birlesikListe'ye yazýlana kadar döngü kullandýk.
																								
					birlesikListe[list2.length+isaretci_1]=list1[isaretci_1];
					birlesikListeIndis++;
					isaretci_1++;
				}
			}

			birlesikListeIndis++;
		}

		return birlesikListe;

	}
}

