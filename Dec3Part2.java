package adventOfCode2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dec3Part2 {

	public static void main(String[] args) {

		// Read in input
		// For each row
		// Add 3 spots, minus length if necessary
		// If spot is tree, add to count
		
		int horiz = 0;
		int vert = 1;
		int trees = 0;
		int trees2 = 0;
		int trees3 = 0;
		int trees4 = 0;
		int trees5 = 0;
		
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
		
		try (BufferedReader br1 = new BufferedReader(new FileReader(file))) {
			horiz = 0;
			vert = 1;
			String line = br1.readLine();
			while (line != null) {
				//System.out.println(line);
				if (vert > 1) {
					horiz += 1;
					if (horiz >= line.length()) {
						horiz -= line.length();
					}
				}
				
				if (line.charAt(horiz) == '#') {
					trees2 += 1;
				}
				
				//System.out.println(div3);
				//read next line
				vert += 1;
				line = br1.readLine();
			}
			
			System.out.println(trees2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			horiz = 0;
			vert = 1;
			String line = br.readLine();
			while (line != null) {
				//System.out.println(line);
				if (vert > 1) {
					horiz += 5;
					if (horiz >= line.length()) {
						horiz -= line.length();
					}
				}
				
				if (line.charAt(horiz) == '#') {
					trees3 += 1;
				}
				
				//System.out.println(div3);
				//read next line
				vert += 1;
				line = br.readLine();
			}
			
			System.out.println(trees3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			horiz = 0;
			vert = 1;
			String line = br.readLine();
			while (line != null) {
				//System.out.println(line);
				if (vert > 1) {
					horiz += 7;
					if (horiz >= line.length()) {
						horiz -= line.length();
					}
				}
				
				if (line.charAt(horiz) == '#') {
					trees4 += 1;
				}
				
				//System.out.println(div3);
				//read next line
				vert += 1;
				line = br.readLine();
			}
			
			System.out.println(trees4);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			horiz = 0;
			vert = 1;
			String line = br.readLine();
			while (line != null) {
				//System.out.println(line);
				if (vert > 1) {
					horiz += 1;
					if (horiz >= line.length()) {
						horiz -= line.length();
					}
				}
				
				if (line.charAt(horiz) == '#') {
					trees5 += 1;
				}
				
				//System.out.println(div3);
				//read next line
				vert += 2;
				line = br.readLine();
				line = br.readLine();
			}
			
			System.out.println(trees5);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		long prod1 = Math.multiplyExact(trees, trees2);
		long prod2 = Math.multiplyExact(prod1, trees3);
		long prod3 = Math.multiplyExact(prod2, trees4);
		long prod4 = Math.multiplyExact(prod3, trees5);
		
		System.out.println(prod4);
	}
	
}
