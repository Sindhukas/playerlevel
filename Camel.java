package Playcode;

public class Camel {
	public static void main(String[] args) {
	    String start = "geT_tImE";
	    StringBuffer sb = new StringBuffer();
	    for (String s : start.split("_")) {
	        sb.append(Character.toUpperCase(s.charAt(0)));
	        if (s.length() > 1) {
	            sb.append(s.substring(1, s.length()).toLowerCase());
	        }
	    }
	    System.out.println(sb);
	}
}
