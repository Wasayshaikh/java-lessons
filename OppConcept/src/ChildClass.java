public class ChildClass extends ParentClass{
    public void childSpeak(){
        System.out.println("Child Speak");
    }
    @Override
    public void speak(){
        System.out.println("Child Over ride Speaks");
    }
}
