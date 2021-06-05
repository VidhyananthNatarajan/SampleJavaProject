package testpkg01;

public class LearnSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =30, b=15;
		int choice=0;
		
		switch(choice) {
		case 0:
			System.out.println("The addition of 2 nos is:" +(a+b)); 
			break;
		case 2: System.out.println("The subtraction of 2 nos is:" +(a-b)); 
		    break;
		case 3: System.out.println("The product of 2 nos is:" +(a*b)); 
		    break;
		default: System.out.println("The division of 2 nos is:" +(a%b)); 
		    break;
		}

	}

}
