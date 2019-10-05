/*
 * Date
 * Time 
 * Random Number 
 */
package javabeginner;

import java.util.Random;




public class DateTimeRandom {

    public static void main(String[] args) {
        // Date 
        /*
         Date date =new Date() ;
         System.out.println(date);
        
         DateFormat dateFormat =new SimpleDateFormat ("dd / MM / YYYY") ;
         String CurrentDate = dateFormat.format(date) ;
         System.out.println(CurrentDate);
         */
        //Time
        //LocalTime time = LocalTime.now();
        //System.out.println(time);
        
        Random rand =new Random() ;
        int randNumber =rand.nextInt(10) ;
        System.out.println(" "); 
        System.out.println("Random Number : "+rand);
        
       // int randomNumber = (int ) (Math.random() *10) +1 ;
        //System.out.println("Random Number : "+randomNumber); 
        
        

    }

}
