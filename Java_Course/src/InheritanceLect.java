// Single Inheritance, Multilevel Inheritance

class Calculator                  // Super
{
	public int add(int i, int j)
	{
		return i+j;
	}
}

class CalcAdv extends Calculator      // Sub
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}

class CalcveryAdv extends CalcAdv
{
	public int multi(int a, int b)
	{
		return a*b;
	}
}


public class InheritanceLect 
{

	public static void main(String[] args) 
	{
		CalcveryAdv obj = new CalcveryAdv();
		System.out.println(obj.add(3, 4));
		System.out.println(obj.sub(6, 3));
		System.out.println(obj.multi(6, 3));

	}

}
