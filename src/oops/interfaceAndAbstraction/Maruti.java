package oops.interfaceAndAbstraction;

public class Maruti implements CarStructure{

    String baseColour="black";

    @Override
    public void stearing() {

    }

    @Override
    public void handBreak() {

    }

    @Override
    public void gearBox() {
        System.out.println(CarStructure.baseColour);


    }

    public void sunroof(){

    }

    // single line comment
    /*
    multiline comment
     */
/*
    *//**
     * method is used to calculate thios isdfmgdfg
     * @param i = i is passed because I is user
     * @return i user ame ka name de dega
     */
    public String method(int i){return "sdfd";}


    public static void main(String[] args) {
        // class name = sagya methods anto tya class chya
        CarStructure carStructure= new Maruti();
        Maruti maruti=new Maruti();
        maruti.sunroof();



    }

}
