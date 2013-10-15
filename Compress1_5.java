package String;

import java.util.Arrays;

public class Compress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "aabccccccaaa";
		String newStr = compress(str);
		System.out.print(newStr);

	}
	/**Implement a method to perform basic string compression using the counts of repeated characters.
	 *  For example, the string aabccccccaaa would become a2b1c5a3. If the "compressed" 
	 *  string would not become smaller than the original string, your method should return the original string. 
	**/

	public static String compress(String str){
		if(str == null || str.isEmpty()) return null;
		char[] chars = new char[str.length()];
		for(int i=0; i<str.length();i++){
			chars[i] = str.charAt(i);
		}
		Arrays.sort(chars);
		char compare = chars[0];
		int counter =1; 
		String compress="";
		String totalCompress = "";
		for(int i=1; i<chars.length; i++){
			if(compare==chars[i]){
				counter++;
			}else{
			
				compress = String.valueOf(compare)+Integer.toString(counter);
				totalCompress = totalCompress + compress;
				counter=1;
				compare = chars[i];
			}
		}
		compress = String.valueOf(compare)+Integer.toString(counter);//This two lines of code is for catching the last char and its size
		totalCompress = totalCompress + compress;
		
		return totalCompress;
		
	}

}