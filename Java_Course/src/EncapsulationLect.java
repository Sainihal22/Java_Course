class StudentEnc
{
	private int rollno;
	private String Name;
	
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	public String getName() 
	{
		return Name;
	}
	public void setName(String name) 
	{
		Name = name;
	}
	
	// getters and setters
	
//	public void setRollnoName(int rollno,String Name)
//	{
//		this.rollno = rollno;
//		this.Name = Name;
//	}
//	
//	public String getRollnoName()
//	{
//		String rno = Integer.toString(rollno);
//		return (rno + " " + Name);
//	}
//	
	
}

public class EncapsulationLect 
{

	public static void main(String[] args) 
	{
		StudentEnc s1 = new StudentEnc();
//		s1.rollno = 5;     not appropriate way to define variables
//		s1.Name = "Nihal";
		
		s1.setRollno(5);
		System.out.println(s1.getRollno());
		
		s1.setName("Nihal"); 
//		s1.rollno = 5;             The field StudentEnc.rollno is not visible
		System.out.println(s1.getName());

	}

}
