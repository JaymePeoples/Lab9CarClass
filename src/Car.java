/**
 * Created by jayme on 7/17/2017.
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    public Car (){//blank constructor

    }

    public Car(String make, String model, int year, double price) {
        this.make = make;//this is a reference to a current object whose method or constructor is being invoked
        this.model = model;
        this.year = year;
        this.price = price;
    } //represents a car object do not enter any other information

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return make +  model + year + price + "\n";


    }

}
