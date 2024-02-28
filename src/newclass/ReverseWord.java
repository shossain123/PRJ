package newclass;

public class ReverseWord {

	public static void main(String[] args) {
		String x = new String("Learn@ java% selenium TNG");
		x =x.replaceAll("[^a-z A-Z 0-9 //s]", " ");
		System.out.println(x);
		int count;
		x = x.toLowerCase();
		String[] w = x.split(" ");
		for (int i = w.length-1; i>=0; i--) {
			System.out.print(w[i] + " ,");
		          
		}
		System.out.println();
		
		String revresestring ="";
		for (int i = 0; i < w.length; i++) {
			
		
				String rev = "";
				for (int r = w[i].length() - 1; r >= 0; r = r - 1) {
					rev = rev + w[i].charAt(r);
					
				}
				//System.out.println(rev);
				revresestring=revresestring+" "+rev;
				
				

			

		}
		System.out.println(revresestring);


	}

}
