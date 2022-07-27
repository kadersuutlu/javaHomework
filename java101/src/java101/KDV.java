package java101;

import java.util.Scanner;

public class KDV {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
		
		double tutar,KDVorani,KDVli,KDVsiz;
		System.out.println("Tutar : ");
		tutar=scan.nextDouble();
		
		if(tutar>0 && tutar<1000) {
			KDVorani=0.18;
			KDVli=tutar+KDVorani;
			KDVsiz=tutar+KDVli;
			System.out.println("KDV'siz Fiyat : "+tutar);
			System.out.println("KDV'li Fiyat : "+KDVli);
			System.out.println("KDV Tutarı : "+KDVorani);
		}
		else if(tutar>=1000){
			KDVorani=0.8;
			KDVli=tutar+KDVorani;
			KDVsiz=tutar+KDVli;
			System.out.println("KDV'siz Fiyat : "+tutar);
			System.out.println("KDV'li Fiyat : "+KDVli);
			System.out.println("KDV Tutari : "+KDVorani);
		}

	}

}
