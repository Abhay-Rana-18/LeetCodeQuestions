import java.util.Scanner;
import java.util.Random;

public class Guess_Number {
    public static int guessNumber(int n){
        int start = 0;
        int end = n;
        int mid;
        while (start<= end){
            mid = start + (end-start)/2;
            int result = guess(mid);
            if (result == -1){
                end = mid - 1;
            } else if(result == 1){
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return -1;
    }

    public static int guess(int n){
        int guessNum = 1;
        if (n<guessNum){
            return 1;
        }
        else if(n>guessNum){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();

        // Create an instance of the Random class
        Random rand = new Random();

        // Generate a random number between 1 and 'n'
        int randomNumber = rand.nextInt(n) + 1;

        System.out.println(guessNumber(n));
    }
}
