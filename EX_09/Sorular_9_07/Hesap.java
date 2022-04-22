package Bolum09BenimYazdiklarim.Sorular_9_07;

import java.util.Date;

/*----------------UML Class Diagram-------------------
 * Hesap
 *----------------------------------
 *-id: int
 *-bakiye: double
 *-yillikFaizOrani: double
 * -olusturulduguTarih: Date
 * ----------------------------------
 * +Hesap(): Hesap
 * +Hesap(id,bakiye): Hesap
 * +setId(): int
 * +setBakiye(): double
 * +setYillikFaizOrani(): double
 * +getId(): int
 * +getBakiye(): double
 * +getYillikFaizOrani(): double
 * +getOlusturulduguTarih(): Date
 * +getAylikFaizOrani(): double
 * +getAylikFaizMiktari(): double
 * +paraCek(): double
 * +paraYatir(): double
 * Aylýk faiz miktarý; balance * monthlyInterestRate. monthlyInterestRate = annualInterestRate / 12.  annualInterestRate yüzde olarak verilir.Örneðin, %4.5. Bu deðeri 100’e bölmeniz gerekir.)
 */

public class Hesap {
	private int id;
	private double bakiye;
	private double yillikFaizOrani;
	private Date olusturulduguTarih=new Date();; 
	
	public Hesap() {
	}
	
	public Hesap(int id, double bakiye) {
		this.id=id;
		this.bakiye=bakiye;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setBakiye(double bakiye) {
		this.bakiye=bakiye;
	}
	public void setYillikFaizOrani(double yillikFaizOrani) {
		this.yillikFaizOrani=yillikFaizOrani/100;
	}
	public int getId() {
		return id;
	}
	public double getBakiye() {
		return bakiye;
	}
	public double getYillikFaizOrani() {
		return yillikFaizOrani;
	}
	public String getOlusturulduguTarih() {
		return olusturulduguTarih.toString();
	}
	public double getAylikFaizOrani() {
		return yillikFaizOrani/12;
	}
	public double getAylikFaizMiktari() {
		return bakiye*getAylikFaizOrani();
	}
	public void paraCek(double para) {
		bakiye-=para;
	}
	public void paraYatir(double para) {
		bakiye+=para;
	}
	
	
	
	

}
