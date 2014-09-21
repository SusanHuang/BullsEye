package target;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class File {
	
	// Read file into buffer
	public static BufferedReader useFile(String inputFile) throws FileNotFoundException {
		FileInputStream inputStream = new FileInputStream(inputFile);
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		return bufferedReader;
	}

	// Close file
	public static void closeFile(BufferedReader inputBufferedReader) throws IOException {
		inputBufferedReader.close();
	}
    
	// Parse File
	public static ArrayList<collection> parseFile(BufferedReader inputBufferedReader) throws IOException {
		String extract = null;
		boolean isNumCases = true;
		ArrayList<String> cases= new ArrayList<String>();
		while((extract = inputBufferedReader.readLine()) != null) {
			// Takes first value, which is the number of cases and puts it aside
			if(isNumCases == true) {
				long numOfCases = Integer.parseInt(extract);
				isNumCases = false;
			}
			else {
				cases.add(extract);
			}
		}
		ArrayList<collection> targetCases = parseString(cases);
		return targetCases;
	}
	
	public static void printCases(ArrayList<String> inputArrayList){
		Iterator<String> iterator = inputArrayList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	public static ArrayList<collection> parseString(ArrayList<String> inputArrayList) {
		ArrayList<collection> cases = new ArrayList<collection>();
		Iterator<String> iterator = inputArrayList.iterator();
		while(iterator.hasNext()){
			cases.add(splitTestCase(iterator.next()));
		}
		return cases;
	}
	
	public static collection splitTestCase(String inputString) {
		String[] targetString = inputString.split(" ");
		long firstRadius = Integer.parseInt(targetString[0]);
		long amtOfPaint = Integer.parseInt(targetString[1]);
		collection target = new collection(firstRadius, amtOfPaint);
		return target;
	}
	
	// Check the collections in the parse method's cases
	public static void printCases2(ArrayList<collection> inputArrayList) {
		Iterator<collection> iterator = inputArrayList.iterator();
		while(iterator.hasNext()){
			printCollection(iterator.next());
		}
	}
	
	public static void printCollection(collection inputTarget) {
		System.out.println(inputTarget.getFirstRadius() + " " + inputTarget.getAmtOfPaint());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
