public class Processor {

    public Processor(){
        int aNumber;

        aNumber = sum(1, 2);

        System.out.println("I hit this");
    }

    public int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public String shout(){

        return "AHHH";
    }


    public void doNothing(){

    }
}
