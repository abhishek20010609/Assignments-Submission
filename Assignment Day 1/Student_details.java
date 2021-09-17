package javapbl;

import java.util.Scanner;

public class Student_details {
	
	private String Name;
	private int Roll_Num;
	private int English;
	private int Maths;
	private int Science;
	private float Total_Marks;
	private double Average_Marks;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Name : ");
		Name = sc.nextLine();
		
		System.out.println("Enter Student Roll Number : ");
		Roll_Num = sc.nextInt();
		
		System.out.println("Enter Marks in English : ");
		English = sc.nextInt();
		
		System.out.println("Enter Marks in Maths : ");
		Maths = sc.nextInt();
		
		System.out.println("Enter Marks in Science : ");
		Science = sc.nextInt();
		
	}
	
	public void compute()
	{
		
		Total_Marks = English + Maths + Science;
		
		Average_Marks = Total_Marks / 3.0;
		
	}
	
	public void display() 
	{
		
		System.out.println("Student Name : "+Name);
		
		System.out.println("Student Roll Number : "+Roll_Num);
		
		System.out.println("Marks in Science : "+English);
		
		System.out.println("Marks in English : "+Maths);
		
		System.out.println("Marks in Maths : "+Science);
		
		System.out.println("Total Marks : "+Total_Marks);
		
		System.out.println("Marks in Average Marks : "+Average_Marks);

    }
	
	public static void main(String[] args)
	{
		
		Student_details obj = new Student_details();
		obj.accept();
		obj.compute();
		obj.display();
		
	}
}
