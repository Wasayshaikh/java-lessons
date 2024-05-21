public class PolymorphicChildTwo extends PolymorphicParent{
    @Override
    public String overriding_method(){
        return  "Over ride method in class two";
    }

    public String overloading_method(String over){
        return "method overloading in "+over +"class";
    }
}
