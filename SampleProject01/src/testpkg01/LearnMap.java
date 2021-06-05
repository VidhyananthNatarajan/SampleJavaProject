package testpkg01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub S->4 r->2 a->3
		String name ="SeleniumAutomationTraining";
		char[] charArray01= name.toCharArray();
		
		// Map<Generics,Generics> Objname = new HashMap <Generics,Generics>();
		Map<Character,Integer> countmap = new HashMap <Character,Integer>();
		
		for (char ch : charArray01 ) {
			
			if (countmap.containsKey(ch)) {
				//value already exists add +1 to the value for the corresponding key
				  countmap.put(ch,countmap.get(ch)+1);
			}
			else
			{
				//for first time just add 1
			 countmap.put(ch,1);
				
			}
			
		}
		
		System.out.println(countmap);
		
		for (Entry<Character,Integer> eachvalue : countmap.entrySet()) {
			//System.out.println(eachvalue.getKey() + " ---> " + eachvalue.getValue() );
			System.out.println("Key is:" + eachvalue.getKey() + "---> and the value is:" +eachvalue.getValue());
		}

	}

}
