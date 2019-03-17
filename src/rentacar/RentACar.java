/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentacar;

/**
 *
 * @author furka
 */
import java.util.ArrayList;
import java.util.List;

public class RentACar implements IRentACar {
	
	public List<Arac> kiralanabilirAraclar;
	public List<Kiralama> kiralamalar;
        private List<Musteri> musteriler;

	public RentACar()
	{
		this.kiralanabilirAraclar = new ArrayList<>();
		this.kiralamalar = new ArrayList<>();
                this.musteriler = new ArrayList<>();
	}
	
	public void arabaEkle(Arac araba){
		
		kiralanabilirAraclar.add(araba);
	}
	
	@Override
	public void arabaSil(Arac araba) {
		
		kiralanabilirAraclar.remove(araba);
	}
	public int arabaSayisi() {
		
		return kiralanabilirAraclar.size();
	}
	@Override
	public String arabalariGoster()
	{
		String output = "";
		
		for(int i=0;i<kiralanabilirAraclar.size();i++)
		{
			output += kiralanabilirAraclar.get(i) + "\n";
		}
		
		return output;
	}
	public String arabaAra(int aralik1, int aralik2)
	{
        String output = "";
        
        for(int i=0;i<kiralanabilirAraclar.size();i++)
		{
			if(kiralanabilirAraclar.get(i).getGunlukKiraFiyat() >= aralik1 && kiralanabilirAraclar.get(i).getGunlukKiraFiyat() <= aralik2)
			output += kiralanabilirAraclar.get(i) + "\n";
		}
		return output;
	}
	public int kiralamaIslemi(Arac araba, Musteri musteri, String islemTarihi, int kiralamaGunSayisi)
	{	
		kiralamalar.add(new Kiralama(araba,musteri,islemTarihi,kiralamaGunSayisi));
		kiralanabilirAraclar.remove(araba);
		
		return kiralamaGunSayisi*araba.getGunlukKiraFiyat();
	}
	
	public void geriAlimIslemi(Musteri musteri, String islemTarihi)
	{
		Kiralama k = null;
		
		for(int i=0;i<kiralamalar.size();i++)
		{
			if(kiralamalar.get(i).getIslemTarihi().equals(islemTarihi))
				k = kiralamalar.get(i);
		}
		kiralanabilirAraclar.add(k.getAraba());
		kiralamalar.remove(k);
	}
        @Override
	public String kiralananlariGor()
	{
		String output = "";
		
		for(int i=0;i<kiralamalar.size();i++)
		{
                    output += "------ " + (i+1) + ". Kiralama Bilgisi ------\n";
                    output += "Müşteri Adı: " + kiralamalar.get(i).getMusteri().getAdSoyad() + "\n" + 
                            "Araç Marka: " + kiralamalar.get(i).getAraba().getArabaMarka() + "\n" + 
                            "İşlem Tarihi: " + kiralamalar.get(i).getIslemTarihi() + "\n" + 
                            "Kiralama Gün Sayısı: " + kiralamalar.get(i).getKiralamaGunSayisi() + "\n\n";
		}
		return output;
	}
        public ArrayList<Kiralama> kiralananlariGor(String eNo)
	{
            ArrayList<Kiralama> k = new ArrayList<>();
            for(int i=0;i<kiralamalar.size();i++)
            {
                if( kiralamalar.get(i).getMusteri().getEhliyetNo().equals(eNo) )
                {
                    k.add(kiralamalar.get(i));
                }
            }
            return k;
	}
        public void addMusteri(Musteri m){
            musteriler.add(m);
        }
        public Musteri getMusteri(String ehliyetNo)
        {
            for(int i=0;i<musteriler.size();i++)
            {
                if(musteriler.get(i).getEhliyetNo().equals(ehliyetNo))
                {
                    return musteriler.get(i);
                }
            }
            return null;
        }
}
