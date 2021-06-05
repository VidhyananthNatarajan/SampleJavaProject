package testpkg01;

public class LearnMethodOverriding extends Baseclass {
	
	@Override
	public void method01() {	
		System.out.println("This is derived/overriden class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnMethodOverriding obj01 = new LearnMethodOverriding();
		obj01.method01();

	}

}
