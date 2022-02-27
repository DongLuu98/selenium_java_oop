import java.util.Scanner;

public class Lab_022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int number = scanner.nextInt();
        if (number%2 ==0){
            System.out.println("This is an even number");
        } else if (number%2 != 0){
            System.out.println("This is an odd number");
        }
    }
}
