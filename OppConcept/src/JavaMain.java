public class JavaMain {
    public static void main(String[] args){
            ChildClass child = new ChildClass();
            child.childSpeak();
            child.speak();
            WorkAbstraction abstraction = new WorkAbstraction();
            abstraction.abstract_method();
            abstraction.working_method_in_abstract();
            OverloadingClass over = new OverloadingClass();
            System.out.println(over.over_method());
            System.out.println(over.loading("Same name different parameter for method overloading"));
            PolymorphicParent childOne = new PolymorphicChildOne();
            PolymorphicParent childTwo = new PolymorphicChildTwo();
            combining_ploymorphic(childTwo);
            combining_ploymorphic(childOne);
            PolymorphicChildOne child_one = new PolymorphicChildOne();
            PolymorphicChildTwo child_two = new PolymorphicChildTwo();
            System.out.println();
            System.out.println(child_one.overloading_method());
            System.out.println(child_one.overloading_method("child_one "));
            System.out.println(child_two.overloading_method());
            System.out.println(child_two.overloading_method("child_two "));

    }
    public static void combining_ploymorphic(PolymorphicParent poly){
        System.out.println(poly.overriding_method());
        System.out.println(poly.overloading_method());


    }
}
