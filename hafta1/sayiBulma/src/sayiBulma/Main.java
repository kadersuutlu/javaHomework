package sayiBulma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] myList= {1,3,4,6,7,9,0};
		Scanner bilgi=new Scanner(System.in);
		System.out.println("Aramak istedi�iniz rakam� girin: ");
		int aranacakSayi=bilgi.nextInt();
		boolean sayiVarMi=false;
		for(int sayi:myList) {
			if(sayi==aranacakSayi) {
				sayiVarMi=true;
				break;
			}
		}
		if(sayiVarMi) {
			System.out.println("Arad���n�z say� mevcut.");
		}
		else {
			System.out.println("Arad���n�z say� bulunamad�.");
		}

	}

}
