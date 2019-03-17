/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacar;


public class Musteri extends Kullanici {
	
	private String ehliyetNo;
	
	public Musteri(String adSoyad, String ehliyetNo)
	{
		super(adSoyad);
		this.ehliyetNo = ehliyetNo;
	}
	
	public String getEhliyetNo() {
		return ehliyetNo;
	}

	public void setEhliyetNo(String ehliyetNo) {
		this.ehliyetNo = ehliyetNo;
	}

	public String kendiniTanit() {
		return "Kullanici Bilgileri: \n Ad-Soyad: " + this.getAdSoyad() + "\nEhliyet Numarasi:" + this.ehliyetNo + "]";
	}
        @Override
	public String toString() {
		return this.getAdSoyad();
	}
	
}