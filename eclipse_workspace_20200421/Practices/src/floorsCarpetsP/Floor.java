package floorsCarpetsP;

public class Floor {

	double width;
	double length;
	
	public Floor(double w, double l) {
		width = w;
		length = l;
		if (w<0) {
			width = 0;
		} if(l<0) {
			length = 0;
		}	
	}
	public double getArea() {
		return width * length ;
	}

}
