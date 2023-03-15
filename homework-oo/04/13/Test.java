import coordinate.Point;
import displaydevice.Pixel;

public class Test {
    public static void main(String[] args) {
       // A
        method1(/*Pixel or Point */); // Point and Pixel can be passed
        method2(/*Pixel only */); // Only Pixel can be passed
        method3(/*Any object since object is superclass of all classes */); 
    }

    public static void method1(Point point) {
    // point.whatMethodsCanIUse();  
    /*
        any Point methods which are public
        and also Pixel variables if we first
        change the points type to pixel
    
    */ 
    }
    public static void method2(Pixel pixel) {
    // pixel.whatMethodsCanIUse();
    /*
     * any Pixel methods which are public and any
     * Point class methods which are public
     */
    }
    public static void method3(Object object) {
    // object.whatMethodsCanIUse(); 
    /*
     * If passed like this (Object object)
     * any Object's method.
     * Or the same rules which are explained
     * in methods above
     */
    }
}
