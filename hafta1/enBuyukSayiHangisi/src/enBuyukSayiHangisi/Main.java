package enBuyukSayiHangisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner bilgi=new Scanner(System.in);
		System.out.println("Birinci sayýyý girin: ");
		int sayi1=bilgi.nextInt();
		
		System.out.println("Ýkinci sayýyý girin: ");
		int sayi2=bilgi.nextInt();
		
		System.out.println("Üçüncü sayýyý girin: ");
		int sayi3=bilgi.nextInt();
		
		if(sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("En büyük sayý: "+sayi1);
		}
		
		else if(sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("En büyük sayý: "+sayi2);
		}
		
		else {
			System.out.println("En büyük sayý: "+sayi3);
		}
		
		
		

	}

}
