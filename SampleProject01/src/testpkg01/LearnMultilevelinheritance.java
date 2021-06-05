package testpkg01;

public class LearnMultilevelinheritance extends SingleInheritanceClass {
	
	public void method03() {
		System.out.println("This is the first child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnMultilevelinheritance obj02 = new LearnMultilevelinheritance();
		
		obj02.method01();
		obj02.method02();
		obj02.method03();

	}

}
