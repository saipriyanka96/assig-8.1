/*constructor overloading is a concept of having more than one constructor with
 * different parameter list in such a way so that each constructor performs a different task
 */
package method;
//Package is a grouping of related types providing access protection and name 

import java.util.Scanner;
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//Scanner is a simple text scanner which can parse primitive types ans string using regular expressions
public class Student {
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
//Studentis a class name
	private int rollno;
//Private access modifier is the most restrictive access level. Class and interfaces cannot be private.
//int is a default data type for integral values
//String is immutable
	private String name;
	private int age;
	Student()
	{
		//Default constructor
		rollno=1274;
		name="priya";
		age=18;
	}
	Student(int num1,String str,int num2)
	{
		//parameterized constructor
		rollno=num1;//here we are not taking values directly and we are asking user
		name=str;
		age=num2;
		}
	//getter and setter methods are ordinary functions.The reason for using getters and setters instead of making your members public 
	//is that it makes it possible to change the implementation without changing the interface. 
	public int getrollno(){
		return rollno;
	}
	public void setrollno(int rollno)
	{	
		/*this is used for calling the default constructor from parameterized constructor
		 * it should always be the first statement inside constructor body
		 */
		
		this.rollno=rollno;
	}
	public String getname(){
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public int getage(){
		return age;//returning the value
	}
	public void setage(int age)
	{
		this.age=age;
	}
	
	public static void main(String[] args)
	{
		//this object creation would call the default constructor
		Student s=new Student();
		System.out.println("Student name:"+s.getname());
		//System is a final class in java.lang package
		//out is a static member field of system class and it's type PrintStream
		//println is a method of PrintStream class and it means print in next line
		//Inside the brackets is value which to be printed		
		
		System.out.println("Student age:"+s.getage());
		System.out.println("Student rollno:"+s.getrollno());
		/*this object creation would call the parameterized
		 * constructor Student(int,String,int)*/
		 
		Student s2=new Student(555,"uma",90);
		System.out.println("Student name:"+s2.getname());
		System.out.println("Student age:"+s2.getage());
		System.out.println("Student rollno:"+s2.getrollno());
		
	}
}