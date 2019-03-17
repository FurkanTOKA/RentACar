/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacar;


public class Kiralama {
	
	private Arac araba;
	private Musteri musteri;
	private String islemTarihi;
	private int kiralamaGunSayisi;
	
	public Kiralama(Arac araba, Musteri musteri, String islemTarihi, int kiralamaGunSayisi) {
		this.araba = araba;
		this.musteri = musteri;
		this.islemTarihi = islemTarihi;
		this.kiralamaGunSayisi = kiralamaGunSayisi;
	}

	public Arac getAraba() {
		return araba;
	}

	public void setAraba(Arac araba) {
		this.araba = araba;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public String getIslemTarihi() {
		return islemTarihi;
	}

	public void setIslemTarihi(String islemTarihi) {
		this.islemTarihi = islemTarihi;
	}

	public int getKiralamaGunSayisi() {
		return kiralamaGunSayisi;
	}

	public void setKiralamaGunSayisi(int kiralamaGunSayisi) {
		this.kiralamaGunSayisi = kiralamaGunSayisi;
	}
	@Override
	public String toString() {
		return "Araç Marka: " + araba.getArabaMarka() + "-- Müşteri: " + musteri + "-- Tarih: " + islemTarihi
				+ "-- Gün: " + kiralamaGunSayisi;
	}	
}
