
public class ArrayLect
{

	public static void main(String[] args) 
	{
		int num[] = new int[5];               // Size of an array = 5, 
		System.out.println(num);
//		System.out.println(num[2]);
		int i;
		for(i=0;i<5;i++)
			System.out.println(num[i]);         // by default 0
		System.out.println();
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		
		for(i=0;i<5;i++)
			System.out.println(num[i]);
		System.out.println();
		
		int num1[] = {1,2,3,4};
		
		for(i=0;i<4;i++)
			System.out.println(num1[i]);

	}

}
