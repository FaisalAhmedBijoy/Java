package multithreadingdemo;

import java.util.*;


public class Multiplication implements Runnable {
	
    public static int n1 , m1, n2, m2, row , column;
	
	public static int  mat1[][], mat2[][], results[][],sum=0;
	
	public Multiplication(int r,int c)
	{
		row = r;
		column = c;
	}
	public Multiplication()
	{
		
	}
	public void inputMatrix(int nr,int mc,int nnr,int mmc)
	{
		 Scanner sc = new Scanner(System.in);
		 
		n1 = nr;
		m1 = mc;
		n2 = nnr;
		m2 = mmc;
		 
		 mat1 = new int[n1][m1];
		 System.out.println("Enter the element of first matrix : ");
		 for(int i=0;i<n1;i++)
		 {
			 for(int j=0;j<m1;j++)
			 {
				 mat1[i][j] = sc.nextInt();
			 }
		 }
		 
		
		 
		 mat2 = new int[n2][m2];
		 System.out.println("Enter the element of second matrix : ");
		 for(int i=0;i<n2;i++)
		 {
			 for(int j=0;j<m2;j++)
			 {
				 mat2[i][j] = sc.nextInt();
			 }
		 }
		 results = new int[n1][m2];	 
		 sc.close();
	}
	
	@Override
	public void run() {
		sum=0;
		
		for(int i =0;i<m1;i++)
		{
			sum+= mat1[row][i]*mat2[i][column];
		}
		results[row][column] = sum;
	}
	
	public void printResult()
	{
		int i,j;
		System.out.println("Result matrix multiplication :  ");
		for(i=0;i<n1;i++)
		{
			for(j=0;j<m2;j++)
			{
				System.out.print(results[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
