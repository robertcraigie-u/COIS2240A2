public class GeometricObject {
    private String color = "green";
    private boolean filled;
    private String name;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with name, color and filled value */
    protected GeometricObject(String name, String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.name = name;
        this.color = color;
        this.filled = filled;
    }

    /** Return filled. Since filled is boolean,
     * the get method is named isFilled */
    //Complete your code here

    /** Fill the geo object */
    public void fill(String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        System.out.println(", and filled with " + color);
    }

    public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
    public java.util.Date getDateOfBirth() {
        return dateCreated;
    }

    public void report() {
        System.out.print(" a geometric object ");
    }

    @Override
    public String toString() {
        return "I'm " + name + ", I was born on " + dateCreated + ".\nI can change my color, " + color + ", like a chameleon.\nAm I filled? " + filled;
    }
}