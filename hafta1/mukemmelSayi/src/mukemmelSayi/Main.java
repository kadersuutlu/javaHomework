package mukemmelSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Kendinden ba�ka pozitif t�m tam b�lenlerin toplam� say�s� kendisine e�it olan say� m�kemmel say�d�r.
		Scanner bilgi=new Scanner(System.in);
		System.out.println("Birinci say�y� girin: ");
		int sayi=bilgi.nextInt();
		int total=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				total=total+i;
			}
		}
		if(total==sayi) {
			System.out.println("Girdi�iniz say� m�kemmel say�d�r");
		}
		else {
			System.out.println("Girdi�iniz say� m�kemmel say� de�ildir.");
		}

	}

}
