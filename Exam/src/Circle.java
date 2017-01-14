import java.util.HashMap;
import java.util.Map;

public class Circle implements Shape{
	String kind;
	String detail;
	int id;
	int radius;
	int area;
	int perimeter;
	String color;
	
	public Circle(String kind, int id, int radius, String color) {
		kind = kind;
		id = id;
		radius = radius;
		color = color;
	}
	public String toString(){return kind;}
	public String getKind() { return kind; }
	public String getDetailString() {return detail;}
	public int getID() { return id; }
	public static void add(Circle c) {}
}
