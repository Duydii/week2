package com.dincozmen.veritürleri;

public class charVeriTuru {

	
	// char 16 bit büyüklüðünde deðer saklar
	//uluslarasý standart olan unicode tablosu içerisindeki tüm karakterleri içerir.
	// unidoce tablosunda 65535 adet deðer vardýr. Bu yüzden 8 bit deðil 16 bittir.
	// https://unicode-table.com/en/
	
	
	public static void main(String[] args) {

		String mesaj = "Char Sayýsal Deðer: ";
		char charDegeri = 'A';
		System.out.println("Char Deðer: " + charDegeri);
		System.out.println(mesaj + (int)charDegeri);
		
		int charSayisalDegeri = charDegeri+1;
		charDegeri = (char)charSayisalDegeri;
		System.out.println("Char Deðeri: " + charDegeri);
		System.out.println("Char Sayýsal Deðer: " + charSayisalDegeri);
		
		charDegeri = '\u0041';
		System.out.println("Char Deðer: " + charDegeri);
		System.out.println("Char Sayýsal Deðer: " + (int)charDegeri);
		
	}

}
