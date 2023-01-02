class outer
{
	int a;
	public void show()
	{
		System.out.println("In Show");
	}
	
	class inner
	{
		public void display()
		{
			System.out.println("In Display");
		}
	}
	
	static class newinner
	{
		public void disp()
		{
			System.out.println("In Disp");
		}
	}
}

public class InnerClass 
{

	public static void main(String[] args) 
	{
		outer obj = new outer();
		obj.show();
		
		outer.inner obj1 = obj.new inner();
		obj1.display();
		
		outer.newinner obj2 = new outer.newinner();
		obj2.disp();
		
	}

}
