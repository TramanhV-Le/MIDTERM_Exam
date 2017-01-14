
public class Rectangle implements Shape{
	String kind;
	String detail;
	int id;
	int length;
	int base;
	int area;
	int perimeter;
	String color;

	public Rectangle(String kind, int id, int length, int width, String color) {
		kind = kind;
		id = id;
		length = length;
		width = width;
		color = color;
	}
	public String getKind() { return kind; }
	public String getDetailString() { return detail; }
	public int getID() { return id; }
	public static void add(Rectangle r) {} 

}
