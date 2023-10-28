import java.util.Scanner; 
 
public class SimpleInterestCalculator { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        // Input principal amount 
        System.out.print("Enter the principal amount: ");
           double principal = scanner.nextDouble(); 
 
        // Input annual interest rate 
        System.out.print("Enter the annual interest rate (in %): "); 
        double rate = scanner.nextDouble(); 
 
        // Input time in years
          System.out.print("Enter the time (in years): "); 
        double time = scanner.nextDouble(); 
 
        // Calculate simple interest 
        double simpleInterest = (principal * rate * time) / 100; 
 
        // Display the result 
        System.out.println("Simple Interest: " + simpleInterest);
           scanner.close(); 
    } 
} 
 
