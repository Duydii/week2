package com.dincozmen.veritürleri;
/*
 * short 16 bit büyüklüðündedir
 */
public class ShortVeriTuru {

	public static void main(String[] args) {

		short shortSayi = 48;
		System.out.println(shortSayi);
		
		// wrapper class kullanýmý
		// short maximumShortDegeri = Short.MAX_VALUE;
		// short minimumShortDegeri = Short.MIN_VALUE;

		short maximumShortDegeri = 32767;
		short minimumShortDegeri = -32768;

		System.out.println("maximum short degeri:" + maximumShortDegeri);
		System.out.println("minimum short degeri:" + minimumShortDegeri);

		//overflow
		short MaximumDegerdenFazlaOlurMu = (short)(maximumShortDegeri +1);
		System.out.println(MaximumDegerdenFazlaOlurMu);
		short MinimumDegerdenAzOlurMu = (short)(minimumShortDegeri -1);
		System.out.println(MinimumDegerdenAzOlurMu);
	
		
		//kullanýcýnýn veri türü ve atayacaðýn deðer sizin sorumluluðu
	}

}
