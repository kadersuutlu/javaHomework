package mukemmelSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Kendinden baþka pozitif tüm tam bölenlerin toplamý sayýsý kendisine eþit olan sayý mükemmel sayýdýr.
		Scanner bilgi=new Scanner(System.in);
		System.out.println("Birinci sayýyý girin: ");
		int sayi=bilgi.nextInt();
		int total=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				total=total+i;
			}
		}
		if(total==sayi) {
			System.out.println("Girdiðiniz sayý mükemmel sayýdýr");
		}
		else {
			System.out.println("Girdiðiniz sayý mükemmel sayý deðildir.");
		}

	}

}
