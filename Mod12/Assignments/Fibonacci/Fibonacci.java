/**
 * This program will recursively calculate the fibonacci sequence
 * 
 * @author Max Gordon
 * @version 01/10/2020
 */

public class Fibonacci {
    private int num;

    public Fibonacci(int number) {
        num = number;
    }

    public int calc() {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return calc(num - 1) + calc(num - 2);
        }
    }

    public int calc(int number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
            return calc(number - 1) + calc(number - 2);
        }
    }
}