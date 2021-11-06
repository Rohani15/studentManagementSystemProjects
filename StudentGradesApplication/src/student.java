import java.util.Random;
import java.util.Scanner;

public class student 
{
	//Variables-----------------------------------------------------
	private String firstName;
	private String lastName;
	private String ID; 
	private String dept; 
	private String email; 
	private String password; 
	private int g1, g2, g3;
	private double average; 
	
    Scanner input = new Scanner(System.in);
	
	//Constructors-----------------------------------------------------
	public student(String firstName, String lastName, String ID) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID; 
        System.out.println("Student: : " + this.firstName +" " + this.lastName + "\n Student ID: " + this.ID);
        
        //Calling Methods
        this.dept = this.setDept(); 
        this.email = this.generateEmail(); 
        this.password = this.genratePassword(8);  //password

	}
	
	//getters-----------------------------------------------------
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public String getID() {return ID;}
	public String getEmail() {return email;}
	public String getPassword() {return password;}
	public int getG1() {return g1;}
	public int getG2() {return g2;}
	public int getG3() {return g3;} 
	
	//Methods-----------------------------------------------------
	public String generateEmail()
	{
		return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dept + ".com"; 
	}
	
	private String genratePassword(int length)
	{
		Random r = new Random(); 
	    String alphabet = "qwertyuiopasdfghjklzxcvbnm";
	    String capital = "abcdefghijklmnopqrstuvwxyz"; 
	    String number = "1234567890"; 
	    String values = alphabet + capital + number; 
	    String password = ""; 
	    
	    for(int i=0; i<length; i++)
	    {
	    	password += values.charAt(r.nextInt(values.length())); 
	    }
	    return password; 
		
	}
	
	//Changing the password
	public void setPassword()
	{
    	boolean flag = false; 

		do
		{
			System.out.println("Do you want to change your password? (Y?N)");
			char choice = input.next().charAt(0); //if the user enter "yes" or "no", the charAt(0) will only take the first letter
			
			if(choice == 'Y' || choice == 'y')
			{
				flag = true; //when flag is true, it will stop the do while loop
				System.out.println("Enter current password: ");
				String tempPassword = input.next(); 
				if(tempPassword.equals(this.password))
				{
					System.out.println("Enter a new password: ");
					this.password = input.next(); 
					System.out.println("Password changed successfuly: ");
				}
				else System.out.println("Password is innocrrect");
			}
			else if(choice == 'N' || choice == 'n')
			{
				flag = true; 
				System.out.println("Password was not changed.");
			}
			else System.out.println("Enter a valid choice.");
		}while(!flag); 

	}
	
	public double setAverage()
	{ 
		System.out.println("Enter your three test grades");
		g1=input.nextInt(); 
		g2=input.nextInt(); 
		g3=input.nextInt(); 

		double avg = (g1 + g2 + g3)/3; 
		if(avg <= 50) System.out.println("Student has failed the class");
		else System.out.println("Student has passed with an average of: " + avg);
		return avg; 
	}
	
	public String setDept()
	{
		System.out.println("Departments: \n1. Mathamatics \n2 Computer Science \n3. Physics \n4 Non-Matriculated");
		boolean flag = false; //using this flag because you want to do while loop to execute again and again. 
		
		System.out.println("Enter department code");
		int choice = input.nextInt(); 
		
		//Using do while loop because you want it to execute at least one time
		do
		{
			switch(choice)
			{
			case 1: return "Mathamatics";
			case 2: return "Computer Science"; 
			case 3: return "Physics"; 
			case 4: return "Non-Matriculated"; 
            default: System.out.println("Invalid choice. Please choose it again.");
			}
		}while(!flag); return null; //!flag <== ! negates flag 
		
	}
	
	public void getInfo()
	{
		System.out.println("New " + this.firstName + "" + this.lastName);
		System.out.println("Email: " + this.email);
		System.out.println("Password: " + this.password);
    	System.out.println("Department: " + this.dept);

	}
	

}
















