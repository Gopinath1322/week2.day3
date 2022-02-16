package week1.day5;



public class CharOccrance {
	public static void main(String[] args) {
		String str="welcome to chennai";
		int count = 0;
		char a='e';
		
		char[] charArray = str.toCharArray();
	System.out.println(charArray);
		
		
		for (int i = 0; i < str.length(); i++) {
			
				
				if(charArray[i]==a) {
					count++;
				}
			}
			System.out.println("occurance "+a+" is "+ count);
		}
	}


