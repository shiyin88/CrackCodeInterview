package String;

public class ReplaceSpace1_4 {

	/**
	 /**
	write a method to replace all spaces in a string with '%20'.
	 You may assume that the string has sufficient space at the 
	 end of the string to hold the additional characters and 
	 that you are given the "true" length of the string. 
**/
	 
	public static void main(String[] args) {
		char[] str = {'i',' ','a', 'm',' ','a',' '};
		char[] newS = replaceSpace(str);
		for(int i=0; i<newS.length; i++){
			System.out.print(newS[i]);
		}
	}
	

	public static char[] replaceSpace(char[] str){
		int count=0;
		for(int i=0; i<str.length; i++){
			if(str[i]==' '){
				count++;
			}
		}	
		int totalLength = count*2 + str.length;
		char[] newStr = new char[totalLength];
			int a=0;
			for(int i=0; i<newStr.length; i++){
				if(a<str.length){
					if(str[a]==' '){
						newStr[i]='%';
						newStr[++i]='2';//increment i first and then add one 
						newStr[++i]='0';
				
					}else{
						newStr[i]=str[a];
					}
					a++;
				}
			}
		return newStr;
	}

}
