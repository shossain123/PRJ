package newclass;

public class Student2 {

	public static void main(String[] args) {

		String x = new String("Learn java learn selenium learn TNG java");
		int count;
		x = x.toLowerCase();
		String[] w = x.split(" ");
		for (int i = 0; i < w.length; i++) {
			System.out.print(w[i] + " ,");
		}
		System.out.println();
		for (int i = 0; i < w.length; i++) {
			count = 2;
			for (int j = i + 1; j < w.length; j++) {

				if (w[i].equals(w[j])) {
					count= count+1;
					w[j] = "";
				}
			}
			if (count > 2 && w[i] != "") {
				System.out.println("duplicat word is " + w[i]);
				String rev = "";
				for (int r = w[i].length() - 1; r >= 0; r = r - 1) {
					rev = rev + w[i].charAt(r);
				}
				System.out.println(rev);

			}

		}

	}

}
