package multithreadingdemo;

import java.util.*;

public class main_thread {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d,i,j;
		System.out.println("Enter the first matrix row and column : ");
		
		 a = sc.nextInt();
		 
		b = sc.nextInt();
		
		 System.out.println("Enter the Second matrix row and column : ");
		 
		 c = sc.nextInt();
		 
		 d = sc.nextInt();
		 sc.close();
		 Multiplication obInput = new Multiplication();
		 
		 obInput.inputMatrix(a,b, c,d);
		 
		 for( i=0;i<a;i++)
		 {
			 for(j=0;j<d;j++)
			 {
				Multiplication ob  = new Multiplication(i,j);
				Thread t = new Thread(ob,"child");
				
				//Thread t1 = new Thread()
				t.start();
				
				try {
					t.join();
				} catch (InterruptedException e) {
					
					System.out.println("exception catch");
				}
				
			 }
		 }
		 
		 obInput.printResult();
	}
}
