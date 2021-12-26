package com.dincozmen.veritürleri;

/*
 * 1 byte 8 bit içerir. 
 */
public class ByteVeriTuru {

	public static void main(String[] args) {

		byte byteSayi = 3;
		System.out.println(byteSayi);

		// wrapper class kullanýmý
		// byte maximumByteDegeri = Byte.MAX_VALUE;
		// byte minimumByteDegeri = Byte.MIN_VALUE;

		byte maximumByteDegeri = 127;
		byte minimumByteDegeri = -128;

		System.out.println("maximum byte degeri:" + maximumByteDegeri);
		System.out.println("minimum byte degeri:" + minimumByteDegeri);

		//overflow
		byte MaximumDegerdenFazlaOlurMu = (byte)(maximumByteDegeri +1);
		System.out.println(MaximumDegerdenFazlaOlurMu);
		byte MinimumDegerdenAzOlurMu = (byte)(minimumByteDegeri -1);
		System.out.println(MinimumDegerdenAzOlurMu);
	
		//kullanýcýnýn veri türü ve atayacaðýn deðer sizin sorumluluðunuzda
	}

}
