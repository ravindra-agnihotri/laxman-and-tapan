package oops.inheretnce;

public class Child extends Parent{

    public static String childSona="223";

    public static void main(String[] args) {
    Parent parent= new Parent();
        System.out.println(parent.sona);

    Child child= new Child();
        System.out.println(child.sona);

    }

    public void am(){}
}
