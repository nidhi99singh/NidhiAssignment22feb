//Encapsulation program
//method overridding
import java.util.*;
class Encap{
	private String p_name;
	private int p_id;
	private int quantity;
	private float price;
	public String getp_name()
	{
		return p_name;
	}
	public void setp_name(String name)
	{
		this.p_name=name;
	}
	public int getp_id()
	{
		return p_id;
	}
	public void setp_id(int p_id)
	{
		this.p_id=p_id;
	}
	public int getquantity()
	{
		return quantity;
	}
	public void setquantity(int quantity)
	{
		this.quantity=quantity;
	}
	public float getprice()
	{
		return price;
	}
	public void setprice(float price)
	{
		this.price=price;
	}
}
class Product{
	public static void main(String args[])
	{
		Encap en=new Encap();
		en.setp_name("Computer");
		en.setp_id(222);
		en.setquantity(100);
		en.setprice(2000);
		System.out.println("Product name:"+ en.getp_name());
		System.out.println("Product id:"+en.getp_id());
		System.out.println("Quantity:"+en.getquantity());
		System.out.println("Price:"+en.getprice());
	}
	
}	