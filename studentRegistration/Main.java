package studentRegistration;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in); 
		
	    //ask how many new users we want to add by CREATING AN ARRAY OF OBJECTS
	    System.out.println("Enter number of students needed to enroll: ");
	    int numOfStudents = in.nextInt(); 
	    Student[] students = new Student[numOfStudents]; 		
		
	    //create n number of new students
	    for(int n=0; n<numOfStudents; n++)
	    {
			students[n] = new Student(); 
			
			students[n].enroll();
			students[n].payTuition();
		    System.out.println(students[n].showInfo());
	    }
	}

}
