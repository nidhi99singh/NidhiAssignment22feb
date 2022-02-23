// dQueue operations
import java.util.*;
class Dequeue{
	public static void main(String [] args){
		Deque <Integer> dq=new ArrayDeque<Integer>(10);
		Scanner s=new Scanner(System.in);
		dq.add(1);
		dq.add(9);
		System.out.println(dq);
		System.out.println("enter choice \n 1: to insert at first position\n2:to insert at last position\n 3:clear queue");
		int ch=s.nextInt();
		switch(ch){
			case 1: dq.addFirst(100);
					dq.addFirst(120);
					System.out.println(dq);
					break;
			case 2: System.out.println(dq);
					dq.addLast(12);
					dq.addLast(20);
					System.out.println(dq);
					break;
			case 3: dq.clear();
					System.out.println(dq);
					break;
			default:
					System.out.println("Invalid choice");
					break;
		}
	
	}
}