import java.util.Arrays;

public class JavaArray {
    public  static  void main(String[] args){
        char characters[] = new char[3];
        characters[0] = 'a';
        characters[1] = 'b';
        characters[2] = 'c';
        System.out.println(Arrays.toString(characters));
        char newCharacter[] = characters;
        characters[1] = 'd';
        System.out.println("After changes of characters array index 1 array becomes= "+Arrays.toString(characters) );
        System.out.println("Changed the characters array now the value of newCharacter array is="+ Arrays.toString(newCharacter));

        char vowels[] = {'a','e','i','o','u'};
        System.out.println("Using Arrays.copyOf method to copy array=");
        char newVowels[] = Arrays.copyOf(vowels, vowels.length);
        System.out.println(Arrays.toString(vowels));
        System.out.println(Arrays.toString(newVowels));

        vowels[2] = 'b';
        System.out.println("After changes of vowels array index  2 array becomes= "+Arrays.toString(vowels) );
        System.out.println("Changed the characters array now the value of newVowels array is="+ Arrays.toString(newVowels));

        System.out.println("Using Arrays.copyOfRange method to copy array with range of indexes =");
        char newVowelsRange[] = Arrays.copyOfRange(vowels,2,5);
        System.out.println(Arrays.toString(vowels));
        System.out.println(Arrays.toString(newVowelsRange));


        int numbers[] = {5,6,1,4,3,9,8};
        Arrays.sort(numbers);
        System.out.println("Sorting array= "+ Arrays.toString(numbers));

        int numbers2[] = {5,6,1,3,4,9,8,2};
        Arrays.sort(numbers2,3,5);
        System.out.println("Sorting array with range of indexes= "+ Arrays.toString(numbers2));
        System.out.println("Using Array.fill to fill array with value");
        Arrays.fill(numbers2,1);
        System.out.println(Arrays.toString(numbers2));

        System.out.println("Using Array.fill to fill array with value range of index");
        Arrays.fill(numbers,2,5,1);
        System.out.println(Arrays.toString(numbers));

        System.out.println("Copy array numbers in large length of array");
        int numbersLarge[] = Arrays.copyOf(numbers2,15);
        System.out.println(Arrays.toString(numbersLarge));

        int indexValue =Arrays.binarySearch(vowels,'b');
        System.out.println("Using Binary search to search array");
        System.out.println(indexValue);

        int newIndex = Arrays.binarySearch(vowels,2,3,'a');
        System.out.println("Using Binary search to search array with range of indexes");
        System.out.println(newIndex);

        System.out.println("Comparing Array using == sign it will come as true because both array is pointing to same memory because of array1 = array2 assigment to make the copy");
        System.out.println(newCharacter == characters);

        int numbers3[] = {5,6,1,4,3,9,8};
        int numbers4[] = {5,6,1,4,3,9,8};
        System.out.println("Comparing Array using == sign it will always come as false");
        System.out.println(numbers3 == numbers4);

        System.out.println("Comparing Array using Array.equals method it will come as true if values matches");
        System.out.println(Arrays.equals(numbers4,numbers3));







    }
}
