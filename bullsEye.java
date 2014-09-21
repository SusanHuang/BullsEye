package target;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class bullsEye {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = File.useFile("C:\\Users\\user\\Documents\\bullsEyeDoc.txt");
		ArrayList<collection> cases = File.parseFile(bufferedReader);
		File.closeFile(bufferedReader);
		ArrayList<Long> maxNumOfRings= calculation.evaluation(cases);
		answer.printAnswer(maxNumOfRings);
	}
}
