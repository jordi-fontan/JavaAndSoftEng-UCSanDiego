import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
       int n=0;
    	for(Point point : s.getPoints()) {
    		n++;
       }
       return n;
      
        
    }

    public double getAverageLength(Shape s) {
        // Put code here
        return this.getPerimeter(s)/this.getNumPoints(s);
    }

    public double getLargestSide(Shape s) {
        // Put code here
       
    	 double largestSoFar=0;
    	 double x=0,y=0;
    	 int n=0;
    	
    	 for(Point point : s.getPoints()) {
     		double xc=point.getX();
     		double yc=point.getY();
     		if( n==0) { x=xc;y=yc;n++;}
     		else{
     			double distance=Math.sqrt((xc-x)*(xc-x)+(yc-y)*(yc-y));
     			System.out.println("			debug    distance = " + distance);
     			if(distance>largestSoFar) largestSoFar=distance;
     		}
     		
        }
        return largestSoFar;

    }

    public double getLargestX(Shape s) {
    	double largestXSoFar=0;

   	 	for(Point point : s.getPoints()) {
    		
    		
    			if(point.getX()>largestXSoFar) largestXSoFar=point.getX();
    		}
    		
      
       return largestXSoFar;
     
    }

    public double getLargestPerimeterMultipleFiles() {
    return 0.0;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
        System.out.println("number of points = " + getNumPoints(s));
        System.out.println("average = " + getAverageLength(s));
        System.out.println("largest side = " + getLargestSide(s));
        System.out.println("largest X = " + getLargestX(s));
    }
    
    public void testPerimeterMultipleFiles() {
        // Put code here
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
        
    }
}
