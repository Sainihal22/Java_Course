class Student
{
	int rno;
	String Name;
	
	public void disp()
	{
		System.out.println(rno+" "+Name+" ");
	}
	
}

public class ClassArray 
{

	public static void main(String[] args) 
	{
//		Student s[] = new Student[4];
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s[] = {s1,s2,s3,s4};
		
		
		
		s1.rno = 1;
		s2.rno = 2;
		s3.rno = 3;
		s4.rno = 4;
		
		s1.Name = "Nihal";
		s2.Name = "Nikita";
		s3.Name = "Abhinav";
		s4.Name = "Golu";
		
		for(int i=0;i<4;i++)
			s[i].disp();
	}

}
