public class Coordinate {
	double xVal;
	double yVal;
	boolean drawTo;
	boolean drawFrom;
	
	Coordinate(double x, double y){
		drawTo = true;
		drawFrom = true;
		xVal = x;
		yVal = y;
	}
	
	Coordinate(double x, double y, boolean drawFrom1, boolean drawTo1){
		drawTo = drawTo1;
		drawFrom = drawFrom1;
		xVal = x;
		yVal = y;
	}
	
	public double getX() {
		return xVal;
	}
	
	public double getY() {
		return yVal;
	}
	
	public boolean drawTo() {
		return drawTo;
	}
	
	public boolean drawFrom() {
		return drawFrom;
	}
}
