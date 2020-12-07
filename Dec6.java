package adventOfCode2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dec6 {
	
	// read in lines
	// while line isn't blank
		// if each char not in array list, add to arraylist
		// add arraylist size to total size
	

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Timothy Callahan\\Documents\\AdventOfCode2020\\Dec6Input.txt");
		int total = 0;
		
		// TODO Auto-generated method stub
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			String lineTemp = "";
			while (line != null) {
				ArrayList<Character> totalAnswers = new ArrayList<Character>();
				
				lineTemp += line + " ";
				if (line.equals("")) {
					String[] lineArray = lineTemp.split(" ");
					System.out.println(lineTemp);
					for (int i = 0; i < lineArray.length; i++) {
						for (int j = 0; j < lineArray[i].length(); j++) {
							if (!totalAnswers.contains(lineArray[i].charAt(j))) {
								totalAnswers.add(lineArray[i].charAt(j));
							}
						}
					}
					total += totalAnswers.size();
					lineTemp = "";
				} if (line.equals("exugdvclmqfzsojiwnbarhty")) {
					String[] lineArray = lineTemp.split(" ");
					System.out.println(lineTemp);
					for (int i = 0; i < lineArray.length; i++) {
						for (int j = 0; j < lineArray[i].length(); j++) {
							if (!totalAnswers.contains(lineArray[i].charAt(j))) {
								totalAnswers.add(lineArray[i].charAt(j));
							}
						}
					}
					total += totalAnswers.size();
					lineTemp = "";
				}
				line = br.readLine();
			}
			System.out.println(total);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(total);
		
	}

}
