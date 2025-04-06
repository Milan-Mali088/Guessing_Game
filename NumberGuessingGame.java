import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome To Guessing Numbers Game ");
        System.out.println("Selecet Deficulty Level : ");
        System.out.println("1. Easy(1-10 , 5 attempts)");
        System.out.println("2. Medium(1-50 , 7 attempts)");
        System.out.println("3. Hard(1-100 , 9 attempts)");

        int choice = scanner.nextInt();
        int MaxNumber = 0 , MaxAttempts = 0;

        switch (choice) {
            case 1:
                MaxNumber = 10;
                MaxAttempts = 5;
                break;
            
            case 2:
                MaxNumber = 50;
                MaxAttempts = 7;
                break;
            
            case 3:
                MaxNumber = 100;
                MaxAttempts = 9;

            default:
                System.out.println("You Entered Invalid Input!! As a default set Easy level");
                MaxNumber = 10;
                MaxAttempts = 5;
        }
        int CorrectNumber = random.nextInt(MaxNumber)+1;
        int attempt = 0;
        boolean GuessedCurrectly = false;

        System.out.println("Guess the Number Between 1 and "+MaxNumber);

        while(attempt<MaxAttempts){
            System.out.println("Enter Your Guess : ");
            int Guess = scanner.nextInt();
            attempt++;

            if(Guess == CorrectNumber){
                System.out.println("Congratulation You Won Game in "+attempt+" attempts");
                GuessedCurrectly = true;
            }
            else if(Guess < CorrectNumber){
                System.out.println("Too low!! Guess Again.");
            }
            else{
                System.out.println("Too High!! Guess Again.");
            }
        }
        if(!GuessedCurrectly){
            System.out.println("Sorry! You Passed All attempts Right Answer is "+CorrectNumber);
        }
        scanner.close();
    }
}
