package kalinSesliMiInceSesliMi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner bilgi=new Scanner(System.in);
		System.out.println("Bir harf giriniz: ");
		char harf=bilgi.next().charAt(0);
		switch (harf) {
		case 'a':
		case 'e':
		case 'o':
		case 'u':
			System.out.println("Girdiðiniz harf kalýn sesli.");
			break;
		default:
			System.out.println("Girdiðiniz harf ince sesli.");
			
		}

	}

}
