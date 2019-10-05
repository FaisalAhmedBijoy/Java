package oop;

public class Teacher {

    String name, gender, phone;
    int id;
    /*
     void SetInformation (String a ,String b,String c ,int i){
     name=a ;
     gender= b ;
     phone=c ;
     id=i ;
     }
     */
     int square(int value) {
        return value * value;
    }

    Teacher() //No Parameter means Default Constructor
    {
        System.out.println("Default Constructor ");

    }

    Teacher(String a, String b, String c, int i) { //Constructor
        name = a;
        gender = b;
        phone = c;
        id = i;
    }

   

    Teacher(String a, String b, String c) {
        name = a;
        gender = b;
        phone = c;

    }

    void Display() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone : " + phone);
        System.out.println("ID : " + id);
        System.out.println();
    }
}
