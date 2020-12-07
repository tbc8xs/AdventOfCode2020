package adventOfCode2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Dec4Part2 {

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
						String afterColon = lineArray[i].substring(colon + 1);
						switch (passField) {
						case "byr":
							int after = Integer.parseInt(afterColon);
							if (after >= 1920 && after <= 2002) {
								byr = true;
							}
							break;
						case "iyr":
							after = Integer.parseInt(afterColon);
							if (after >= 2010 && after <= 2020) {
								iyr = true;
							}
							break;
						case "eyr":
							after = Integer.parseInt(afterColon);
							if (after >= 2020 && after <= 2030) {
								eyr = true;
							}
							break;
						case "hgt":
							if (afterColon.substring(Math.max(afterColon.length() - 2, 0)).equals("cm")) {
								int cm = afterColon.indexOf("cm");
								int num = Integer.parseInt(afterColon.substring(0, cm));
								if (num >= 150 && num <= 193) {
									hgt = true;
									break;
								}
							} if (afterColon.substring(Math.max(afterColon.length() - 2, 0)).equals("in")) {
								int in = afterColon.indexOf("in");
								int num = Integer.parseInt(afterColon.substring(0, in));
								if (num >= 59 && num <= 76) {
									hgt = true;
									break;
								}
							}
							break;
						case "hcl":
							if (afterColon.substring(0,0).equals("#")) {
								String pattern = afterColon.substring(1);
								hcl = Pattern.matches(pattern, "/w{6}");
							}
							hcl = true;
							break;
						case "ecl":
							switch (afterColon) {
							case "amb":
								ecl = true;
								break;
							case "blu":
								ecl = true;
								break;
							case "brn":
								ecl = true;
								break;
							case "gry":
								ecl = true;
								break;
							case "grn":
								ecl = true;
								break;
							case "hzl":
								ecl = true;
								break;
							case "oth":
								ecl = true;
								break;
							}
							break;
						case "pid":
							if (afterColon.length() == 9) {
								pid = true;
							}
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
