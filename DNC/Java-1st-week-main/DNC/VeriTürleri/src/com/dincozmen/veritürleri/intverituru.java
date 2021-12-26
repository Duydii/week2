package com.dincozmen.veritürleri;
// int 32 bit yer kaplar
public class intverituru {

	public static void main(String[] args) {

		int intSayi = 5;
		// int ondalýklý olmaz
		System.out.println(intSayi);

		/*
		// Wrapper class Integer.MIN_VALUE = -2_147_483_648
		// Wrapper class Integer.MAX_VALUE = 2_147_483_647
		*/
		// basamaklý gösterim _ ile java 7 sonrasýnda geçerli
		int minimumIntDegeri = Integer.MIN_VALUE;
		int maximumIntDegeri = Integer.MAX_VALUE;

		System.out.println("Int minimum deger:" + minimumIntDegeri);
		System.out.println("Int minimum deger:" + maximumIntDegeri);

		//int veri türünün maximum deðerinden fazlasýnýn atanmasý 
		//hataya neden olur ya da tam tersi minimudan az
		//int maximumvalue = 2147483647;
		//int minimumvalue = -2147483648;

		//overflow
		int MaximumDegerdenFazlaOlurMu = maximumIntDegeri +1;
		System.out.println(MaximumDegerdenFazlaOlurMu);
		int MinimumDegerdenAzOlurMu = minimumIntDegeri -1;
		System.out.println(MinimumDegerdenAzOlurMu);
		// kullanacaðýn veri türü ve atayacaðýn 
		//deðer yazýlýmcýnýn sorumluluðunda
	}

}
