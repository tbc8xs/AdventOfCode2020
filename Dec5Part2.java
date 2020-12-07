package adventOfCode2020;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dec5Part2 {

	static File file = new File("C:\\Users\\Timothy Callahan\\Documents\\AdventOfCode2020\\Dec5Input.txt");

	public static void main(String[] args) {
		
		int highestId = 0;
		
		ArrayList<Integer> totals = new ArrayList<Integer>();
		ArrayList<Integer> possibles = new ArrayList<Integer>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			while (line != null) {
				int front = 0;
				int back = 127;
				int left = 0;
				int right = 7;
				
				for (int i = 0; i < 7; i ++) {
					if (line.charAt(i) == 'F') {
						int sub = (back - front + 1) / 2;
						back -= sub;
					} else if (line.charAt(i) == 'B') {
						int diff = (back - front + 1) / 2;
						front += diff;
					}
				}
				for (int j = 7; j < 10; j ++) {
					if (line.charAt(j) == 'L') {
						int sub = (right - left + 1) / 2;
						right -= sub;
					} else if (line.charAt(j) == 'R') {
						int diff = (right - left + 1) / 2;
						left += diff;
					}
				}
				if (front == back && left == right) {
					int total = front * 8 + left;
					totals.add(total);
				}
				System.out.println(line);
				System.out.println(front);
				System.out.println(back);
				System.out.println(left);
				System.out.println(right);
				System.out.println(front * 8 + left);

				System.out.println(highestId);

				line = br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int k = 0; k < totals.size(); k ++) {
			if (totals.get(k) > highestId) {
				highestId = totals.get(k);
				System.out.println(highestId);
			}
			for (int r = highestId/2; r < highestId; r ++) {
				if (totals.contains(r-1) && totals.contains(r+1) && !totals.contains(r)) {
					possibles.add(r);
				}
			}
		}
		System.out.println(possibles.toString());

	}
}
