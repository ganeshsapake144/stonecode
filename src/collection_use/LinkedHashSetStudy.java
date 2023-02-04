package collection_use;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args)
	{
		  LinkedHashSet<String> lh=new   LinkedHashSet<>();
		  
		  lh.add("Pune");
		  lh.add("Mumbai");
		  lh.add("Nagpur");
		  lh.add("Thane");
		  lh.add("Pune");
		  lh.add(null);
		  lh.add(null);
		  lh.add("Dehli");
		  
		  System.out.println(lh);
		   System.out.println(lh.size());
          System.out.println("============for each==========");
          
          for(Object g:lh)
          {
        	  System.out.println(g);
          }
          System.out.println("==========iterator=============");
              Iterator<String> gs = lh.iterator();
            		  while(gs.hasNext())
            		  {
            			  System.out.println(gs.next());
            			  
            		  }

	}

}
