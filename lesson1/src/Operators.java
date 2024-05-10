public class Operators {
    public  static  void  main(String[] args){
        System.out.println("arthematic  Operator");
        int add = 5+1;
        System.out.println("adding numbers using operator '+' "+ add);
        int sub = 5-3;
        System.out.println("subtracting number using operator '-' " +sub);
        int num1 = 12;
        int num2 = 6;
        int total = 12/6;
        System.out.println("division int numbers "+ total);
        double totalDoubleDivisor = 12/5.5;
        System.out.println("division int numbers "+ totalDoubleDivisor);
        double totalDoubleDividend = 12.5/5;
        System.out.println("division int numbers "+ totalDoubleDividend);
        int remainder = 12%5;
        System.out.println("Finding Remainder with % operator "+ remainder);


        System.out.println();
       // Assignment Operator with arthematic  Operator
        System.out.println("Assignment Operator with arthematic  Operator");
        int number = 5;

        number += 9;
        System.out.println("adding numbers using operator '+=' "+ number);
        number -= 2;
        System.out.println("subtracting number using operator '-=' " +number);
        number /= 2;
        System.out.println("division of numbers using operator '/=' "+ number);
        number %= 3;
        System.out.println("Finding Remainder with %= operator "+ number);


        System.out.println();
        // Relation Operators OR Conditional Operators
        System.out.println("Relation Operators OR Conditional Operators");
        int number1 = 5;
        int number2 = 8;
        //"both number is equal=  "+
        System.out.println(number1 == number2);
        //"both number1 is not equal=  "+
        System.out.println(number1 != number2);
        //"both number2 is less then number1  "+
        System.out.println(number1 > number2);
        //"both number2 is greater then number1 or  "+
        System.out.println(number1 < number2);
        //"both number2 is greater then or equal to number1 or  "+
        System.out.println(number1 <= number2);
        //"both number2 is less or equal to number1 or  "+
        System.out.println(number1 >= number2);


        System.out.println();

        //Logical Operator
        System.out.println("Logical Operator");

        int args1 = 1;
        int args2 = 15;
        //And Operator &&
        System.out.println(args1 > 5 && args2 < 10);
        boolean isStudent = true;
        boolean isTeacher = false;
        // OR operator ||
        System.out.println(isTeacher || isStudent);
        //NOT operator !
        System.out.println(!isTeacher || isStudent);


        System.out.println();

        //Increment Operator
        System.out.println("Increment/Decrement Operator");

        int incrementNumber = 5;
        System.out.println(incrementNumber++);
        System.out.println(incrementNumber--);


    }
}
