package cs_3100_java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Pattern pattern = Pattern.compile("\\(\\d\\d\\d\\)(\\s|)\\d\\d\\d-\\d\\d\\d\\d");
		int count = 0;
		while(s.hasNextLine()){
			String line = s.nextLine();
			Matcher m = pattern.matcher(line);
			if (m.find())
				count++;
		}
		s.close();
		System.out.println(count);
	}

}
