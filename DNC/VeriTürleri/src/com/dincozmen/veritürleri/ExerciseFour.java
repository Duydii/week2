package com.dincozmen.verit�rleri;

public class ExerciseFour {

	public static void main(String[] args) {
		// telefon fiyat� hesapla
		/*
		 * double ile hesapla
		 * bir de�i�ken yaz ithal fiyat�n� tut 10000 TL 
		 * bir de�i�ken yaz ve g�mr�k vergisini tut %5 (ithalat fiyat�ndan) 
		 * ithalat fiyat�na g�mr�k vergisini ekleyelim 
		 * bir de�i�ken tut ve KDV miktar�n� tutsun %10 (ithalat fiyat�ndan)
		 * telefonun son fiyat�na KDV ekle 
		 * bir de�i�ken tut ve kar pay�n� %20 (ithalat fiyat�ndan) olarak tutsun 
		 * indirim oran� %15 (ithalat fiyat�ndan) 
		 * Telefonun son fiyat�n� hesaplayal�m
		 */
		//double ithalFiyat =10000D; bu �ekilde de yaz�labilir fark yok
			double ithalFiyat =10000;
			double telefonFiyat� = 0;
			double gumrukVergisi = ithalFiyat*0.05;
			
			telefonFiyat� = ithalFiyat+gumrukVergisi;
			
			double kDV= ithalFiyat*10.0/100;
			
			telefonFiyat� = telefonFiyat�+kDV;
			
			double karPay� = ithalFiyat*20/100;
			
			telefonFiyat� = telefonFiyat�+karPay�;
			
			double indirimNiktari = ithalFiyat*15d/100;
			

			telefonFiyat� = telefonFiyat�-indirimNiktari;
			
			System.out.println("Sat�� Fiyat�: " + telefonFiyat�);
		
			// telefon fiyat� hesapla
			/*
			 * double ile hesapla
			 * bir de�i�ken yaz ithal fiyat�n� tut 10000 TL 
			 * bir de�i�ken yaz ve g�mr�k vergisini tut %5 (telefon son fiyat�ndan) 
			 * ithalat fiyat�na g�mr�k vergisini ekleyelim 
			 * bir de�i�ken tut ve KDV miktar�n� tutsun %10 (telefon son fiyat�ndan)
			 * telefonun son fiyat�na KDV ekle 
			 * bir de�i�ken tut ve kar pay�n� %20 (telefon son fiyat�ndan) olarak tutsun 
			 * indirim oran� %15 (telefon son fiyat�ndan) 
			 * Telefonun son fiyat�n� hesaplayal�m
			 */
			
			double ithalFiyat1 =10000;
			
			double gumrukVergisi1 = ithalFiyat1*0.05;
			
			ithalFiyat1 = ithalFiyat1+gumrukVergisi1;
			
			double kDV1= ithalFiyat1*10.0/100;
			
			ithalFiyat1 = ithalFiyat1+kDV1;
			
			double karPay�1 = ithalFiyat1*20/100;
			
			ithalFiyat1 = ithalFiyat1+karPay�1;
			
			double indirimNiktari1 = ithalFiyat1*15d/100;
			

			ithalFiyat1 = ithalFiyat1-indirimNiktari1;
			
			System.out.println("Birle�ik Sat�� Fiyat�: " + ithalFiyat1);
		
			
	}

}
