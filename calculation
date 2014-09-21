package target;

import java.util.ArrayList;
import java.util.Iterator;

public class calculation {
	public static ArrayList<Long> evaluation(ArrayList<collection> inputArrayList) {
		collection collection = null;
		ArrayList<Long> maxNumOfRings = new ArrayList<Long>();
		Iterator<collection> iterator = inputArrayList.iterator();
		while(iterator.hasNext()) {
			collection = iterator.next();
			maxNumOfRings.add(calculate(collection.getFirstRadius(), collection.getAmtOfPaint()));
		}
		return maxNumOfRings;
	}
	
	// Area for ring calculation:
	// (((2r+b)^2PI)-(r^2b)) => (2r+1)PI
	public static long calculate(long inputCurrentRadius, long inputPaintLeft) {
		long numOfRings = 0;
		long updatedNumOfRings = algorithm(numOfRings, inputCurrentRadius, inputPaintLeft);
		return updatedNumOfRings;
	}
	
	public static long algorithm(long numOfRings, long inputCurrentRadius, long inputPaintLeft) {
		if(numOfRings >= 0 && inputCurrentRadius > 0 && inputPaintLeft > 0) {
			if((inputPaintLeft-((2*inputCurrentRadius)+1)) >= 0) {
				long paintLeft = inputPaintLeft-((2*inputCurrentRadius)+1);
				long updatedRadius = inputCurrentRadius+2;
				long updatedNumOfRings = numOfRings+1;
				return algorithm(updatedNumOfRings, updatedRadius, paintLeft);
			}
			return numOfRings;
		}
		return numOfRings;
	}
}
