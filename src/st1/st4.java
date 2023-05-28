package st1;

public class st4 {

	public static void main(String[] args) {
		
		String s1="velocity";
		String s2="VELOCITY";
		
		String s=s1.toUpperCase();
		System.out.println(s);
		int l=s1.length();
		System.out.println(l);
		boolean e=s1.isEmpty();
		System.out.println(e);
		boolean c=s1.contains("o");
		System.out.println(c);
		boolean eq=s1.equals(s2);
		System.out.println(eq);
		char ch=s1.charAt(4);
		   System.out.println(ch);
	   int index=s1.indexOf("i");
		System.out.println(index);
		boolean st=s1.startsWith("v");
		System.out.println(st);
		boolean en=s1.endsWith("c");
System.out.println(en);	
         String con= s1.concat(s2);
	System.out.println(con);
	String repl=s1.replace("t", "z");
	System.out.println(repl);
	
	
	}
	
	
	
	
}
