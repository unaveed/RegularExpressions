package cs_3100_java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String regex = "\\b\\d\\d\\d-\\d\\d-\\d\\d\\d\\d";
		Pattern pattern = Pattern.compile(regex);
		String input = "";
		while(s.hasNextLine()) {
			input += s.nextLine() + "\n";
		}
		s.close();
		Matcher m = pattern.matcher(input);
		System.out.println(m.replaceAll("###-##-####"));
	}
}
