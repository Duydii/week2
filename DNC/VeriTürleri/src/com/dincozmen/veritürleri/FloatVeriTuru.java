package com.dincozmen.verit�rleri;
// float 32 bit alan kaplar
public class FloatVeriTuru {

	public static void main(String[] args) {
		/*
		 * float ile ondal�kl� say�lar tutulur
		 */
		
		float floatVeri = 1.3f;
		
		System.out.println("De�eri G�r:" + floatVeri);
	
		
		
		float minimumFloatDegeri = Float.MIN_VALUE;
		float maximumFloatDegeri = Float.MAX_VALUE;
		
		System.out.println("Minimum Float De�eri:" + minimumFloatDegeri);
		System.out.println("Maximum Float De�eri:" + maximumFloatDegeri);
		
		
		// hangi veri t�r�n� kullanaca�� sizin kontrol�n�zde
		// altaki durumlara casting denilir. Casting de veri kayb� ya�an�r
		
		float test = (float)2.0/3;
		System.out.println(test);
	
		float test�ki = 2/3f;
		System.out.println(test�ki);
		
		float testUc = 22/7f;
		System.out.println(testUc);
	}

}
