package enBuyukSayiHangisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner bilgi=new Scanner(System.in);
		System.out.println("Birinci say�y� girin: ");
		int sayi1=bilgi.nextInt();
		
		System.out.println("�kinci say�y� girin: ");
		int sayi2=bilgi.nextInt();
		
		System.out.println("���nc� say�y� girin: ");
		int sayi3=bilgi.nextInt();
		
		if(sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("En b�y�k say�: "+sayi1);
		}
		
		else if(sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("En b�y�k say�: "+sayi2);
		}
		
		else {
			System.out.println("En b�y�k say�: "+sayi3);
		}
		
		
		

	}

}
