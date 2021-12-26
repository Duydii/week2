package com.dincozmen.veritürleri;
// float 32 bit alan kaplar
public class FloatVeriTuru {

	public static void main(String[] args) {
		/*
		 * float ile ondalýklý sayýlar tutulur
		 */
		
		float floatVeri = 1.3f;
		
		System.out.println("Deðeri Gör:" + floatVeri);
	
		
		
		float minimumFloatDegeri = Float.MIN_VALUE;
		float maximumFloatDegeri = Float.MAX_VALUE;
		
		System.out.println("Minimum Float Deðeri:" + minimumFloatDegeri);
		System.out.println("Maximum Float Deðeri:" + maximumFloatDegeri);
		
		
		// hangi veri türünü kullanacaðý sizin kontrolünüzde
		// altaki durumlara casting denilir. Casting de veri kaybý yaþanýr
		
		float test = (float)2.0/3;
		System.out.println(test);
	
		float testÝki = 2/3f;
		System.out.println(testÝki);
		
		float testUc = 22/7f;
		System.out.println(testUc);
	}

}
