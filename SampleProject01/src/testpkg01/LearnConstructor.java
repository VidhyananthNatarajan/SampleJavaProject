package testpkg01;

public class LearnConstructor {
	int i;
	String n;
	
	//Constructor
	
	public LearnConstructor(int id, String name) {
		
		i=id;
		n=name;
		
		
	}
	
	public void methd01() {
		System.out.println("The emp id is:"+i+" and the name of the employee is:"+n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnConstructor obj = new LearnConstructor(100,"Gopu");
		obj.methd01();
		

	}

}
