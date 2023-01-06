class one
{
//	int i;
	public void show() 
	{
//		System.out.println(i);
		System.out.println("In One");

	}
	
//	public void config()
//	{
//		System.out.println("In A Config");
//	}
}

class two extends one
{
//	@Override
//	int i;
	public void show() 
	{
//		super.i=8;
//		super.show();
//		System.out.println(i);
		System.out.println("In Two");

	}
}

class three extends one
{
	public void show()
	{
		System.out.println("In C");
	}
}

public class OverridingLect 
{

	public static void main(String[] args) 
	{
//		two obj1 = new two();
		one obj1 = new two();           // runtime polymorphism
		obj1.show();
//		obj1.config();
		
		obj1 = new three();
		obj1.show();

	}

}
