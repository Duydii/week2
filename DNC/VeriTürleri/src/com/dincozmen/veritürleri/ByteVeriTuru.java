package com.dincozmen.verit�rleri;

/*
 * 1 byte 8 bit i�erir. 
 */
public class ByteVeriTuru {

	public static void main(String[] args) {

		byte byteSayi = 3;
		System.out.println(byteSayi);

		// wrapper class kullan�m�
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
	
		//kullan�c�n�n veri t�r� ve atayaca��n de�er sizin sorumlulu�unuzda
	}

}
