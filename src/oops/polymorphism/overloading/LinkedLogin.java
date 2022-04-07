package oops.polymorphism.overloading;

public class LinkedLogin {

    //having methods with same name and different parameters


    public static void login(String username, String password){
        //hgjkkkljkasda

    }


    public static void login(int googleToken){
        System.out.println("Login with google token");
    }

    public static String login(String apple){
String a="asas";
        return a;
    }

    public static void main(String[] args) {
        login("asd");
        login("asssa","sadad");
    }

}
