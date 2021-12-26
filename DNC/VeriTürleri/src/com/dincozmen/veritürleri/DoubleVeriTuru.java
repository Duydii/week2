package com.dincozmen.veritürleri;

public class DoubleVeriTuru {

	public static void main(String[] args) {

		/*
		 * double ile ondalýklý sayýlar tutulur
		 */
		// 64 bit için
		// double precision (doðru sonuca yakýnlýk) 
		double doubleSayi1 = 1;
		double doubleSayi2 = 1.0;
		double doubleSayi3 = 1.00;
		double doubleSayi = 1.0d;
		
		System.out.println("1Deðeri Gör:" + doubleSayi1);
		System.out.println("2Deðeri Gör:" + doubleSayi2);
		System.out.println("3Deðeri Gör:" + doubleSayi3);		
		System.out.println("Deðeri Gör:" + doubleSayi);
		
		double minimumDoubleDegeri = Double.MIN_VALUE;
		double maximumDoubleDegeri = Double.MAX_VALUE;
		
		System.out.println("Minimum Double Deðeri:" + minimumDoubleDegeri);
		System.out.println("Maximum Double Deðeri:" + maximumDoubleDegeri);
		
		
		// hangi veri türünü kullanacaðý sizin kontrolünüzde
		
		
	}

}
