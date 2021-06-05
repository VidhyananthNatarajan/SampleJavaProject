package testpkg01;

public class LearnMethodOverloading {
	
	public int methodadd(int a ,int b ,int c) {
		int d;
		d=a+b+c;
		return d;
		
	}
	
    public String methodadd(String a ,String b) {
    	String c= a.concat(b);
    	return c;
    	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnMethodOverloading over = new LearnMethodOverloading();
		System.out.println(over.methodadd("Selenium","Testing"));
		System.out.println(over.methodadd(78, 89, 45));

	}

}
