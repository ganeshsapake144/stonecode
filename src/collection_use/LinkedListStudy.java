package collection_use;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) 
	{
       
		LinkedList <Object> gs= new LinkedList<>();
		
		gs.add("Pune");
		gs.add(123);
		gs.add(22.22f);
		gs.add(null);
		gs.add(null);
		gs.add(true);
		gs.add("Pune");
		gs.add('A');
		
		System.out.println(gs);
		System.out.println("=========================================");
		gs.add(0, "Hello");
		System.out.println(gs);
		System.out.println("=========================================");
		
		gs.addFirst("new");
		gs.addLast("old");
		System.out.println(gs);
		System.out.println("=========================================");
		
		//gs.clear();
		System.out.println(gs);
		System.out.println("=========================================");
		System.out.println(gs.contains("new"));
		System.out.println("=========================================");
		
		System.out.println(gs.element());
		System.out.println(gs);
		System.out.println("=========================================");
		System.out.println(gs.get(2));
		System.out.println("=========================================");
		
		System.out.println(gs.getFirst());
		System.out.println(gs.getLast());
		System.out.println(gs);
		System.out.println("=========================================");
		gs.indexOf("Pune");
		System.out.println(gs.size());
		gs.set(5,"katraj");
		System.out.println(gs);
		System.out.println("=========================================");
		System.out.println(gs.peek());
		System.out.println(gs);
		System.out.println(gs.poll());
		System.out.println(gs);
		System.out.println("=========================================");
		System.out.println(gs.peekFirst());
		System.out.println(gs.peekLast());
		System.out.println(gs);
		System.out.println("=========================================");
		System.out.println(gs.pollFirst());
		System.out.println(gs.pollLast());
		System.out.println(gs);
		System.out.println("=========================================");
		System.out.println(gs);
		System.out.println(gs.pop());
		System.out.println(gs);
		System.out.println("=========================================");
		System.out.println(gs);
		gs.push("Mumbai");
		System.out.println(gs);
		
		gs.remove(0);
		System.out.println(gs);
		System.out.println("=========================================");
		System.out.println("=====traversing through linkedlist====================================");
		System.out.println("======for loop===================================");
		//for loop --> if there is get method
		for(int k=0;k<=gs.size()-1;k++)
		{
			System.out.println(gs.get(k));
			
		}
		  //for each
		System.out.println("===========for each loop==============================");
		for(Object p:gs)
		{
			System.out.println(p);
		}
		System.out.println("==========Iterator===============================");
		Iterator<Object> mm = gs.iterator();
		while(mm.hasNext())
		{
			System.out.println(mm.next());
			
		}
		System.out.println("==========List-Iterator===============================");
		ListIterator<Object> oo = gs.listIterator();
		while(oo.hasNext())
		{
			System.out.println(oo.next());
		}
				
		
		
		 
		
		
		
		
		
		


	}

}
