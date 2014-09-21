package target;

import java.util.ArrayList;
import java.util.Iterator;

public class answer {
	public static void printAnswer(ArrayList<Long> inputArrayList){
		Iterator<Long> iterator = inputArrayList.iterator();
		int position = 1;
		while(iterator.hasNext()) {
			System.out.println("Case #" + position + ": " + iterator.next());
			position++;
		}
	}
}
