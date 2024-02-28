package homeexercise;

public class AExample {

	public static void main(String[] args) {
	int []x= {10,29,5,39,32};
	int l=x.length;
	int tem=0;
	for(int i=0; i<l; i++) {
	for(int j=i+1; j<l-1; j=j+1) {
			tem=x[i];
			x[i]=x[j];
		x[j]=tem;
			
		}
	}
	System.out.println(x[2]);
	

	}
	}

