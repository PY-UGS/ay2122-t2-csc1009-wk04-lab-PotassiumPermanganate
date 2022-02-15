package com.T4;

import java.util.Scanner;

public class Bmi {

    private double weight;
    private double height;
    private static double POUND_TO_KILO = 0.45359237;
    private static double INCH_TO_CM = 0.0254;


    public Bmi() {
        // default constructor

    }

    public Bmi(double weight, double height) {
        this.height = height;
        this.weight = weight;
    }

    public double get() {
       return ((this.weight * POUND_TO_KILO) / Math.pow((this.height * INCH_TO_CM), 2));
    }

    public String getStatus() {
        double bmi = this.get();
        if (bmi < 18.5) {
            return "Underweight";
        }else if (bmi < 25) {
            return "Normal";
        }else if (bmi < 30) {
            return "Overweight";
        }else {
            return "Obese";
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void main(String[] args) {

        Bmi bmi = new Bmi();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        bmi.setWeight(scanner.nextDouble());

        System.out.print("Enter height in inches: ");
        bmi.setHeight(scanner.nextDouble());

        System.out.println("BMI is " + bmi.get());
        System.out.println(bmi.getStatus());

    }
}
