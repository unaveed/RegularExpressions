package cs_3100_java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Pattern pattern = Pattern.compile("(\\s|\\n)\\(\\d{3}\\)(\\s|)\\d{3}-\\d{4}\\b");
		String input = "";
		int count = 0;
		while(s.hasNextLine()){
			input += s.nextLine() + "\n";
		}
		s.close();
		Matcher m = pattern.matcher(input);
		while(m.find()){
			count++;
		}
		System.out.println(count);
	}
}