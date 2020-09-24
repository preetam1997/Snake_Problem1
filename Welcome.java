public class Welcome{
		public static final int PLAYER_START = 0;
	
	

			public static void main(String[] args) {
        			System.out.println("Welcome to Snake and ladder problem");
		
				System.out.println("Player 1 ");
				int dice1 = roll_dice();
				int choice1 = choice_num();
				System.out.println("Choice " + choice1);	
				switch(choice1){
					case NO_PLAY :  curr_pos1 = PLAYER1_START;
							break;						
					case LADDER : curr_pos1 = PLAYER1_START + dice1;
							
							break;	
						
					case SNAKE : curr_pos1 = PLAYER1_START - dice1;
							
							break;	

				
				}
				PLAYER1_START = curr_pos1;
				flag = 2;
				System.out.println("Player Position " + PLAYER1_START);
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

				
