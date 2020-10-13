package Second;

import java.util.Scanner;

public class BaseConverter {
    protected double degreesCelsius;

    public BaseConverter(double degrees) {
        this.degreesCelsius = degrees;
    }

    public double convert(){
        Scanner in = new Scanner(System.in);
        double resultOfConvertion = degreesCelsius;
        int choice;
        do{
            System.out.println("Choose the temperature scale to which you want to convert Celsius degrees:\n" +
                    "1:Kelvin's\n" +
                    "2:Fahrenheit's\n" +
                    "3:Reaumur scale");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    resultOfConvertion = degreesCelsius + 273.15;
                    break;
                case 2:
                    resultOfConvertion = degreesCelsius * 1.8 + 32;
                    break;
                case 3:
                    resultOfConvertion = degreesCelsius * 0.8;
                    break;
                default:
                    System.out.println("Input a correct number.");
                    break;
            }
        } while (choice < 1||choice>3);
        in.close();
        return resultOfConvertion;
    }
}
