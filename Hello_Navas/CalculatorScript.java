 package Hello_Navas;
import java.util.Scanner;

public class CalculatorScript {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenheit to Celcius (1) or Celcius to Fahrenheit (2)");
        int result = scan.nextInt();

        if (result == 1){
            //calculate fahrenheit to celcius

            System.out.println("You have chosen FAHRENHEIT to CELCIUS");
            System.out.println("Enter Fahrenheit value: ");
            double value = scan.nextDouble();
            double valueFinal = (value - 32) * 5/9;
            System.out.print("Celcius is: ");
            System.out.println(Math.round(valueFinal*10.0)/10.0);


        } else if (result == 2){
            //calculate celcius to farenheit

            System.out.println("You have chosen CELCIUS to FAHRENHEIT");
            System.out.println("Enter Celcius value: ");
            double value2 = scan.nextDouble();
            double finalResult = (value2 * 1.8 + 32);
            System.out.print("Fahrenheit is: ");
            System.out.println(Math.round(finalResult*10.0)/10.0);
        } else {
            //Any number that is not 1 or 2
            System.out.println("Not a valid choice");
        }
    }
    
}
