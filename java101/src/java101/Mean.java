package java101;

import java.util.Scanner;

public class Mean {

	public static void main(String[] args) {
		
		int mat,fizik,kimya,biyoloji,edebiyat,müzik;
		int mean;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Mat notu: ");
		mat=scan.nextInt();
		System.out.println("Fizik notu: ");
		fizik=scan.nextInt();
		System.out.println("Kimya notu: ");
		kimya=scan.nextInt();
		System.out.println("Biyoloji notu: ");
		biyoloji=scan.nextInt();
		System.out.println("Edebiyat notu");
		edebiyat=scan.nextInt();
		System.out.println("Muzik notu: ");
		müzik=scan.nextInt();
		
		mean=(mat+fizik+kimya+biyoloji+edebiyat+müzik)/6;
		
		System.out.println("Ortalama: " + mean + "\n" );
		System.out.println(mean>=60 ? "Sinifi Gecti" : "Sinifta Kaldi");
		
		
		
		
		
		
		
		

	}

}
