package collection_use;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) 
	{
		 
		 TreeSet <Object> t = new TreeSet<>();
		 
//		 t.add('Z');
//		 t.add('A');
//		 t.add('X');
//		 t.add('B');
//		 t.add('T');
		 
		
		 
//		 t.add("Pune");
//		 t.add("Dehli");
//		 t.add("Aurangabad");
//		 t.add("Mumbai");
//		 t.add("Nashik");
//		 t.add("Nashik");
		 
		 t.add(10);
		 t.add(8);
		 t.add(1);
		 t.add(4);
		 t.add(3);
		 t.add(5);
		 t.add(7);
		 t.add(6);
		 t.add(2);
		 
		 System.out.println(t);
		 
		 System.out.println(t.first());
		 System.out.println(t.last());
		 System.out.println(t.ceiling(4));
		 
		 System.out.println(t.floor(8));
		 
		 System.out.println(t.higher(3));
		 
		 System.out.println(t.lower(3));
		 System.out.println("========for each=======================");
		 
		 for(Object gs:t)
		 {
			 System.out.println(gs);
		 }
		 System.out.println("======iterator==========================");
		 
		   Iterator<Object> g = t.iterator();
		   while(g.hasNext())
		   {
			   System.out.println(g.next());
			   
		   }
				   
		 
		 
	
		 
		 
		 
 
	}

}
