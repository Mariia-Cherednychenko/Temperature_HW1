package ua.ithlillel.dnipro.Cherednychenko;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    static int temperatureCelsius;
    static double temperatureFahrenheit;
    static boolean indicator = false;

    public static void main(String[] args) throws IOException {
        // write your code here

        System.out.println("Program that  helps to convert temperature from Celsius to Fahrenheit");
        System.out.println("===================================================================== \n");


        do {
            System.out.println("Enter the temperature in Celsius degrees (integer value): ");
            temperatureCelsius = getTemperatureCelsius();
            temperatureFahrenheit = convertCelsiusToFahrenheit(temperatureCelsius);
            printConvertationResult(temperatureCelsius, temperatureFahrenheit);
            System.out.println("If you want to proceed - enter 'y' ");
            indicator = checkInputChoosen();

        }
        while (indicator);
        System.out.println("Program is closing");

    }

    private static boolean checkInputChoosen() throws IOException {
        char inputChoice;
        inputChoice = getInput();
        boolean indicator = false;
        switch (inputChoice) {
            case 'y':
            case 'Y':
                indicator = true;
                break;
        }
        return indicator;
    }

    private static void printConvertationResult(int temperatureCelsius, double temperatureFahrenheit) {
        System.out.println(temperatureCelsius + " Celsius degree is " + temperatureFahrenheit + " Fahrenheit degree");
    }

    private static double convertCelsiusToFahrenheit(int temperatureCelsius) {
        return (double) (temperatureCelsius * (9 / 5)) + 32;
    }

    private static char getInput() throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        return (char) in.read();

    }

    private static int getTemperatureCelsius() {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        try {
            result = sc.nextInt();
        } catch (Exception E) {
            System.out.println("Wrong format was used.Enter the temperature in Celsius degrees (integer value): ");
            getTemperatureCelsius();
        }
        return result;
    }
}




