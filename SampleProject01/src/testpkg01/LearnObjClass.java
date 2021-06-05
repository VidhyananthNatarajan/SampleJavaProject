package testpkg01;

public class LearnObjClass {
	
	String Mobilename ="Samsung";
	
	public String getName() {
		return Mobilename;
	}
	
	public int mobprice() {
		int price =56745;
		return price;
	}
	
	boolean usuagecondition=true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnObjClass obj = new LearnObjClass();
		System.out.println(obj.Mobilename);
		System.out.println(obj.getName());
		System.out.println(obj.usuagecondition);
		System.out.println(obj.mobprice());
		

	}

	

}
