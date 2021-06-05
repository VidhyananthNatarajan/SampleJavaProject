package testpkg01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset -> display the value in random order
		//LinkedHashSet -> always maintains the inserting order
		//TreeSet -> maintain the alphabetical/ASCII order
		
		Set<String> obj = new HashSet <String>();
		obj.add("one");
		obj.add("two");
		obj.add("aone");
		obj.add("Aone");
		
		
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains("one"));

	}

}
