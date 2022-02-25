package Bolum08_BenimYazdiklarim;

public class Sorular_8_16_IkiBoyutluDizininSiralanmasi {
	/*
	 * *8.16 (�ki boyutlu dizinin s�ralanmas�) A�a��daki bildirime sahip iki boyutlu diziyi s�ralayan bir metot yaz�n�z:

			public static void sort(int m[][])
			
			Metot s�ralamay� ilk olarak sat�rlar aras�nda, ard�ndan s�tunlar aras�nda yapacakt�r. �rne�in; a�a��daki dizi;
			
			{{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}
			
			�u �ekilde s�ralanacakt�r.
			
			{{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
	 */
	public static void main(String[] args) {
		int[][] matris={{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
		satirVeSutunSirala(matris);
		yazdir(matris);
	}
	public static void satirVeSutunSirala(int[][] matris) {
		satirSirala(matris);
		sutunSirala(matris);
	}
	
	public static void satirSirala(int m[][]) {
		for (int i = 0; i < m.length-1; i++) {
			int enKucukSatir=m[i][0];
			int enKucukSutun=m[i][1];
			int enKucugunIndisi=i;
			
			for (int j = i+1; j < m.length; j++) { //satirlar�n s�f�r�nc� indisindeki de�erlerin en k���g�n� bulduk.
				if(enKucukSatir > m[j][0]) {
					enKucukSatir=m[j][0];
					enKucukSutun=m[j][1];
					enKucugunIndisi=j;
				}
			}
			if(enKucugunIndisi != i) { 			//Swap algoritmas�n� kulland�k.
				m[enKucugunIndisi][0]=m[i][0];
				m[i][0]=enKucukSatir;
				m[enKucugunIndisi][1]=m[i][1];
				m[i][1]=enKucukSutun;
			}
		}
	}
	public static void sutunSirala(int m[][]) {
		for (int i = 0; i < m.length-1; i++) {
			int enKucuk=m[i][1];
			int enKucugunIndisi=i;
			for (int j = i+1; j < m.length; j++) {
				if(m[i][0]==m[j][0]) {
					if(enKucuk > m[j][1]) {
						enKucuk=m[j][1];
						enKucugunIndisi=j;
					}
				}
			}
			if(enKucugunIndisi != i) {				//Swap algoritmas�n� kulland�k.
				m[enKucugunIndisi][1]=m[i][1];
				m[i][1]=enKucuk;
			}
		}
	}

	public static void yazdir(int[][] matris) {
		for (int i = 0; i < matris.length; i++) {
			if(i==0) {
				System.out.print("{");
			}
			System.out.print("{");
			for (int j = 0; j < matris[i].length; j++) {
				if(j==1) {
					System.out.print(matris[i][j]);
				}
				else {
					System.out.print(matris[i][j]+", ");
				}
			}
			if(i==matris.length-1) {
				System.out.print("}}");
			}else {
				System.out.print("},");
			}
		}
	}
}//  4 2 1 7 4 5 1 2 1 1 4 1