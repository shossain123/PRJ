package loop;

public class IncrementExcept {

	public static void main(String[] args) {
		for(int i=1; i<=20; i=i+1) {
			//if(i !=13) //we don't want to see 13 in console
			//if(i==13) //we want to see only 13
			//if((i==13)||(i==14)) //we want to see only 13 and 14
			if((i!=13)&&(i!=14)){
				System.out.println(i);
			}
		}

	}

}
