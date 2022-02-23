interface amount{
	final float amt=10000;
	void Profit();
}
class Bank implements amount{
	int rate=5;
	float p=(amt*rate)/100;
	public void Profit()
	{
	System.out.println("Profit in bank"+p);
	}	
}
class PostOffice implements amount{
	int rate=7;
	float po=(amt*rate)/100;
	public void Profit()
	{
	System.out.println("Profit in PostOffice"+po);
	}
}

class Totalprofit {
/*implements Bank, PostOffice{
		
		void display()
		{
			//Bank.super.Profit();
			double total= amount+p;
			System.out.println(total);
		}
		void displaypo()
		{
			//PostOffice.super.Profit();
			double total= amount+p;
			System.out.println(total);
		}
*/
		public static void main(String []args)
		{
			amount am=new PostOffice();
			am.Profit();
			/*
			Totalprofit p= new Totalprofit();
			p.display();
			p.displaypo();
		*/}
}