package com.dincozmen.verit�rleri;

public class ExerciseOne {

	public static void main(String[] args) {
		// Boyunuzu console 'a yazd�r�n cm olarak
		
		int boyi = 174;
		
		System.out.println("Din�'in Boyu:" + boyi + " " + "cm");
		System.out.println("Din�'in Boyu:" + 174 + " " + "cm");
		System.out.println("Din�'in Boyu:" + "174" + " " + "cm");
		
		// Boyunuzu tutt�unuz bir short,int,long t�r�nde de�i�ken tan�mlay�n
		
		//5 de�erinin atayaca��n�z de�i�ken tan�mlay�n ve boyunuzdaki 
		// k�salma miktar�n� belirterek bir isim verin. �simlendirme 
		//iki kelime i�ersin.
		// mevcut boyunuzdan k�salma miktar�n� ��kart�n
		// boyunuzun son halini yazd�r�n
		// ayakkab� tpuk boyu bir de�i�kende tutun
		//toplam boyunuza ekleyin
		
		short boy = 174;
		
		
		byte boyK�salma = 5;
		// int yetmi�Ya��ndakiBoy = boy - boyK�salma
		
		
		System.out.println("70 ya��ndaki boyum:" + (boy-boyK�salma) + " " + "cm");
		
		int topukBoy = 3;
		
		int boyArt��� = boy + topukBoy;
		
		System.out.println("Topuklu Boy:" + boyArt��� + " " + "cm");
		
		int yetmisYasindakiBoy = boy - boyK�salma;
		System.out.println("Yetmi� Ya��ndaki Boyum:" + yetmisYasindakiBoy);
		
		yetmisYasindakiBoy = yetmisYasindakiBoy + topukBoy;
		System.out.println("topuklu Boy" + yetmisYasindakiBoy);
						
				
		
	}

}
