package com.dincozmen.veritürleri;


public class LongVeri {

	public static void main(String[] args) {
		
		// deðerin sonuna l ya da L yazýldýðýnda long olarak çalýþýr
		long longVeri = 12481;
		System.out.println(longVeri);
		
		// wrapper class kullanýmý
		//long maximumLongDegeri = Long.MAX_VALUE;
		//long minimumLongDegeri = Long.MIN_VALUE;

		long maximumLongDegeri = 9223372036854775807L;
		long minimumLongDegeri = -9223372036854775808L;

		System.out.println("maximum long degeri:" + maximumLongDegeri);
		System.out.println("minimum long degeri:" + minimumLongDegeri);
		
		Long overflow = maximumLongDegeri +1;
		System.out.println("overflow kontrolü:" + overflow);
	}

}
