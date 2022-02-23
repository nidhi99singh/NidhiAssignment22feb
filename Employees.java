//Inheritance program

import java.util.*;

class Employee{ 		//parent class
	String name;
	final int age=40;
	float salary;
	int emp_id;
	Employee()			//default constructors
	{
		name="Alina";
		salary=20000;
		emp_id=101;
		}
	Employee(String nm,int a,float sal,int id)		//parameterised constructors
	{
		this.name=nm;
		
		this.salary=sal;
		this.emp_id=emp_id;
	}
	void display()
	{
		System.out.println("Employee Details:\nName:"+name+"\nage:"+age+"\nsalary:"+salary+"\nemp_id:"+emp_id);
	}

	}
class Manager extends Employee{						//single inheritance
	protected int bonus=2000;
	float sal=salary+bonus;
	int dept_id=101;
	void display()
	{
	System.out.println("Manager:\nnew salary:"+sal +"\n dept_id:"+dept_id);
	}
}
class AreaManager extends Manager{					//multilevel inheritance
	int incentive=1500;
	float newsal=sal+incentive;
	void display()
	{
	System.out.println("after incentive salary:"+newsal+"\n dept_id:"+dept_id);
	}
}
class Engineer extends Employee{					//single inheritance
	int bon=1000;
	float sala=salary+bon;
	int dept_id=102;
	void display()
	{
	System.out.println("Engineer:\nnew salary:"+sala+"\n dept_id:"+dept_id);
	}
}
class Employees{
	public static void main(String [] args){
	Employee em=new Employee();
	em.display();
	Employee e=new Manager();
		e.display();
	Manager m=new AreaManager();
		m.display();
	Employee er=new Engineer();
		er.display();

	}
}