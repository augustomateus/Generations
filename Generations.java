
package generations;
import java.util.Scanner;
/**
 *
 * @author Mateus Augusto
 */
public class Generations {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Type the year you were born:");
       int year = sc.nextInt();
       if (year >= 2010){
           System.out.println("You belong to Generation Alpha"); 
    } else if (year >= 2000 && year < 2010){
        System.out.println("You belong to Gen Z!");
    }
     else if (year >= 1980 && year < 2000){
    System.out.println("You belong to Generation Y!");
    } else if (year >= 1965 && year < 1980){
       System.out.println("You belong to generation X");
    } else if (year >= 1946 && year <= 1964){
    System.out.println("You belong to the Baby Boomers generation");
} else { 
    System.out.println("Type your true year of bith");
            }
    }
    
