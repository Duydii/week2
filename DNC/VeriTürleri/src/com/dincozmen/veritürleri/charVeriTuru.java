package com.dincozmen.verit�rleri;

public class charVeriTuru {

	
	// char 16 bit b�y�kl���nde de�er saklar
	//uluslaras� standart olan unicode tablosu i�erisindeki t�m karakterleri i�erir.
	// unidoce tablosunda 65535 adet de�er vard�r. Bu y�zden 8 bit de�il 16 bittir.
	// https://unicode-table.com/en/
	
	
	public static void main(String[] args) {

		String mesaj = "Char Say�sal De�er: ";
		char charDegeri = 'A';
		System.out.println("Char De�er: " + charDegeri);
		System.out.println(mesaj + (int)charDegeri);
		
		int charSayisalDegeri = charDegeri+1;
		charDegeri = (char)charSayisalDegeri;
		System.out.println("Char De�eri: " + charDegeri);
		System.out.println("Char Say�sal De�er: " + charSayisalDegeri);
		
		charDegeri = '\u0041';
		System.out.println("Char De�er: " + charDegeri);
		System.out.println("Char Say�sal De�er: " + (int)charDegeri);
		
	}

}
