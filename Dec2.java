package adventOfCode2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dec2 {

	public static void main(String[] args) {
		
		//read in file line by line
		//min = before -
		//max = after - before letter
		//letter = before : 
		//password = after : +1;
		//if valid, add to total
		
		File file = new File("C:\\Users\\Timothy Callahan\\Documents\\AdventOfCode2020\\Dec2Input.txt");
		int valid = 0;
		int inPass = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				int dash = line.indexOf("-");
				int colon = line.indexOf(":");
				String letterString = line.substring(colon-1, colon);
				String minString = line.substring(0, dash);
				String maxString = line.substring(dash + 1, colon-2);
				String password = line.substring(colon+2);
				int min = Integer.parseInt(minString);
				int max = Integer.parseInt(maxString);
				char letter = letterString.charAt(0);
				
				System.out.println(min);
				System.out.println(max);
				System.out.println(letter);
				System.out.println(password);
				
				//First Part
//				inPass = 0;
//
//				for (int i = 0; i < password.length(); i++) {
//					if (password.charAt(i) == letter) {
//						inPass += 1;
//					}
//				}
//				
//				if (inPass >= min && inPass <= max) {
//					System.out.println("--------------ADDED-------------------");
//					System.out.println(inPass);
//					valid += 1;
//				}
				
				// Second Part
				int firstPos = min - 1;
				int secondPos = max - 1;
				if (password.charAt(firstPos) == letter && password.charAt(secondPos) != letter) {
					System.out.println("--------------ADDED-------------------");
					valid += 1;
				}
				if (password.charAt(firstPos) != letter && password.charAt(secondPos) == letter) {
					System.out.println("--------------ADDED-------------------");
					valid += 1;
				}
				
				
				//read next line
				line = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(valid);

	}
	
}
