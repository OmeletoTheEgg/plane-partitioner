
public class Partitioner {
	public static void main(String[] args) {
		double x1 = 750;
		double y1 = 750;
		double x2 = -750;
		double y2 = -750;
		int div = 3;
		
		double xstep = (x2 - x1) / div;
		double ystep = (y2 - y1) / div;
		
		for(int i = 0; i < div; i++ ) {
			for(int j = 0; j < div; j++) {
				System.out.println((x1+(xstep*(j))) + " " + (y1+(ystep*(j))) + " " + (x1+(xstep*(j+1))) + " " + (y1+(ystep*(j+1))));
			}
		}
	}
}
