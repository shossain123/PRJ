package exercise;

public class PracticeNO {

	public static void main(String[] args) {
		
		        int number= 1001;
		        int count = 0;
		        int temp= number;
		        int rev=0;
		        int reminder;
		        int sum=0;
		        while(number!=0){
		            reminder= temp%10;
		            sum= sum+reminder;
		            rev = rev*10+ reminder;
		            temp= temp/10;
		            count++;
		        }
		        if(number==rev){
		            System.out.println("number is palindrom");
		        }
		        else{
		            System.out.println("number is not palindrom");
		        }
		        System.out.println(sum);
		        System.out.println(count);
		    }
		

	}


