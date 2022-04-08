package string_study;

public class Stringuse {

	public static void main(String[] args) {
		String m = "Velocity"; // without using new keyword
		String m1 = "Velocity";

		String s ="Velocity"; // with new keyword using
		String s3="sid";
		String s1 = new String("Velocity");
		String s2 = new String("Pune");
		System.out.println(s==s1);
System.out.println(s.equals(s1));
		System.out.println(m == m1);
		System.out.println(m == s);
		System.out.println(m.equals(s)); // equals check contents if same then run true if different then show false
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
System.out.println("========================================");
		System.out.println(m.length()); // length
		System.out.println(s2.length());
		int lenghtofs2 = s2.length();
		System.out.println("length is " + s2.length());

		System.out.println(s2.toLowerCase()); // toLowercase method
		System.out.println(s2.toUpperCase()); // toUppercase method use

		String a = "nanded";
		String b = "Nanded";
		System.out.println(a.equals(b)); // equals method
		System.out.println(a.equalsIgnoreCase(b)); // equalsIgnorecase method
		System.out.println(a.contains("nan"));
		System.out.println(a.contains("Na"));

		String ab = "";
		String cd = " ";
		String pq = "Velocity";
		System.out.println(ab.isEmpty()); // empty
		System.out.println(cd.isEmpty()); // space is there not empty
		System.out.println(cd.isBlank()); // white space is there hence Blank true
		System.out.println(ab.isBlank()); // empty so true
		System.out.println("length of pq is " + pq.length());
		System.out.println("******************************************");
		char output = pq.charAt(7);
		System.out.println("char at 7 is " + output);
System.out.println(pq.charAt(4));
		String mn = "Sid kokate";
		System.out.println(mn.startsWith("Sid"));
		System.out.println(mn.endsWith("te"));

		String subString = mn.substring(2);
		System.out.println("substring is " + subString);
		System.out.println(mn.substring(0, 3));
System.out.println(mn.substring(4));
		String p = "Velocity";
		String q = "corporate";
		String r = "training";
		String t = "centre";
		System.out.println(p.concat(q).concat(r).concat(t));
		String FinalString = p.concat(q).concat(r).concat(t);
		System.out.println("combination of all string is " + FinalString);

		System.out.println(FinalString.indexOf('o'));
		String srk = "shiddhodhan ravindra kokate";
		System.out.println(srk.indexOf('k'));
		System.out.println(srk.indexOf( 's',
				'n'));
		System.out.println(srk.lastIndexOf('h'));
		System.out.println(srk.replace('h', 's'));
		System.out.println(srk.replace('k', 'o'));
System.out.println(srk.indexOf('r'));
 
	}

}
