

public class Car {
    private int numberOfWheels;
    private String colour;
    private int number = 1;

    public Car(int nWheels, String colour){
        this.colour = colour;
        zoom();
    }

    private void zoom(){
        System.out.println("Zoooom");
    }

    public int getNumber() {
        return number;
    }

    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    public String getColour() {
        return colour;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
