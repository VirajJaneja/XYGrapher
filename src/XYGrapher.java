
public abstract class XYGrapher {
	abstract public Coordinate xyStart();
	
	abstract public double xRange();
	abstract public double yRange();
	
	abstract public Coordinate getPoint(int pointNum);
	
	public void drawGraph(int xPixelStart, int yPixelStart, int pixelsWide, int pixelsHigh) {
			
	}
	
}
