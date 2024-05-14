import java.util.Scanner;

public class UserInputs {
    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userInput = scanner.nextLine();
        System.out.print("What is your age? ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("What programming language you are learning right now? ");
        String programingLanguage = scanner.nextLine();

        System.out.printf("Hi I am %s, I am %d years old. And right now I am learning %s",userInput,age,programingLanguage);

        scanner.close();

    }
}
