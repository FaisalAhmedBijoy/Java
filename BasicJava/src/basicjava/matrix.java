
package basicjava;

import java.util.Scanner;


public class matrix {
    public static void main(String[] args) {
        System.out.println("Enter A");
        int [][] A =new int [3][3] ;
        int [][] B = new int [3][3] ;
        int row=3 ,col=3;
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                A[i][j] =input.nextInt() ;
            }
            
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(" " +A[i][j])  ;
            }
            System.out.println(" ");
            
        }
        
    } 
    
}
