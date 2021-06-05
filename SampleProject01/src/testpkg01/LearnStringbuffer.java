package testpkg01;

public class LearnStringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("testing");
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("selenium");
		System.out.println(sb);
		sb.insert(15," is a automation tool");
		System.out.println(sb);
		sb.replace(21, 26,"java based");
		System.out.println(sb);
		sb.delete(21,26);
		System.out.println(sb);
		
	     System.out.println(sb.reverse());
	     System.out.println(sb.capacity());
		
		
	}

}
