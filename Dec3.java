package adventOfCode2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dec3 {

	public static void main(String[] args) {

		// Read in input
		// For each row
		// Add 3 spots, minus length if necessary
		// If spot is tree, add to count
		
		int horiz = 0;
		int vert = 1;
		int trees = 0;
		
		File file = new File("C:\\Users\\Timothy Callahan\\Documents\\AdventOfCode2020\\Dec3Input.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			while (line != null) {
				//System.out.println(line);
				if (vert > 1) {
					horiz += 3;
					if (horiz >= line.length()) {
						horiz -= line.length();
					}
				}
				
				if (line.charAt(horiz) == '#') {
					trees += 1;
				}
				
				//System.out.println(div3);
				//read next line
				vert += 1;
				line = br.readLine();
			}
			System.out.println(trees);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
}
