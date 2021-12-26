package com.dincozmen.verit�rleri;


public class LongVeri {

	public static void main(String[] args) {
		
		// de�erin sonuna l ya da L yaz�ld���nda long olarak �al���r
		long longVeri = 12481;
		System.out.println(longVeri);
		
		// wrapper class kullan�m�
		//long maximumLongDegeri = Long.MAX_VALUE;
		//long minimumLongDegeri = Long.MIN_VALUE;

		long maximumLongDegeri = 9223372036854775807L;
		long minimumLongDegeri = -9223372036854775808L;

		System.out.println("maximum long degeri:" + maximumLongDegeri);
		System.out.println("minimum long degeri:" + minimumLongDegeri);
		
		Long overflow = maximumLongDegeri +1;
		System.out.println("overflow kontrol�:" + overflow);
	}

}
