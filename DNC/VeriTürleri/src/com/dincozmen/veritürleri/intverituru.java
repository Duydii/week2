package com.dincozmen.verit�rleri;
// int 32 bit yer kaplar
public class intverituru {

	public static void main(String[] args) {

		int intSayi = 5;
		// int ondal�kl� olmaz
		System.out.println(intSayi);

		/*
		// Wrapper class Integer.MIN_VALUE = -2_147_483_648
		// Wrapper class Integer.MAX_VALUE = 2_147_483_647
		*/
		// basamakl� g�sterim _ ile java 7 sonras�nda ge�erli
		int minimumIntDegeri = Integer.MIN_VALUE;
		int maximumIntDegeri = Integer.MAX_VALUE;

		System.out.println("Int minimum deger:" + minimumIntDegeri);
		System.out.println("Int minimum deger:" + maximumIntDegeri);

		//int veri t�r�n�n maximum de�erinden fazlas�n�n atanmas� 
		//hataya neden olur ya da tam tersi minimudan az
		//int maximumvalue = 2147483647;
		//int minimumvalue = -2147483648;

		//overflow
		int MaximumDegerdenFazlaOlurMu = maximumIntDegeri +1;
		System.out.println(MaximumDegerdenFazlaOlurMu);
		int MinimumDegerdenAzOlurMu = minimumIntDegeri -1;
		System.out.println(MinimumDegerdenAzOlurMu);
		// kullanaca��n veri t�r� ve atayaca��n 
		//de�er yaz�l�mc�n�n sorumlulu�unda
	}

}
