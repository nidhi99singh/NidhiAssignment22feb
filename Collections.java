//List interfaces
//1. arraylist
//2. linked list
//3. vectors

import java.util.*;
import java.util.Scanner;
class Collections{
	public static void main(String [] args)
	{
		ArrayList <Integer> AL=new ArrayList<Integer>();
		LinkedList <Integer> LL=new LinkedList<Integer>();
		Vector <Integer> Vec=new Vector<Integer>();
		System.out.println("ArrayList:"+AL);
		System.out.println("LinkedList"+LL);
		System.out.println("Vector:"+Vec);
		Scanner s=new Scanner(System.in);
		System.out.println("enter insertion choice\n 1:for ArrayList\n 2: for Linked LIst\n3: for Vectors\n");
		int ch=s.nextInt();
		System.out.println("how many elements:");
		int c=s.nextInt();
		// adding elements
		for(int i=0;i<c;i++)
		{
			System.out.println("enter element index "+i);
			int ele=s.nextInt();
			if(ch==1)
			{
				AL.add(ele);
			}
			else if(ch==2)
			{
				LL.add(ele);
				
			}	
			else if(ch==3)
			{
				Vec.addElement(ele);
			}
			else{
				System.out.println("enter correct choice");
			}
		}
		
			if(ch==1)
			{
				Iterator It=AL.iterator();
				while(It.hasNext())
				{
				System.out.println(It.next());	
				}
				
			}
			else if(ch==2)
			{
				System.out.println("LinkedLIst"+LL);
				
			}	
			else if(ch==3)
			{
				for(int j=0;j<Vec.size();j++)
				{
				System.out.println("Vector :"+Vec.get(j)+ " ");	
				}
			}
			
			else{
				System.out.println("enter correct choice");
			}
//removing elements
			//Arraylist
			
			if(AL.size()!=0)
			{
				System.out.println("enter index of element to be removed from arraylist");
				int ad=s.nextInt();
				AL.remove(ad);
				System.out.println("ArrayList:"+AL);
			}
			
			//LinkedList
			if(LL.size()!=0)
			{
			System.out.println("enter index of element to be removed from Linkedlist");
			int ld=s.nextInt();
			LL.remove(ld);
			System.out.println("LinkedList:"+LL);
			LL.clear();
			System.out.println("LinkedList:"+LL);
			}
			if(!Vec.isEmpty())
			{
			System.out.println("enter index of element to be removed from Vector");
			int vd=s.nextInt();
			Vec.remove(vd);
			System.out.println("Vector:"+ Vec);		
						
			}


	}	
	}
