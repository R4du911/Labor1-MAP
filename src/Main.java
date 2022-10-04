import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter numbers:");
        Scanner keyboard = new Scanner(System.in);
        int myint = keyboard.nextInt();

        int sum = 0;
        int ct = 0;

        while(myint != 0){
            sum+=myint;
            ct++;
            myint = keyboard.nextInt();
        }

        System.out.println(sum/ct);
    }
}