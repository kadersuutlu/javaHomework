package arkadasSayilar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Kendileri hari� pozitif tam b�lenleri toplam� biribirine e�it olan say�lar arkada� say�lard�r
		Scanner bilgi=new Scanner(System.in);
		System.out.println("Birinci say�y� girin: ");
		int sayi1=bilgi.nextInt();
		
		System.out.println("�kinci say�y� girin: ");
		int sayi2=bilgi.nextInt();
		
		int total1=0;
		int total2=0;
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				total1=total1+i;
			}
		}
		for(int i=1;i<sayi2;i++) {
			if(sayi2%i==0) {
				total2=total2+i;
			}
		}
		
		if(sayi1==total2 && sayi2==total1) {
			System.out.println("Girdi�iniz say�lar arkada� say�lard�r.");
		}
		else {
			System.out.println("Girdi�iniz say�lar arkada� say�lar de�ildir.");
		}
		
	}

}
