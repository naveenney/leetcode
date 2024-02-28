package leetcode;

public class ValidPalindrome {

	public boolean isPalindrome(String s)
	{
		String str=s.replaceAll("[^a-zA-Z0-9]","");
		StringBuilder s1=new StringBuilder(str);
		s1.reverse();
		String s2=s1.toString();
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)!=str.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
	
}
