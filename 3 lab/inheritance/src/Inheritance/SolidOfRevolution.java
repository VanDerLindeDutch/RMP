package Inheritance;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class SolidOfRevolution extends Shape {
    private double radius;
    private Operationable operation;

    public SolidOfRevolution(double radius) {
        this.radius = radius;
    }

    public SolidOfRevolution(double volume, double radius, Operationable operation) {
        super(volume);
        this.radius = radius;
        this.operation = operation;
    }

    public double calculateVolume() {
        double[] arr = calculateAandB(operation);
        return (simpsonsRule(operation, Math.min(arr[0], arr[1]), Math.max(arr[0], arr[1])));
    }

    private static double simpsonsRule(Operationable f, double a, double b) {
        double coef = (b - a) / 6;
        double aver = (a + b) / 2;
        double f0 = Math.pow(f.calculate(a), 2);
        double f1 = Math.pow(f.calculate(aver), 2);
        double f2 = Math.pow(f.calculate(b), 2);
        return Math.abs(Math.PI * coef * (f0 + 4 * f1 + f2));
    }

    private static double @NotNull [] calculateAandB(Operationable operation) {
        double x;
        double[] arr = new double[2];
        System.out.println("Input primary approximation");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        arr[0] = newtonMethod(operation, x);
        System.out.println("Input secondary approximation");
        x = in.nextInt();
        arr[1] = newtonMethod(operation, x);
        return arr;
    }

    private static double newtonMethod(Operationable operation, double x) {
        double d_f, h = 0.00001;
        d_f = (operation.calculate(x + h) - operation.calculate(x)) / h;
        for (int i = 0; i < 1000; i++) {
            x = (x - operation.calculate(x)) / d_f;
        }
        return x;
    }


    interface Operationable {
        double calculate(double x);
    }

    @Override
    public String toString() {
        return "SolidOfRevolution{" +
                "radius=" + radius +
                ", volume=" + volume +
                '}';
    }

    public double getRadius() {
        return radius;
    }
}
