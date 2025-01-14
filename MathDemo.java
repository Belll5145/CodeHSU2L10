import static java.lang.Math.*;

public class MathDemo{
    public static void main(String[] args){
        
        double x1 = 17.2;
        double y1 = -8.5;
        double x2 = 5.6;
        double y2 = -2.0;
        int z = 7;
        //absolute value
        System.out.println(Math.abs(y1));
        //System.out.println(abs(y1)); only if static import is used
        
        
        //square root something
        double squareRoot = Math.sqrt(z);
        System.out.println(squareRoot); // integer argument is fine
        //use exponents
        double powerExample = Math.pow(7,5);
        System.out.println("7 to the 5th power is: "+(int) powerExample);
        
        //find the sin, cos, and tan of an angle
        int angle1 = 60; // in degrees
        double angle1InRads = Math.toRadians(angle1);
        System.out.println("The cos of 60 degrees is: "+ Math.cos(angle1InRads));
        System.out.println("The true value of 0.5");
        
        // convert to radians by multiplying by pi/180
        final double PI = Math.PI;
        double angle2InRads = angle1*(PI/180);
        System.out.println("The cos of 60 degrees is: "+ Math.cos(angle2InRads));
        System.out.println("The true value of 0.5");
        
        //area of a circle
        double radius = 4.0;
        // make area variable
        double area = PI*Math.pow(radius, 2);
        
        // print
        System.out.println("The area of a circle with a radius of "+ radius +"is"+ area);
    }
}