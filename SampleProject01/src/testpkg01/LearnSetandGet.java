package testpkg01;

public class LearnSetandGet {
	
		public String name;
		public int empid;
		//getter method for name  
		public String getName(){  
		return name;  
		}  
		
		public int getId(){  
			return empid;  
			} 
		//setter method for name  
		public void setName(String name, int empid){  
		this.name=name;  
		this.empid =empid;
		}  
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearnSetandGet obj = new LearnSetandGet();
		obj.setName("Learning selenium Testing from FITA",100);
		System.out.println(obj.getName());
		System.out.println(obj.getId());

	}

}
