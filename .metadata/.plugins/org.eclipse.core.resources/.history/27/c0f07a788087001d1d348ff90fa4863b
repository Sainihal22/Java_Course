class lect
{
	int n1,n2,res;
	
	public lect()
	{
		n1 = 10;
		n2 = 20;
	}
	public lect(int num1,int num2)
	{
		n1 = num1;
		n2 = num2;
	}
	
	public int perform(int a, int b)
	{
		res = (n1+n2) * a + b;
		if(res>50)
			return 1;
		else
			return 0;
	}
	public void display()
	{
		System.out.println(n1+" "+n2+" "+res);
	}
}

public class Constructor_Lect {

	public static void main(String[] args) 
	{
		lect l = new lect();
		lect l1 = new lect(1,2);
//		l.n1=4;
//		l.n2=6;
		int k = l.perform(9, 4);
		l.display();
		System.out.println(k);
		
		int k1 = l1.perform(0, 0);
		l1.display();
		System.out.println(k1);
	}

}
