package FILE;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {
        // System.out.println("");

        File dir = new File("Person");
        dir.mkdir();
        System.out.println("Location " + dir.getAbsolutePath());
        if (dir.delete()) {
            System.out.println("File Delete");
            System.out.println("Name " + dir.getName());
        }

        File f1 = new File("Teacher.txt");
        File f2 = new File("Student.txt");

        try {
            f1.createNewFile();
            f2.createNewFile();
            System.out.println("File Created");
        } catch (Exception e) {
            System.out.println("Exception Occur :" + e);
        }
        System.out.println("File 1 Location" + f1.getAbsolutePath());
        System.out.println("File 2 Name  :" + f2.getName());
        f1.delete();
        if (f1.exists()) {
            System.out.println("F1 exist");
        } else {
            System.out.println("F1 Delete");
        }

    }
}
