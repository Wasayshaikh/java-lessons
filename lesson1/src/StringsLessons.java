public class StringsLessons {

    public static void main(String[] args){
        String name = "Abdul Wasay Shaikh";
        String sentence = "The sky is red";
        System.out.println("Using Formated String method");
        String FormattedString = String.format("Hi My name is %s and I am %d years old. ",name,24);
        System.out.println(FormattedString);
        System.out.println();

        System.out.println("Method used after defining String");
        System.out.println("Getting String Length= " + name.length());
        System.out.println("Is string Empty= " + name.isEmpty());
        System.out.println("String replace= "+ sentence.replace("red","blue"));
        System.out.println("Does string contain certain word="+ name.contains("Wasay"));
        System.out.println("String to Uppercase= "+ name.toUpperCase());
        System.out.println("String to Lowercase="+ name.toLowerCase());


        System.out.println();
        System.out.println("new key word to define string");
        String newName = new String("abc");
        String newName2 = new String("abc");
        String newName3 = new String("ABC");

        System.out.println("Comparing object String with= " +newName == newName2);
        System.out.println("Comparing object String= "+ newName.equals(newName2));
        System.out.println("Comparing object String with different case using equals method= "+ newName.equals(newName3));
        System.out.println("Comparing object String with different case using equalsIgnoreCase method= "+ newName.equalsIgnoreCase(newName3));
    }
}
