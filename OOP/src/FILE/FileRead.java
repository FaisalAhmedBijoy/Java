package FILE;

import java.io.File;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) {

        try {
            File file = new File("Student.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String name ;
                 String id ;
                name=scanner.next() ;
                id=scanner.next() ;
                System.out.println("Name : "+name +"ID : "+id);

            }
            file.close() ;
            
        }
        catch(Exception e )
        {
            System.out.println("Exaception "+e);
        }
    }

}
