/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacar;


public class Arac  {
	
	
	private int arabaMaxKapasite;
	private int gunlukKiraFiyat;
	private String arabaMarka;
	
	public Arac(int arabaMaxKapasite, int gunlukKiraFiyat, String arabaMarka)
	{
		this.arabaMaxKapasite = arabaMaxKapasite;
		this.gunlukKiraFiyat = gunlukKiraFiyat;
		this.arabaMarka=arabaMarka;
	}

	
	public int getArabaMaxKapasite() {
		return arabaMaxKapasite;
	}


	public void setArabaMaxKapasite(int arabaMaxKapasite) {
		this.arabaMaxKapasite = arabaMaxKapasite;
	}


	public int getGunlukKiraFiyat() {
		return gunlukKiraFiyat;
	}


	public void setGunlukKiraFiyat(int gunlukKiraFiyat) {
		this.gunlukKiraFiyat = gunlukKiraFiyat;
	}


	public String getArabaMarka() {
		return arabaMarka;
	}


	public void setArabaMarka(String arabaMarka) {
		this.arabaMarka = arabaMarka;
	}
	
	@Override
	public String toString() {
		return "Araba [arabaMaxKapasite=" + arabaMaxKapasite + ", gunlukKiraFiyat=" + gunlukKiraFiyat + ", arabaMarka="
				+ arabaMarka + "]";
	}

	
}
