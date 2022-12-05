
public class GrapherTester3 extends XYGrapher{
	@Override
	public Coordinate xyStart() {
		// TODO Auto-generated method stub
		return new Coordinate(-4, -4);
	}

	@Override
	public double xRange() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public double yRange() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public Coordinate getPoint(int pointNum) {
		switch(pointNum) {
		case 0:
			return new Coordinate(0, 2);
		case 1:
			return new Coordinate(-2, -2);
		case 2:
			return new Coordinate(2, -2);
		case 3:
			return new Coordinate(0, 2, false, true);
		case 4:
			return new Coordinate(0, 1, true, false);
		case 5:
			return new Coordinate(-1, -1);
		case 6:
			return new Coordinate(1, -1);
		case 7:
			return new Coordinate(0,1);
		default:
			return null;
		}
	}
	
	public static void main(String[] args) {
		GrapherTester3 x = new GrapherTester3();
		x.drawGraph(0, 0, 500, 500);
	}

}
