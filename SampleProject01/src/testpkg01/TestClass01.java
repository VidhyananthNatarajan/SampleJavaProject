package testpkg01;

public class TestClass01 {
	
	int p=50;
	static String s="learning";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		//local variable
		int m =100;
		System.out.println(m);
		//Instance Variable
		TestClass01 obj= new TestClass01();
		System.out.println(obj.p);
		//static variable
		System.out.println(s);

	}

}
