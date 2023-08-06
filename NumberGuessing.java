import java.util.Scanner;
import java.lang.Math;

public class NumberGuessing 
{
    public static void main(String[] args)
    {
        int number=(int) (Math.random()*100)+1;
        int guess=5;
        boolean ans = false ;
          try (Scanner input = new Scanner(System.in)) {
            System.out.println("Hey player!!!!");
            System.out.println("Let's Start the game.....");
            System.out.println("I am guessing a number between 1 to 100 ");
            System.out.println("You have 5 chances to guess the number ");
                 while(guess>0)
            {
                System.out.println("\nEnter the number that you are guessing");
                int user_guess=input.nextInt();

                if(user_guess== number){
                    System.out.println("You guessed the right number\n Congratulations!!!!!!!");
                    ans= true;
                    break;
                    
                }
                else if(user_guess>number){
                    System.out.print("Wrong guess \n  The number is less than "+user_guess);
                    System.out.println("\nYou have "+(guess-1)+" chances left");
                    guess--;
                }
                else{
                    System.out.println("Wrong guess \n The number is greater than "+user_guess);
                    System.out.println("\n You have "+(guess-1)+" chances left");
                   guess--;
                }
               
                 
            }
        }
            if(ans==false){
            System.out.println("You ran out of chances \n You lose!");
            System.out.println("The number I guessed is "+number);
        }

    }   
}