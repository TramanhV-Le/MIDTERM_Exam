
public class Triangle implements Shape {
	String kind;
	String detail;
	int id;
	int side;
	int area;
	int perimeter;
	String color;

	public Triangle(String kind, int id, int side1, int side2, int side3, String color) {
		kind = kind;
		id = id;
		side = side1; 
		side = side2; 
		side = side3;
		color = color;
		
	}
	public String getKind() { return kind; }
	public String getDetailString() { return detail; }
	public int getID() { return id; }
	public static void add(Triangle t) {}
	
	
}
