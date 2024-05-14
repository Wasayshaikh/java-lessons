public class Loops {
    public  static  void  main(String[] args){
        int limit = 10;
        System.out.println("For Loop");
        for (int x = 0; x < 10; x++){
            System.out.println("Value of x= "+ x);
        }
        System.out.println();
        System.out.println("While Loop");
        while(limit < 20){
            System.out.println("Value of x= "+ limit);
            limit++;
        }
        System.out.println();
        System.out.println("Do While Loop");
        do {
            System.out.println("Value of x= "+ limit);
            limit++;
        }
        while (limit < 30);

        System.out.println();
        System.out.println("Do While Loop if range is already false, so iterate will always run ");
        do {
            System.out.println("Value of x= "+ limit);
            limit++;
        }
        while (limit < 30);
    }

}
