package Challenge12;

import java.util.Scanner;

public class HeadsOrTailsGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int win =5;
		Player1 player1 = new Player1();
		Coin coin = new Coin();
		int j=1;
		while(true) {
			System.out.println("Turn "+(j++)+":");
			System.out.println("Press 1 to guess face up!");
			System.out.println("Press 2 to guess face down!");
			coin.flipCoin();
			for (int i=0;i<player1.getPlayer().length;i++) {
				System.out.println("Player "+(i+1)+":");
				int guess = sc.nextInt();
				player1.lostOrGain(coin, i, guess);
				if (player1.getPlayer()[i]==win) {
					System.out.println("--------------------------\nPlayer "+(i+1)+" is a winner.");
					sc.close();
					return;
				}
			}
			System.out.println("--------------------------");
		}
	

	}

}
