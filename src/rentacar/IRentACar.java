/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacar;


public interface IRentACar {
	
	public void arabaEkle(Arac araba);
	public void arabaSil(Arac araba);
	public String arabalariGoster();
	public String arabaAra(int aralik1, int aralik2);
	public int kiralamaIslemi(Arac araba, Musteri musteri, String islemTarihi, int kiralamaGunSayisi);
	public void geriAlimIslemi(Musteri musteri, String islemTarihi);
	public String kiralananlariGor();
	

}
