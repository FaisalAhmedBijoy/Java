
package arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int size, sum = 0;
        System.out.println("Enter the Elements Number ");
        size = input.nextInt();
        int x;
        int[] num = new int[size];
        System.out.println("Enter The Elements ");
        for (int i = 0; i < size; i++) {
            x = input.nextInt();
            num[i] = x;
            sum = sum + x;

        }

        System.out.println("Array Values ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
        Arrays.sort(num);
        System.out.println("Array Values by sorted");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }

        System.out.println("Sum is : " + sum);
        System.out.println("Avg is : " + sum / size);

        String[] name = {"Faisal", "Ahmed", "Bijoy", "Abir ", "Hasan", "Joy"};

        System.out.println("String Array values ");
        for (int i = 0; i < name.length; i++) {
            System.out.println(" " + name[i]);
        }
        Arrays.sort(name);
        System.out.println("String Sort Ascending : ");
        for (int i = 0; i < name.length; i++) {
            System.out.println(" " + name[i]);
        }
        System.out.println("\nDescending : ");
        for (int i = name.length -1; i >=0 ; i--) {
            System.out.println(" "+name[i]);
            
        }
        
       
    }
    
}