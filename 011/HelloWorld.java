public class HelloWorld {
	public static void main (String[] args) {
		String s = new String("abcdefg");
		System.out.println(s.length());
		System.out.println(s.substring(2, 5));
		System.out.println(s.replaceAll("abc", "ABC"));

		String s1 = "Sun,Mon,Tue";
		String[] youbi = s1.split(",", 0);
		System.out.println(youbi[0]);
	}
}