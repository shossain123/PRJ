package upskillfalcon;

public class LoopEx {

	public static void main(String[] args) {
		practiceForLoop();
//		practiceWhileLoop();


	}
	//For Loop
		public static void practiceForLoop(){							//For Loop - Do again and again up to upper limi
																	//Initialize the variable
			for(int i = 1; i <= 1000 ; i = i+1){									//Setting lower limit, Upper limit, Increment or Decrement
				
				
				System.out.println("For Loops number = " + i);			//Statement
			}
		}
		
		//While Loop
		public static void practiceWhileLoop(){							//While Loop - Do again and again upto condition match
			int i = 1;													//Initialize the variable
			while(i<=0){												//Setting Condition
				System.out.println("While Loops number = " + i);		//Statement
				i++;													//Increment or decrement
			}
		}


}
