import java.util.Scanner;

     public class positiveOrNegative{

          public static void main(String[]args) {

               Scanner input = new Scanner(System.in);

               int number;

               System.out.print("Enter a Number:");
               number= input.nextInt();

               if (number>0) {

               System.out.println("The number is Positive.");

               }else if (number<0) {
               
               System.out.println("The number is Negative.");

               }else {

               System.out.println("The number is Zero.");

               }


       }

}        
      