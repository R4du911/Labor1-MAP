import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter numbers:");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();

        int sum = 0;
        int ct = 0;

        while(number != 0){
            sum+=number;
            ct++;
            number = keyboard.nextInt();
        }

        System.out.println(sum/ct);
    }
}