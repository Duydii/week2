package com.dincozmen.veritürleri;

public class ExerciseFour {

	public static void main(String[] args) {
		// telefon fiyatý hesapla
		/*
		 * double ile hesapla
		 * bir deðiþken yaz ithal fiyatýný tut 10000 TL 
		 * bir deðiþken yaz ve gümrük vergisini tut %5 (ithalat fiyatýndan) 
		 * ithalat fiyatýna gümrük vergisini ekleyelim 
		 * bir deðiþken tut ve KDV miktarýný tutsun %10 (ithalat fiyatýndan)
		 * telefonun son fiyatýna KDV ekle 
		 * bir deðiþken tut ve kar payýný %20 (ithalat fiyatýndan) olarak tutsun 
		 * indirim oraný %15 (ithalat fiyatýndan) 
		 * Telefonun son fiyatýný hesaplayalým
		 */
		//double ithalFiyat =10000D; bu þekilde de yazýlabilir fark yok
			double ithalFiyat =10000;
			double telefonFiyatý = 0;
			double gumrukVergisi = ithalFiyat*0.05;
			
			telefonFiyatý = ithalFiyat+gumrukVergisi;
			
			double kDV= ithalFiyat*10.0/100;
			
			telefonFiyatý = telefonFiyatý+kDV;
			
			double karPayý = ithalFiyat*20/100;
			
			telefonFiyatý = telefonFiyatý+karPayý;
			
			double indirimNiktari = ithalFiyat*15d/100;
			

			telefonFiyatý = telefonFiyatý-indirimNiktari;
			
			System.out.println("Satýþ Fiyatý: " + telefonFiyatý);
		
			// telefon fiyatý hesapla
			/*
			 * double ile hesapla
			 * bir deðiþken yaz ithal fiyatýný tut 10000 TL 
			 * bir deðiþken yaz ve gümrük vergisini tut %5 (telefon son fiyatýndan) 
			 * ithalat fiyatýna gümrük vergisini ekleyelim 
			 * bir deðiþken tut ve KDV miktarýný tutsun %10 (telefon son fiyatýndan)
			 * telefonun son fiyatýna KDV ekle 
			 * bir deðiþken tut ve kar payýný %20 (telefon son fiyatýndan) olarak tutsun 
			 * indirim oraný %15 (telefon son fiyatýndan) 
			 * Telefonun son fiyatýný hesaplayalým
			 */
			
			double ithalFiyat1 =10000;
			
			double gumrukVergisi1 = ithalFiyat1*0.05;
			
			ithalFiyat1 = ithalFiyat1+gumrukVergisi1;
			
			double kDV1= ithalFiyat1*10.0/100;
			
			ithalFiyat1 = ithalFiyat1+kDV1;
			
			double karPayý1 = ithalFiyat1*20/100;
			
			ithalFiyat1 = ithalFiyat1+karPayý1;
			
			double indirimNiktari1 = ithalFiyat1*15d/100;
			

			ithalFiyat1 = ithalFiyat1-indirimNiktari1;
			
			System.out.println("Birleþik Satýþ Fiyatý: " + ithalFiyat1);
		
			
	}

}
