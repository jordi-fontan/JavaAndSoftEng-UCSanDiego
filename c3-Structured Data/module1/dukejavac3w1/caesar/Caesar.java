package dukejavac3w1.caesar;

public class Caesar {
	String alphabet="abcdefghijklmnopqrstuvwxyz";
	String shitedAlphabet;
	public String encryptCaesar(String input, int key)
	{
		
		StringBuilder sb=new StringBuilder(input);
		this.setShiftAlfabet(key);
		 
		
		
		for(int i=0;i<sb.length();i++)
		{
			char currChar = sb.charAt(i);
			int idx = alphabet.indexOf(currChar);
			if(idx!=-1) {
				
				char newChar= this.shitedAlphabet.charAt(idx);
				sb.setCharAt(i, newChar);
			}		
		}	
		System.out.println(sb);
		
		
		
		
		return shitedAlphabet;
		
		
	}
	
	public void setShiftAlfabet(int key)
	{
		shitedAlphabet=alphabet.substring(key) + 
				alphabet.substring(0,key);
		System.out.println("Shifted Alphabet : "+ shitedAlphabet);
		
	}

public static void main(String agrs[])
{
	String test= "at noon be in the conference room with your hat on for a surprise party. yell loud!";
	Caesar c=new Caesar();
	c.encryptCaesar(c.encryptCaesar(test, 8),21);

}



}
