

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

			
