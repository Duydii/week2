package com.dincozmen.veritürleri;

public class ExerciseOne {

	public static void main(String[] args) {
		// Boyunuzu console 'a yazdýrýn cm olarak
		
		int boyi = 174;
		
		System.out.println("Dinç'in Boyu:" + boyi + " " + "cm");
		System.out.println("Dinç'in Boyu:" + 174 + " " + "cm");
		System.out.println("Dinç'in Boyu:" + "174" + " " + "cm");
		
		// Boyunuzu tuttðunuz bir short,int,long türünde deðiþken tanýmlayýn
		
		//5 deðerinin atayacaðýnýz deðiþken tanýmlayýn ve boyunuzdaki 
		// kýsalma miktarýný belirterek bir isim verin. Ýsimlendirme 
		//iki kelime içersin.
		// mevcut boyunuzdan kýsalma miktarýný çýkartýn
		// boyunuzun son halini yazdýrýn
		// ayakkabý tpuk boyu bir deðiþkende tutun
		//toplam boyunuza ekleyin
		
		short boy = 174;
		
		
		byte boyKýsalma = 5;
		// int yetmiþYaþýndakiBoy = boy - boyKýsalma
		
		
		System.out.println("70 yaþýndaki boyum:" + (boy-boyKýsalma) + " " + "cm");
		
		int topukBoy = 3;
		
		int boyArtýþý = boy + topukBoy;
		
		System.out.println("Topuklu Boy:" + boyArtýþý + " " + "cm");
		
		int yetmisYasindakiBoy = boy - boyKýsalma;
		System.out.println("Yetmiþ Yaþýndaki Boyum:" + yetmisYasindakiBoy);
		
		yetmisYasindakiBoy = yetmisYasindakiBoy + topukBoy;
		System.out.println("topuklu Boy" + yetmisYasindakiBoy);
						
				
		
	}

}
