/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacar;


public class Admin extends Kullanici {
	
	private String iseGirisTarihi;
	private String unvan;
	
	public Admin(String adSoyad, String iseGirisTarihi, String unvan) {
		super(adSoyad);
		this.iseGirisTarihi = iseGirisTarihi;
		this.unvan = unvan;
	}
	public String getIseGirisTarihi() {
		return iseGirisTarihi;
	}
	public void setIseGirisTarihi(String iseGirisTarihi) {
		this.iseGirisTarihi = iseGirisTarihi;
	}
	public String getUnvan() {
		return unvan;
	}
	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	public String kendiniTanit() {
		
		return "Kullanici Bilgileri: \n Ad-Soyad: " + this.getAdSoyad() + "\niseGirisTarihi:" + this.iseGirisTarihi + "]";
	}
}
