package st1;

public class st3 {public static void main(String[] args) {
	
	
	String s="saurabh";
	String a="SAURABH";
	
	System.out.println(s.length());
	System.out.println(s.isEmpty());
	System.out.println(s.contains("u"));
	
	System.out.println(s.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(s.charAt(2));
	System.out.println(s.indexOf("b"));
	System.out.println(s.lastIndexOf("a"));
	System.out.println(a.startsWith("S"));
	System.out.println(a.endsWith("H"));
	System.out.println(s.substring(2));
	System.out.println(s.substring(2, 5));
	
	System.out.println(s.equals(a));
	System.out.println(s.equalsIgnoreCase(a));
	System.out.println(s.concat(a));
	System.out.println(s.replace("a", "l"));
	 String ar[]=  s.split("u");
	 
	   System.out.println(ar[0]);
	   System.out.println(ar[1]);
	
	
	

}
}
