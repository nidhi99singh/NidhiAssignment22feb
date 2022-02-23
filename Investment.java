//abstract class and abstract method

abstract class Invest{
	final int amount=2000000;
	abstract void InterestAmount();
	void display()
	{
		System.out.println("Amount:"+amount);
	}
}
class PNB extends Invest{
	float rate=5;
	double intrest=(amount*rate)/100;
	void InterestAmount()
	{
	
		System.out.println("Interest Amount of PNB:"+intrest);
	}
}
class Axis extends Invest{
	float rate=6;
	double intrest=(amount*rate)/100;
	final void InterestAmount()
	{	
		System.out.println("Interest Amount of Axis:"+intrest);
	}
}
class Profit extends Axis{
		double totalamt= amount+intrest;
		void display()
		{
			System.out.println("Total value of money in Axis:"+ totalamt);
		}
}
class ProfitP extends PNB{
		double totalamt= amount+intrest;
		void display()
		{
			System.out.println("Total value of money in PNB:"+ totalamt);
		}
}
class Investment{
	public static void main(String [] args)
	{
			Invest in=new PNB();
			in.InterestAmount();
			in.display();
			Axis p =new Profit();
			p.display();
			PNB pnb=new ProfitP();
			pnb.display();
	}
}