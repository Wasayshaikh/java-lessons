import java.util.HashMap;

public class HashMapLesson {
    public  static void main(String[] args){
        HashMap<String, Integer> examResult = new HashMap<String, Integer>();
        examResult.put("Math", 75);
        examResult.put("Chemistry", 85);
        examResult.put("Computer Programming", 92);
        examResult.put("Physics",85);

        System.out.println(examResult.toString());

        System.out.println("Replace Value");
        examResult.replace("Chemistry",80);
        System.out.println(examResult.toString());

        System.out.println("Getting one value of Hashmap");
        System.out.println(examResult.get("Math"));
        System.out.println("get function return null if key not exist in Hashmap return null");
        System.out.println(examResult.get("English"));

        System.out.println("If key not exist get default value using getOrDefault");
        System.out.println(examResult.getOrDefault("English",-1));

        System.out.println("If key not exist add value");
        examResult.putIfAbsent("English",70);
        System.out.println(examResult.toString());

        System.out.println("Remove key from HashMap");
        examResult.remove("English");
        System.out.println(examResult.toString());

        System.out.println("Loop through HashMap Using ForEach Loop");
        examResult.forEach((subject,value)->{
            examResult.replace(subject,value +5);
        });
        System.out.println(examResult.toString());

        System.out.println("If value exist");
        System.out.println(examResult.containsValue(85));
        System.out.println(examResult.containsValue(100));


        System.out.println("If key exist");
        System.out.println(examResult.containsKey("Chemistry"));
        System.out.println(examResult.containsKey("English"));

        System.out.println("Get all values");
        System.out.println(examResult.values());


        System.out.println("Get all keys");
        System.out.println(examResult.keySet());

        System.out.println("Check if hashMap is empty");
        System.out.println(examResult.isEmpty());

        System.out.println("Loop through the hash map");
        examResult.clear();
        System.out.println(examResult.toString());

    }
}
