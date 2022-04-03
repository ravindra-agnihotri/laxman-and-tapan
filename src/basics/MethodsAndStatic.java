package basics;

public class MethodsAndStatic {

    //public - access specifier static - static/methods
    // void(nothing returning)- return type
    // method name- what ever your method is supposed tpo do
    //() - parameter space  {}- body
    public static void methodName(){

    }



//static and nonstatic

    public static boolean mixer(String fruit){
        String juice= fruit + " juice ban gaya";
        boolean number= true;
        return number;


    }

    public static void main(String[] args) {
        System.out.println( mixer("ornage"));
    }

    //----------------------------------------------------------------------------------------
    public static String name= "laxman";


    public String chotaBhau="Amit";
    public String chotaBhau1="Amit";
    public String chotaBhau2="Amit";
    public String chotaBhau3="Amit";

    public static void motherLoka(){
        System.out.println(name);
        MethodsAndStatic methodsAndStatic= new MethodsAndStatic();
        /*methodsAndStatic.chotaBhau;*/

    }

    public void lahanLoka(){
        System.out.println(chotaBhau);
        System.out.println(name);
    }
}
