import java.util.Scanner;   

public class Testing1 {
    public static void main(String[ ] args) {
int spins = 0;
double spinVal = 0;

int green = 0;
int red = 0;
int yellow = 0;
int blue = 0;

while (spins < 15) {
spinVal = Math.random();
if (spinVal < 0.25) {
green++;
System.out.println("Green");
} else if (0.25 <= spinVal && spinVal < 0.5) {
red++; 
System.out.println("Red");
} else if (0.5 <= spinVal && spinVal < 0.75) {
yellow++;
System.out.println("Yellow");
} else if (0.75 <= spinVal){
blue++;
System.out.println("Blue");
}
spins++;
}
System.out.println("Green: " + green);
System.out.println("Red: " + red);
System.out.println("Yellow: " + yellow);
System.out.println("Blue: " + blue); 
    }
}