package testpkg01;

public class SingleInheritanceClass extends Baseclass {
	
	public void method02() {
		System.out.println("This is a child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleInheritanceClass obj01 = new SingleInheritanceClass();
		obj01.method01();
		obj01.method02();
		
		
	}

}
