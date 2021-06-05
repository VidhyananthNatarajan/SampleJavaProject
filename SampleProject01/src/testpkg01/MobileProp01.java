package testpkg01;

public class MobileProp01 extends MobProperties {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile obj = new MobileProp01();
		MobProperties obj01 = new MobileProp01();
		obj.health();
		obj.mobdimen();
		obj.mobname();
		obj.price();
		obj01.storage();
		obj01.appdownload();
		
	}
	
	@Override
	public void mobname() {
		System.out.println("Mob name is Samsung");
		
	}

	@Override
	public void mobdimen() {
		// TODO Auto-generated method stub
		System.out.println("Dimension is Large");
		
	}

	@Override
	public void health() {
		// TODO Auto-generated method stub
		System.out.println("Good.100%");
	}

	@Override
	public void price() {
		// TODO Auto-generated method stub
		System.out.println("9600");
		
	}

	@Override
	public void appdownload() {
		// TODO Auto-generated method stub
		System.out.println("Able to download the app");
	}

}
