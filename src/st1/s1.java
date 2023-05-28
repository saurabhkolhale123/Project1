package st1;

public class s1 {public static void main(String[] args) {
	
	String s1="velocity";
	String s2="VELOCITY";
	String s3="bacdad";
	String s4="my name is sham";
	
	System.out.println(s1.length());
	System.out.println(s1.isEmpty());
	System.out.println(s1.isBlank());
	System.out.println(s1.contains("c"));
	
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toLowerCase());
	System.out.println(s1.equals(s2));
	System.out.println(s1.equalsIgnoreCase(s2));
	
	System.out.println(s1.charAt(2));
	System.out.println(s1.indexOf("c"));
	System.out.println(s1.indexOf("i"));
	System.out.println(s3.indexOf("a"));
	System.out.println(s3.lastIndexOf("a"));
	
	System.out.println(s1.startsWith("v"));
	System.out.println(s1.endsWith("s"));
	System.out.println(s1.substring(4));
	System.out.println(s1.substring(0, 4));
	System.out.println(s1.concat(s2));
	System.out.println(s4.replace("sham", "ram"));
	
 String ar[]=s4.split(" ");
	
 System.out.println(ar[0]);
 System.out.println(ar[1]);
	
}
	
	
	

}
