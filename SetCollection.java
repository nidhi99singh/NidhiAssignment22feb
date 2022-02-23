//Set Collection
//1. Hash Set
import java.util.*;
class SetCollection{
		public static void main(String [] args)
		{
			HashSet <String> hs=new HashSet<String>();
			//add elements
			hs.add("nidhi");
			hs.add("neha");
			hs.add("John");
			hs.add("alina");
			hs.add(null);
			Iterator it=hs.iterator();
			
			//dispaly elements
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
			//remove elements
			hs.remove("neha");
			
				System.out.println("After removal"+hs);
			
			//contains method
			if(hs.contains("nidhi"))
			{
				System.out.println("yes");
				
			}
			else
				System.out.println("not present");
			System.out.println("before clear method is used"+hs);
			
			//size method
			System.out.println("Size of HashSet "+hs.size());
			
			//hashcode method
			System.out.println(" HashCode "+hs.hashCode());
			
			//isEmpty()method
			if(!hs.isEmpty())
			{
				hs.clear();
				System.out.println("After clear"+hs);
			}
		}
		}