package com.dincozmen.veritürleri;

public class FloatDoublePrecision {

	public static void main(String[] args) {

		int intPI = 22/7;
		float floatPI = 22f/7;
		double doublePI = 22d/7;
		// 	double doublePI = 22.0/7; da kullanýlabilir

		
		System.out.println("intpi: " + intPI);
		System.out.println("floatpi: " + floatPI);
		System.out.println("doublepi: " + doublePI);
	
		
		// Örnek pound aðýrlýk birimini kg a çevir
		// bir deðiþken oluþtur ve uygun bir pound biriminde deðer ata
		// deðiþkeni kg a dönüþtür
		// yazdýr
		// 1 pound = 0,435349237 kg
	
		int pound = 100;
		
		double poundToKg = 0.435349237;
		
		double result = pound*poundToKg;
				
		System.out.println(result);
		
		
		
	}

}
