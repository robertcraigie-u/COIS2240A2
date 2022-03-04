import java.util.*;
public class Testshape {
  public static void main(String[] args) {
    ArrayList < GeometricObject > shapes = new ArrayList < GeometricObject > ();
    // create a default circle
    Circle c1 = new Circle();
    System.out.print("\nc1: I'm seminal");
    c1.report();
    c1.printCentre();
 
    Circle c2 = new Circle("Circle 2", "red", true, 1, 1, 1); // TODO: is math correct?
    
    System.out.print("\nc2: I am a little");
 
    c2.report();
    c2.printCentre();
    
    System.out.print(", a radius of " + c2.getRadius());
    c2.fill("purple", true);
    
    GeometricObject g1 = new GeometricObject("g1", "blue", false);
    
    shapes.add(g1);
    shapes.add(c2);
    
    System.out.println("**************************** ");
    System.out.println("Shapes' profile:");
    
    Iterator < GeometricObject > itr = shapes.iterator(); //getting the Iterator
    
    while (itr.hasNext()) { //see if the iterator has element
      System.out.println(itr.next() + "\n"); //print the element and move to the next
    }
  }
}