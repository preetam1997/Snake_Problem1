
public class Welcome{
	
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE = 3;
	
	public static void main(String[] args) {
        	System.out.println("Welcome to Snake and ladder problem");
		
		int PLAYER1_START = 0;
		int PLAYER2_START = 0;
		
		int curr_pos1 = PLAYER1_START;
		int curr_pos2 = PLAYER2_START;
		int flag =(int)(1+ (Math.floor(Math.random()*10)%2));
		
		while(PLAYER1_START!=100 && PLAYER2_START!=100)
		{	
			if(flag==1){
				System.out.println("Player 1 ");
				int dice1 = roll_dice();
				int choice1 = choice_num();
				System.out.println("Choice " + choice1);	
				switch(choice1){
					case NO_PLAY :  curr_pos1 = PLAYER1_START;
							break;						
					case LADDER : curr_pos1 = PLAYER1_START + dice1;
							if(curr_pos1>100)
								curr_pos1 = PLAYER1_START;
							break;	
						
					case SNAKE : curr_pos1 = PLAYER1_START - dice1;
							if(curr_pos1<0)
								curr_pos1 = 0;
							break;	

				
				}
				PLAYER1_START = curr_pos1;
				flag = 2;
				System.out.println("Player Position " + PLAYER1_START);
			}

			else if(flag==2){
				System.out.println("Player 2 ");
				int dice2 = roll_dice();
				int choice2 = choice_num();
				System.out.println("Choice " + choice2);	
				switch(choice2){
					case NO_PLAY :  curr_pos2 = PLAYER2_START;
							break;						
					case LADDER : curr_pos2 = PLAYER2_START + dice2;
							if(curr_pos2>100)
								curr_pos2 = PLAYER1_START;
							break;	
						
					case SNAKE : curr_pos2 = PLAYER2_START - dice2;
							if(curr_pos2<0)
								curr_pos2 = 0;
							break;	

				
				}
				PLAYER2_START = curr_pos2;
				flag = 1;
				System.out.println("Player Position " + PLAYER2_START);
				
				}



		}
		if(flag == 1){
			System.out.println("Player 2 wins");
		
		}
		else{System.out.println("Player 1 wins");}
	
	}

	public static int roll_dice(){
	
		System.out.println("Rolling Dice ............");
		double dice_num =1+ (Math.floor(Math.random()*10)%6);
		System.out.println("You got " + dice_num);
		return (int)dice_num;

	}

	public static int choice_num(){

		System.out.println("Generating Choice ................");
		double choice =1+ (Math.floor(Math.random()*10)%3);
		
		return (int)choice;

		}
	
	
	

}