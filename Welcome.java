
public class Welcome{
	public static final int PLAYER1_START = 0;
	public static final int PLAYER2_START = 0;
	

	public static void main(String[] args) {
        	System.out.println("Welcome to Snake and ladder problem");
		
		
		
		
	
	
	}


	public static int roll_dice(){
	
		System.out.println("Rolling Dice ............");
		double dice_num =1+ (Math.floor(Math.random()*10)%6);
		System.out.println("You got " + dice_num);
		return (int)dice_num;

	}


}