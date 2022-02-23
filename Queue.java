//priority queue operations
import java.util.*;
class Queue{
	public static void main(String [] args)
	{
		PriorityQueue <Integer> qu=new PriorityQueue<>();
		Scanner s=new Scanner(System.in);
		qu.add(15);
		qu.add(20);
		qu.add(25);
		System.out.println(qu);
		System.out.println("enter choice \n 1: to insert operation\n2:to print top element\n 3:removing top element");
		int ch=s.nextInt();
		if(ch==1)
		{
					System.out.println("enter element you want to insert");
					int ele=s.nextInt();
					qu.add(ele);
					System.out.println("After insertion"+qu);
		}
		else if(ch==2)
		{
			if(!qu.isEmpty())
			{
				System.out.println("Top element "+qu.peek());
				System.out.println("Top element "+qu.peek());
				System.out.println(qu);
			}
			else{
				System.out.println("Queue is empty");
			}
		}
		else if(ch==3)
		{
			if(!qu.isEmpty())
			{
				System.out.println("removed element"+qu.poll());
				
			}
			else{
				System.out.println("Queue is empty");
			}
		}
		else{
			System.out.println("Invalid choice");
		}
		
	}
	}