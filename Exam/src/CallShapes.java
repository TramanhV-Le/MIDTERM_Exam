import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CallShapes implements Shape{
	public class NoteReader {
	 // VINA IS CRYING ABOUT THIS EXAM. "It was only last Tuesday that we started this class!"
	  	
		}
	static String kind;
	static String detail;
	static int id = 0;
	static int length;
	static int width;
	static int radius;
	static int side;
	static int area;
	static int perimeter;
	static String color;

	static ArrayList<Circle> getCircle() {return getCircle();}
	static ArrayList<Rectangle> getRectangle() {return getRectangle();}
	static ArrayList<Triangle> getTriangle() {return getTriangle();}
	
	public String toString(){return kind;}
	public String getKind() { return kind; }
	public String getDetailString() {
		private static Map <Integer, Shape > shapes = new HashMap < Integer, Shape >(); 
		// *sobs*
	}
	public int getID() { return id; }

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String curdir = System.getProperty("user.dir")+("//src");
		File shapes = new File(curdir);
		File[] files = shapes.listFiles();
        for (File f: files) {
        	if (f.getName().equals("shapes.txt")) {
                try (FileInputStream is = new FileInputStream("\\\\cs1\\home\\tle19\\CS372-1\\Exam\\shapes.txt")) {
                    InputStreamReader ir = new InputStreamReader(is);
                    BufferedReader rdr = new BufferedReader(ir);
                    String line = rdr.readLine();
                    while (line != null) {
                        if(line.contains("circle: *")) {
                        	if(id <= 43 && id >= 0){
                        		length = line.charAt(10);
                        		// color = line.charAt(13);
                        		if(color == "y") {
                        			color = "Yellow";	
                        		}
                        		else if(color == "g") {
                        			color = "Green";
                        		}
                        		else if(color == "be") {
                        			color = "Blue";
                        		}
                        		else if(color == "r") {
                        			color = "Red";
                        		}
                        		else if(color == "bk") {
                        			color = "Black";
                        		}
                        	}
                        	kind = "circle*";
                            Circle c = new Circle(kind,id,radius,color);
                            System.out.printf("%s,%d,%d,%s \n");
                            Circle.add(c);
                            id++;
                        }
                        else if(line.contains("rectangle: *")) {
                        	if(id < 100 && id > 299){
                        		length = line.charAt(10);
                        		// color = line.charAt(19);
                        		if(color == "y") {
                        			color = "Yellow";	
                        		}
                        		else if(color == "g") {
                        			color = "Green";
                        		}
                        		else if(color == "be") {
                        			color = "Blue";
                        		}
                        		else if(color == "r") {
                        			color = "Red";
                        		}
                        		else if(color == "bk") {
                        			color = "Black";
                        		}
                        	}
                        	kind = "rectangle*";
                            Rectangle r = new Rectangle(kind,id,length,width,color);
                            System.out.printf("%s,%d,%d,%s \n");
                            Rectangle.add(r);
                            id++;
                        }
                        else if(line.contains("triangle: *")) {
                        	if(id < 300 && id > 399){
                        		// length = line.charAt(10);
                        		// color = line.charAt(22);
                        		if(color == "y") {
                        			color = "Yellow";	
                        		}
                        		else if(color == "g") {
                        			color = "Green";
                        		}
                        		else if(color == "be") {
                        			color = "Blue";
                        		}
                        		else if(color == "r") {
                        			color = "Red";
                        		}
                        		else if(color == "bk") {
                        			color = "Black";
                        		}
                        	}
		                     kind = "triangle*";
		                     Triangle t = new Triangle(kind,id,side,side,side,color);
		                     System.out.printf("%s,%d,%d,,%d,%d,%s \n");
		                     Triangle.add(t);
	                         id++;
                        }
                        
                    }
                    line = rdr.readLine();
                }
        	}
        }
	}	
}
