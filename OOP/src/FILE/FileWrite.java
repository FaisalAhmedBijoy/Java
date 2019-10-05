package FILE;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileWrite {

    public static void main(String[] args) {
        try {

            Formatter formatter;
            formatter = new Formatter("Student.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter The Student Number ");
            int num = input.nextInt();
            String name;
            int id;

            for (int i = 0; i < num; i++) {
                System.out.print("Enter Name & ID : ");
                name = input.next();
                id = input.nextInt();
                formatter.format("%s %s\r\n", name, id);

                
            }
            formatter.close();

        }
        catch (Exception e ) {
            System.out.println("Exception : " + e);
        }

    }

    /*}*/
