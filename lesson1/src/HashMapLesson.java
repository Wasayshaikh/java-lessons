import java.util.HashMap;

public class HashMapLesson {
    public  static void main(String[] args){
        HashMap<String, Integer> examResult = new HashMap<String, Integer>();
        examResult.put("Math", 75);
        examResult.put("Chemistry", 85);
        examResult.put("Computer Programming", 92);
        examResult.put("Physics",85);

        System.out.println(examResult.toString());
        

    }
}
