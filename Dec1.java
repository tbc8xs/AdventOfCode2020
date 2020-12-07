package adventOfCode2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Timothy Callahan\\Documents\\AdventOfCode2020\\Dec1Input.txt");
		
		ArrayList<Integer> temps = new ArrayList<Integer>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			while (line != null) {
				//System.out.println(line);
				int number = Integer.parseInt(line);
				temps.add(number);
				
				//System.out.println(div3);
				//read next line
				line = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// First Star
//		for (int i = 0; i < temps.size(); i ++) {
//			int first = temps.get(i);
//			for (int j = i; j < temps.size(); j ++) {
//				int sec = temps.get(j);
//				if (first + sec == 2020) {
//					System.out.println(first*sec);
//				}
//			}
//		}
		
		for (int i = 0; i < temps.size(); i ++) {
			int first = temps.get(i);
			for (int j = i; j < temps.size(); j ++) {
				int sec = temps.get(j);
				if (first + sec < 2020) {
					for (int k = j; k < temps.size(); k++) {
						int thr = temps.get(k);
						if(first + sec + thr == 2020) {
							System.out.println(first*sec*thr);
						}
					}
					
				}
			}
		}
	}

}
