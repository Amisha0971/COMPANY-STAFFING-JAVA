import java.util.Scanner;

public class Company {
    String name;
    double salary;
    String date;
    Scanner sc=new Scanner(System.in);
    static	Company c=new Company();
       public void data() 
		{
    	
		 System.out.println("Enter name:");
		 c.name=sc.next();
		 System.out.println("Enter salary:");
		 c.salary=sc.nextDouble();
		 System.out.println("Enter date of joining:");
		 c.date=sc.next();
		
		}
       public void display() 
       {
    	   System.out.println("Name:" +c.name);
    	   System.out.println("Salary:" +c.salary);
    	   System.out.println("Date of joining:" +c.date);
       }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Company c[];
		int n = 0;
		System.out.println("*****||COMPANY DETAILS||*****");
		System.out.println("**||MENU||**");
		System.out.println("1.ADD DATA");
		System.out.println("2.DISPLAY DATA");
		 System.out.println("_________________");
		System.out.println("Enter No Of Employees");
		n=s.nextInt();
		c=new Company[n];
		System.out.println("----EMPLOYEE DATA---- " );
	  
		for(int i=0;i<c.length;i++)
		{
			c[i]=new Company();
			c[i].data();
			System.out.println("----DISPLAY DETAILS----");
			c[i].display();
		    System.out.println("_________________");
		}
	}

}
