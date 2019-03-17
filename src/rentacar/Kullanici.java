/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacar;


public abstract class Kullanici {
	
    private String adSoyad;

    public Kullanici(String adSoyad) {
    	this.adSoyad = adSoyad;
    }

    public String getAdSoyad() {
	return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
	
    public abstract String kendiniTanit();

}

