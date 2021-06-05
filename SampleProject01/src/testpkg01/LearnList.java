package testpkg01;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ist<generics> <ObjectName> = new ArrayList<generics>();
		List<String> obj = new ArrayList<String>();
		obj.add("one");
		obj.add("two");
		obj.add("Three");
		obj.add("two");
		
		//syntax for for-each statement
		
		//for(datatype variablename:datasource array/collection object) {
			
		//}
		
		for (String eachele:obj) {
			System.out.println(eachele);
		}
		
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());

	}

}
