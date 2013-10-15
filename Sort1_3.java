public static boolean Sort(String a, String b){
	if(a.length()!=b.length()) return false;
	char[] aChar = a.toCharArray();
	char[] bChar = a.toCharArray();
	
	Arrays.sort(aChar);
	Arrays.sort(bChar);
	
	if(aChar.equals(bChar)) return true;
	
	else false;
	
}