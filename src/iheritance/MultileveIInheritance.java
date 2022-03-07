package iheritance;
class Sem1
{
	public Sem1()
	{
		System.out.println("\n sem1 constructor");
	}
	
	int math,c,cpp;
	void input1()
	{
		math=50;
		c=80;
		cpp=90;
	}
	public void output1()
	{
		System.out.println("-----------SEM 1-----------\n \n ");
		System.out.println("\n marks in math "+math);
		System.out.println("\n marks in c "+c);
		System.out.println("\n marks in cpp "+cpp);
	}
}

class Sem2 extends Sem1
{
	public Sem2()
	{
		System.out.println("\n sem2 constructor");
	}
	
	int eng,java,testing;
	void input2()
	{
		eng=70;
		java=78;
		testing=80;
	}
	public void output2()
	{
		System.out.println("-----------SEM 2-----------\n \n ");
		System.out.println("\n marks in eng "+eng);
		System.out.println("\n marks in java "+java);
		System.out.println("\n marks in testing "+testing);
	}
}

class Sem3 extends Sem2
{
	public Sem3()
	{
		System.out.println("\n sem3 constructor");
	}
	
	int dbms,m1,m2;
	void input3()
	{
		dbms=70;
		m1=78;
		m2=80;
	}
	public void output3()
	{
		System.out.println("-----------SEM 3-----------\n \n ");
		System.out.println("\n marks in dbms "+dbms);
		System.out.println("\n marks in m1 "+m1);
		System.out.println("\n marks in m2 "+m2);
	}
}




public class MultileveIInheritance 
{

	public static void main(String[] args) 
	{
		Sem3 s=new Sem3();
		s.input1();
		s.input2();
		s.input3();
		s.output1();
		s.output2();
		s.output3();
	

	}

}
