import java.util.Scanner;

public class Lab_021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height");
        float height = scanner.nextFloat();

        System.out.println("Please enter your height");
        float weight = scanner.nextFloat();

        float BMI = (weight)/(height*2);

        if (BMI < 18.5)
        {
            System.out.printf("Your BMI is: %f  - Underweight", BMI);
        } else if (BMI >= 18.5 && BMI < 24.9){
            System.out.printf("Your BMI is: %f  - Normal weight", BMI);
        } else if (BMI >= 25 && BMI <=29.9){
            System.out.printf("Your BMI is: %f  - Overweight", BMI);
        } else{
            System.out.printf("Your BMI is: %f  - Obesity", BMI);
        }

    }
}
