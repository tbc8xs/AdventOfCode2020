package adventOfCode2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Dec4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Timothy Callahan\\Documents\\AdventOfCode2020\\Dec4Input.txt");
		
		// concat lines together until blank line
		// strip by \n and space
		// substring to get just in front of colons
		
		boolean byr = false;
		boolean iyr = false;
		boolean eyr = false;
		boolean hgt = false;
		boolean hcl = false;
		boolean ecl = false;
		boolean pid = false;
		boolean cid = false;
		
		int passports = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			String lineTemp = "";
			while (line != null) {
				lineTemp += line + " ";
				if (line.equals("")) {
					String[] lineArray = lineTemp.split(" ");
					
					System.out.println(lineTemp);
					for(int i = 0; i < lineArray.length; i ++ ) {
						int colon = lineArray[i].indexOf(":");
						String passField = lineArray[i].substring(0, colon);
						switch (passField) {
						case "byr":
							byr = true;
							break;
						case "iyr":
							iyr = true;
							break;
						case "eyr":
							eyr = true;
							break;
						case "hgt":
							hgt = true;
							break;
						case "hcl":
							hcl = true;
							break;
						case "ecl":
							ecl = true;
							break;
						case "pid":
							pid = true;
							break;
						case "cid":
							cid = true;
							break;
						}
//						System.out.println(lineArray[i]);
					}
					if (byr && iyr && eyr && hgt && hcl && ecl && pid) {
						passports += 1;
						System.out.println("-----------------HERE-------------------");
					} 
					lineTemp = "";
					byr = false;
					iyr = false;
					eyr = false;
					hgt = false;
					hcl = false;
					ecl = false;
					pid = false;
					
				}
//				System.out.println(line);
				line = br.readLine();
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(passports);
		//between 212 and 264
		
	}

}
