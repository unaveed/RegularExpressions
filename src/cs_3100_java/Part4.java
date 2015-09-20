package cs_3100_java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Pattern pattern = Pattern.compile("\"(\\\\.)*.*?(\\\\.)*(?<!\\\\)\"");
		String input = "";
		while(s.hasNextLine()){
			input += s.nextLine() + "\n";
		}
		Matcher m = pattern.matcher(input);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
