import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
	    
	    //user info
	    System.out.println("Enter first name: ");
	    String first_Name = input.next(); 
	    
	    System.out.println("Enter last name: ");
	    String last_Name = input.next(); 
	    
	    System.out.println("Enter Student ID: ");
	    String id = input.next(); 
	    
	    //creating obj for average class
	    student s1 = new student(first_Name, last_Name, id); 
	    
	    int choice = -1;  
	    
	    do
	    {
	    	System.out.println("\n----------------------\nEnter your choice"
	    			+ "\n1. Show info."
	    			+ "\n2. Change password."
	    			+ "\n3. Show Department."
	    			+ "\n4. Calculate average."
	    			+ "\n5. Generate Email."
	    			+ "\n6. Obtain Email.");
	    	
	    	
	    	choice = input.nextInt(); 
	    	
	    	switch(choice)
	    	{
	    		case 1: s1.getInfo(); break; 
	    		case 2: s1.setPassword(); break; 
	    		case 3: s1.setDept(); break; 
	    		case 4: s1.setAverage(); 
	    		case 5: s1.generateEmail(); break; 
	    		//case 6: s1.
	    	}
	    } while(choice != 5); 


	}

}