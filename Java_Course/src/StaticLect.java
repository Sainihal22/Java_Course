class Employee
{
	int eid;
	int sal;
	String ceo;
	
	public void display()
	{
		System.out.println("Emp ceo : " + ceo);
		System.out.println("Emp Id : " + eid);
		System.out.println("Emp Sal : " + sal);
	}
}

public class StaticLect 
{

	public static void main(String[] args) 
	{
		Employee Nihal = new Employee();
		Nihal.eid = 201900052;
		Nihal.sal = 70000;
		Nihal.ceo = "Mahesh";
		
		Employee Nikita = new Employee();
		Nikita.eid = 201900053;
		Nikita.sal = 50000;
		Nikita.ceo = "Mahesh";
		
		Nihal.display();
		System.out.println();
		Nikita.display();
	}

}
