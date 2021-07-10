package sayiAsalMi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner bilgi=new Scanner(System.in);
		System.out.println("Sayýyý giriniz: ");
		int sayi=bilgi.nextInt();
		if(sayi<2) {
			System.out.println("Geçersiz sayý girdiniz.");
		}
		else {
			int a=0;
			for(int i=1;i<=sayi;i++) {
				if(sayi%i==0) {
					a++;
				}
			}
			if(a==2) {
				System.out.println("Girdiðiniz sayý asaldýr.");
			}
			else {
				System.out.println("Girdiðiniz sayý asal deðildir.");
			}
		}
		

	}

}
