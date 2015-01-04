package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import junit.framework.TestCase;

public class UnitTest extends TestCase {

	public static String regexPat = "\\s*((//.*)|([0-9]+)|(\"(\\\\\"|\\\\\\\\|\\\\n|[^\"])*\")"
			+ "|[A-Z_a-z][A-Z_a-z0-9]*|==|<=|>=|&&|\\|\\||\\p{Punct})?";
	private Pattern pattern = Pattern.compile(regexPat);

	public void testMach() {
		// System.out.println("first test");
		String line = " i<10 {";
		Matcher matcher = pattern.matcher(line);
		int pos = 0;
		int endPos = line.length();
		matcher.region(pos, endPos);
		String m1 = matcher.group(1);
//		String m2 = matcher.group(2);
//		String m3 = matcher.group(3);
//		String m4 = matcher.group(4);
//		String m5 = matcher.group(5);
		
		System.out.println("m1:"+m1);
		// System.out.println("m2:"+m2);
		// System.out.println("m3:"+m3);
		// System.out.println("m4:"+m4);
		// System.out.println("m5:"+m5);
		
	}

}
