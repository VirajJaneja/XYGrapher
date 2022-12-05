
public class GrapherTester extends XYGrapher{

	@Override
	public Coordinate xyStart() {
		// TODO Auto-generated method stub
		return new Coordinate(-2, -2);
	}

	@Override
	public double xRange() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public double yRange() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public Coordinate getPoint(int pointNum) {
		switch(pointNum) {
		case 0:
			return new Coordinate(-1, -1);
		case 1:
			return new Coordinate(1, -1);
		case 2:
			return new Coordinate(1, 1);
		case 3:
			return new Coordinate(-1, 1);
		case 4:
			return new Coordinate(-1, -1);
		default:
			return null;
		}
	}
	
	public static void main(String[] args) {
		GrapherTester x = new GrapherTester();
		x.drawGraph(0, 0, 500, 500);
	}
}
