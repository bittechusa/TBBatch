import org.junit.Test;


public class ArrayPractice 
{
	@Test
	public void m1()
	{int a=7;
	
	//int [] a;//declaration phase
	//int[] a1=new int[5];//constructor phase
	int [] a3={4,6,83,6,9,45};//initialization phase
	int [] b={10,20,30,40};
	int [] max={32,65,35,97,45};
	int moga=max[0];
	System.out.println(a3.length);
	
	for(int i=0;i<a3.length;i++)
	{
		System.out.println(a3[i]);
	}//end of a3 array
	for(int j=0;j<b.length;j++)
	{
		if(b[j]>20)
		{
			System.out.println(b[j]);
			
			
		}
		break;
		
		
	}//end of b array
	for(int k=1;k<max.length;k++)
	{
		if(max[k]>moga)
		{
			moga=max[k];
			
		}
		
	}
	System.out.println(moga);
	
	}
	@Test
	public void m2()
	{
		int [][] x=new int [2][2];
		//int [][] x1={4,5,6,7};
		x[0][0]=4;
		x[0][1]=6;
		x[1][0]=8;
		x[1][1]=5;
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x.length;j++)
			{
			System.out.println(x[i][j]);
			}
		}
		
	}//end of m2
	@Test
	public void fabinacci()
	{
		int x=0;
		int y=1;
		for(int i=1;i<=10;i++)
		{
			x=x+y;//1,1,2,3,5
			y=x-y;//0,1,1,2,3
			System.out.println(x);//1,1,2,3
		}
	}
}
