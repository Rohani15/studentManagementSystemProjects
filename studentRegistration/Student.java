package studentRegistration;

import java.util.Scanner;

public class Student 
{
	private String firstName; 
	private String lastName; 
	private int gradeYear; 
	private String studentID; 
	private String courses = " ";
	private int tuitionBalance = 0; 
	private static int costOfCourse = 600; 
	private static int id = 1000; 
	
	Scanner in = new Scanner(System.in); 

	
	//Constructor to prompt user to enter name and year
	public Student()
	{
		System.out.print("Enter a studnet's first name: ");
		this.firstName = in.nextLine(); 
		
		System.out.print("Enter a studnet's Last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("Enter a studnet's Grade Level"
				+ "\n1. Freshman "
				+ "\n2. Sophmore "
				+ "\n3. Junior "
				+ "\n4. Senior ");
		this.gradeYear = in.nextInt();
		
		setStudentID(); 

	}
	
	//Generate a unique ID
	private void setStudentID()
	{
		//it is going to be grade level + the static id
		id++; 
		studentID = gradeYear + "" + id; 
		
	}
	
	//Enroll in courses
	public void enroll()
	{
		System.out.print("Enter a course to enroll. Q to quit: ");
		do
		{
			System.out.print("Course: ");
			//get inside of a loop. User hits 0 when they are done enrolling
			String course = in.nextLine(); 
			
			if(!course.equals("Q")) 
			{
				courses = courses + "\n " +  course; 
				tuitionBalance += costOfCourse; 
			}
			else {break;}
		}while(1 != 0); 
		
		System.out.println("TUITION BALANCE: " + tuitionBalance);
	}
	//View balances
	public void viewBalance()
	{
		System.out.println("Your balance is: " + tuitionBalance);
	}
	
	//Pay balance
	public void payTuition()
	{
		viewBalance(); 
		
		System.out.print("Enter your payment: ");
		int payment = in.nextInt(); 
		
		tuitionBalance = tuitionBalance - payment; 
		System.out.println("Thank you for your payment of $ " + payment);
		viewBalance(); 
	}
	
	//Display info 
	public String showInfo()
	{
		System.out.println(" ");
		return "Name: " + firstName + " " + lastName 
				+ "\nStudent Id: " + studentID
				+ "\nGrade Year: " + gradeYear
 				+ "\nCourses Enrolled: " + courses
				+ "\nBlanance $" + tuitionBalance;
 	}

}











