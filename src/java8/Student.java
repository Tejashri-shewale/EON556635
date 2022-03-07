package java8;

import java.util.ArrayList;
import java.util.Collections;

public class Student
{
	
	public static void main(String args[])
	{  
		ArrayList<student11> al=new ArrayList<student11>();  
		al.add(new student11(101,"Vijay",23));  
		al.add(new student11(106,"Ajay",27));  
		al.add(new student11(105,"Jai",21));  
		  
		Collections.sort(al);  
		for(student11 st:al)
		{  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		
	}  
}		
	
 class student11 implements Comparable<student11> 
{  

	int rollno;  
	String name;  
	int age;  
	student11(int rollno,String name,int age)
	{  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
	}  
	
	public int compareTo(student11 st)
	{  
		if(age==st.age)  
		return 0;  
		else if(age>st.age)  
		return 1;  
		else  
		return -1;  
	}  

}  