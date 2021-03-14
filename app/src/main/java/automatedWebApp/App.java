/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package automatedWebApp;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }

    public static String computeResults(ArrayList<Integer> arrList, Number number, int lowerBound, String message ) throws IllegalArgumentException {
        if (arrList == null) {
            throw new IllegalArgumentException();
            
        }

        double doubleValue = number.doubleValue();
        double sum = 0;
        for (Integer integer : arrList) {
            if(integer > lowerBound ) {
                sum += integer*doubleValue;
            }            
        }
        return message + sum;
    }

}
