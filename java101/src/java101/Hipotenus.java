package java101;

import java.util.Scanner;

public class Hipotenus {

	public static void main(String[] args) {
		
		int kenar1,kenar2;
		double hipotenus,cevre,alan;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Kenar1: ");
		kenar1=scan.nextInt();
		System.out.println("Kenar2: ");
		kenar2=scan.nextInt();
		
		hipotenus=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
		System.out.println("Hipotenus: "+hipotenus);

		cevre=2*((kenar1+kenar2+hipotenus)/2);

		alan=Math.sqrt(cevre*(cevre-kenar1)*(cevre-kenar2)*(cevre-hipotenus));
		System.out.println("Cevre: "+cevre);
		System.out.println("Alan: "+alan);
	}

}
