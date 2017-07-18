import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jayme on 7/17/2017.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scnr = new Scanner (System.in);
        int numOfCars;

        System.out.println("How many cars are you entering? ");
        numOfCars = scnr.nextInt();
        scnr.nextLine();

        ArrayList<Car> carList = new ArrayList<>(numOfCars);//specifies number of cars otherwise default is 10

        for(int i = 0; i < numOfCars; i++){
            Car car = new Car();//car object
            System.out.println("Enter the make of the car: ");
            String make = scnr.nextLine();
            car.setMake(make);
            System.out.println("Enter the model of the car: ");
            String model = scnr.nextLine();
            car.setModel(model);
            System.out.println("Enter Year: ");
            int year = scnr.nextInt();
            car.setYear(year);
            System.out.println("Enter Price: ");
            double price = scnr.nextDouble();
            car.setPrice(price);
            scnr.nextLine();

            carList.add(i, car);

        }
            System.out.println(carList.toString());
        }


    }

