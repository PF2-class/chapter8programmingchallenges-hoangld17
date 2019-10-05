package Challenge11;

public class FirstToOneGame {

	public static void main(String[] args) {
	Die dice = new Die();
	Player player = new Player();
	int j=1;
	while(true) {
		System.out.println("Turn "+(j++)+":");
		for (int i=0; i<player.getPlayer().length;i++) {
			dice.rollDice();
			player.lostOrGain(dice, i);
			if(player.getPlayer()[i]==1) {
				System.out.println("-----------------------\nPlayer "+(i+1)+" is a winner.");
				return;
			}	
		}
		System.out.println("-----------------------");
	}
		
	}

}