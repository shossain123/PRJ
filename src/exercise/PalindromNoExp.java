package exercise;

public class PalindromNoExp {

	public static void main(String[] args) {
		int no = 1001;
		int temp = no;
		int rev =0, rem;
		int count=0;
		int sum=0;
		while(temp != 0) {
			rem = temp%10;
			sum= sum+rem;
			rev = rev*10 + rem;
			temp = temp/10;
			count++;
		}
		System.out.println(rev);
		System.out.println(sum);
		System.out.println(count);
		
		
		if(no==rev) {
			System.out.println(no +" is palidrome");
		}
		else {
			System.out.println(no +" is not palidrome");
		}

	}

}
