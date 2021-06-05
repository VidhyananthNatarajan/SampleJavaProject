package testpkg01;

public class LearnWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=783456,n1=0;
		while (n>0) {
			n1=n1+n%10;
			n=n/10;
		}
		System.out.println("Sum of the digits is:"+n1);

	}

}
