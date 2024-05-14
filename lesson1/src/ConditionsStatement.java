import java.util.Scanner;

public class ConditionsStatement {
    public  static  void main(String[] args){
        double num2 = 0; double num1 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        try{
            num1 = Double.parseDouble(scanner.nextLine());
        }
        catch (NumberFormatException e){
            System.err.println("Error: Invalid input. Please enter a valid number.");
           System.exit(1);
        }

        System.out.print("Enter second number: ");
        try{
            num2 = Double.parseDouble(scanner.nextLine());
        }
        catch (NumberFormatException e){
            System.err.println("Error: Invalid input. Please enter a valid number.");
            System.exit(1);
        }

        System.out.print("What operation you want to run (sum, sub, mul, div): ");
        String operation = scanner.nextLine();

        if(operation.equals("sum")){
            System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
        } else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
        } else if (operation.equals("mul")) {
            System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
        } else if (operation.equals("div")) {
            if (num2 == 0){
                System.out.println("Number can not be divide by zero");
            }else{
                System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
            }
        }
        else{
            System.out.println("Entered operation is not in options");
        }
        System.out.println();
        System.out.println();
        System.out.println("Using Switch case for Condition");
        System.out.println();
        switch (operation){
            case "sum":
                System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", num1, num2, num1 * num2);
                break;
            case "div":
                if (num2 == 0){
                    System.out.println("Number can not be divide by zero");
                }else{
                    System.out.printf("%f / %f = %f", num1, num2, num1 / num2);
                }
                break;
            default:
                System.out.println("Entered operation is not in options");
                break;
        }
        scanner.close();

    }
}
