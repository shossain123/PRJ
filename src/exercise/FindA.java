package exercise;

public class FindA {

	public static void main(String[] args) {
		String a = new String("madam");
		char[] c= a.toCharArray();
		
		int temp =0;
		for(int i=0; i<c.length; i++) {
			
			if(c[i] == 'a')
			{
				temp = temp+1;
				
				
			}
			
			}
		System.out.println(temp);
		
		}

	}


