package com.dincozmen.verit�rleri;

public class ExerciseTwo {

	public static void main(String[] args) {
		// telefon fiyat� hesapla
		/*
		 * bir de�i�ken yaz ithal fiyat�n� tut
		 * bir de�i�ken yaz ve g�mr�k vergisini tut 500 TL
		 * ithalat fiyat�na g�mr�k vergisini ekleyelim
		 * bir de�i�ken tut ve KDV miktar�n� tutsun 2000 TL
		 * telefonun son fiyat�na KDV ekle
		 * bir de�i�ken tut ve kar pay�n� 1000 TL olarak tutsun
		 * Telefonun son fiyat�n� hesaplayal�m
		 */
	
	int ithalatTelefonFiyat� = 10000;
	System.out.println("Telefon �thalat Fiyat�:" + ithalatTelefonFiyat�);
	
	int gumrukVergisi = 500;
	
	int ithalatGumrukToplam� = ithalatTelefonFiyat� + gumrukVergisi;
	
	int kdvMiktar� = 2000;
	
	int sonfiyat = ithalatGumrukToplam� + kdvMiktar�;
	
	int karPay� = 1000;
	
	int satisFiyat� = sonfiyat + karPay�;
	
	System.out.println("Telefon Sat�� Fiyat�: " + satisFiyat� + " TL");
	
	int telefonFiyat� = 10000;
	int gumrukVergisii = 500;
	int kDV = 2000;
	int karPayyi = 1000;
	
	telefonFiyat� = telefonFiyat� + gumrukVergisii + kDV + karPayyi;
	
	System.out.println("Tel Sat��:" + telefonFiyat�);
			
	
	
	}

}
