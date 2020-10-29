package src.main.java;

import static java.lang.Math.*;

public class gradientDescent {
    private int iteration = 0;
    private final int initialGuess = 1;

    public static void main (String[] args){
        gradientDescent gDescent = new gradientDescent();
        gDescent.gradientdescent(gDescent.initialGuess);
    }

    public void gradientdescent(double x) {
        final int maxIteration = 5000;
        double learningRate = 0.0289;
        double previousX = x == 0 ? 1:0;
        while(iteration < maxIteration && (abs(derivative(x)) > 0) && previousX != x){
            System.out.println("The slope in x = " +x+ " is: " +derivative(x)+ " Iteration: " +iteration);
            previousX = x;
            x = x-learningRate*derivative(x);
            iteration++;
        }
        System.out.println("The slope in x = " +x+ " is: " +derivative(x)+ " Iteration: " +iteration);
    }

    public double derivative(double x) {
        return 5*x* pow(E, -((pow(x, 2))/8)) + PI* sin(2* PI*x)* pow(E, cos((2* PI*x)/2));
    }
}
