package com.dincozmen.verit�rleri;

public class FloatDoublePrecision {

	public static void main(String[] args) {

		int intPI = 22/7;
		float floatPI = 22f/7;
		double doublePI = 22d/7;
		// 	double doublePI = 22.0/7; da kullan�labilir

		
		System.out.println("intpi: " + intPI);
		System.out.println("floatpi: " + floatPI);
		System.out.println("doublepi: " + doublePI);
	
		
		// �rnek pound a��rl�k birimini kg a �evir
		// bir de�i�ken olu�tur ve uygun bir pound biriminde de�er ata
		// de�i�keni kg a d�n��t�r
		// yazd�r
		// 1 pound = 0,435349237 kg
	
		int pound = 100;
		
		double poundToKg = 0.435349237;
		
		double result = pound*poundToKg;
				
		System.out.println(result);
		
		
		
	}

}
