package Converter;

import Converter.Factory.FahrenheitDialog;
import Converter.Factory.KelvinDialog;
import Converter.Factory.ReaumurDialog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input Celsius degrees");
        Scanner in = new Scanner(System.in);
        double degrees = in.nextDouble();
        int choice;
        do {
            System.out.println("Choose the temperature scale to which you want to convert Celsius degrees:\n" +
                    "1:Kelvin's\n" +
                    "2:Fahrenheit's\n" +
                    "3:Reaumur scale\n" +
                    "0:Exit");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    KelvinDialog kelvin = new KelvinDialog();
                    kelvin.makeConvertion(degrees);
                    break;
                case 2:
                    FahrenheitDialog fahrenheit = new FahrenheitDialog();
                    fahrenheit.makeConvertion(degrees);
                    break;
                case 3:
                    ReaumurDialog reaumur = new ReaumurDialog();
                    reaumur.makeConvertion(degrees);
                    break;
                default:
                    System.out.println("Input a correct number.");
                    break;
            }
        } while (choice != 0);
        in.close();

    }
}
