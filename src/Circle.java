public class Circle extends GeometricObject {
	
	double x, y, radius;

	//Add three fields

    public Circle() {
    	super();
    	this.x = 0;
    	this.y = 0;
    	this.radius = 1;
    }
    
    public Circle(String name, String color, boolean filled, double x, double y, double radius) {
        // Use super keyword here;
        // Complete your code here
    	super(name, color, filled);
    	this.x = x;
    	this.y = y;
    	this.radius = radius;
    }
    
	public void printCentre() {
        System.out.print("with a (" + x + "," + y + ") centre ");
    }
    
	/** Return radius */
    //Complete your code here
  
	public void report() {
        System.out.print(" circle ");
    }
  
	/** Return area */
	public double getArea() {
		return 3.14 * Math.pow(this.getRadius(), 2);
	}
	
    public String toString() {
        return "I'm a circle. I was cloned from geometric parent. So I'm geo.object too." + "\n " + super.toString() + "\nMy area is " + getArea();
    }
   
    public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}