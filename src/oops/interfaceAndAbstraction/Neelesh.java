package oops.interfaceAndAbstraction;

public class Neelesh extends LaxmanAndTapan {
    @Override
    public void bugAnalysis() {
        System.out.println("analysis kartoe");
    }

    @Override
    public void testing() {

    }

    public static void main(String[] args) {
      LaxmanAndTapan laxmanAndTapan= new Neelesh();

    }
}
