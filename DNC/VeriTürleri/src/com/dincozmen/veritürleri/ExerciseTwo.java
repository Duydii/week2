package com.dincozmen.veritürleri;

public class ExerciseTwo {

	public static void main(String[] args) {
		// telefon fiyatý hesapla
		/*
		 * bir deðiþken yaz ithal fiyatýný tut
		 * bir deðiþken yaz ve gümrük vergisini tut 500 TL
		 * ithalat fiyatýna gümrük vergisini ekleyelim
		 * bir deðiþken tut ve KDV miktarýný tutsun 2000 TL
		 * telefonun son fiyatýna KDV ekle
		 * bir deðiþken tut ve kar payýný 1000 TL olarak tutsun
		 * Telefonun son fiyatýný hesaplayalým
		 */
	
	int ithalatTelefonFiyatý = 10000;
	System.out.println("Telefon Ýthalat Fiyatý:" + ithalatTelefonFiyatý);
	
	int gumrukVergisi = 500;
	
	int ithalatGumrukToplamý = ithalatTelefonFiyatý + gumrukVergisi;
	
	int kdvMiktarý = 2000;
	
	int sonfiyat = ithalatGumrukToplamý + kdvMiktarý;
	
	int karPayý = 1000;
	
	int satisFiyatý = sonfiyat + karPayý;
	
	System.out.println("Telefon Satýþ Fiyatý: " + satisFiyatý + " TL");
	
	int telefonFiyatý = 10000;
	int gumrukVergisii = 500;
	int kDV = 2000;
	int karPayyi = 1000;
	
	telefonFiyatý = telefonFiyatý + gumrukVergisii + kDV + karPayyi;
	
	System.out.println("Tel Satýþ:" + telefonFiyatý);
			
	
	
	}

}
