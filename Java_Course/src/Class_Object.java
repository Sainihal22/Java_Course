class calc
{
	int n1=5,n2=4,res=0;
	
	public void perform()
	{
		res = n1 + n2;
	}
}


public class Class_Object 
{
	public static void main(String[] args)
	{
		calc obj;           // reference
		obj = new calc();  
		obj.perform();
		System.out.println(obj.res);
		obj.n1 = 7;
		obj.n2 = 5;
		obj.perform();
		System.out.println(obj.res);
		
	}

}
