package coderslab.day2.Konstruktor;

import java.util.Arrays;

public class Calculator {
    private String[] operations;

    public Calculator() {
        this.operations = new String[0];
    }


    private void addToOperations(String operation) {
        this.operations = Arrays.copyOf(this.operations, this.operations.length + 1);
        this.operations[this.operations.length - 1] = operation;
    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        String operation = "added " + num1 + " to" + num2 + " got" + result;
        addToOperations(operation);
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        String operation = "multiplied " + num1 + " with" + num2 + " got" + result;
        addToOperations(operation);
        return result;
    }


    public double substracted(double num1, double num2) {
        double result = num2 - num1;
        String operation = "substracted " + num1 + " from" + num2 + " got" + result;
        addToOperations(operation);
        return result;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            String operation = "divided " + num1 + " by" + num2 + " got" + result;
            addToOperations(operation);
            return result;
        } else {
            System.out.println("Nie można dzielić przez zero");
            return num2;
        }
    }

    public void printOperations() {
        //for (int i = 0; i<operations.length; i++) {
        //System.out.println(this.operations[i]);
        for (String s : this.operations) {
            System.out.println(s);
        }
    }

    public void clearOperations() {
        this.operations = new String[0];
    }


}

