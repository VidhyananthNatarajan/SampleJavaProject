package testpkg01;

public class LearnStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str="testing";
	     System.out.println(str);
	     System.out.println("The length of the string is :"+str.length());
	     
	     String str1="  testing selenium is a automation tool.  ";
	     System.out.println(str1.trim());
	     
	     char[] charArray01 = str.toCharArray();
	     
	     for (int i=0;i<=str.length()-1;i++) {
	    	 System.out.println(charArray01[i]);
	     }
	     
	     System.out.println(str.equals(str1));
	     System.out.println(str.equalsIgnoreCase(str1));
	     System.out.println(str1.contains(str));
	     
	      System.out.println(str.charAt(5));
	     
	      String[] split01= str1.split(" ");
	     
	     for (int i=0;i<=split01.length-1;i++) {
	    	 System.out.println(split01[i]);
	     }
	     
	     System.out.println(str.replace("ing", "er")); 
	     
 

	}

}
