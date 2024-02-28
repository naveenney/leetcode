package leetcode;
import java.util.*;
public class RomanToIntigers {
    public int romanToInt(String s) {
	    	Map <Character,Integer> m=roman();
    int sum=m.get(s.charAt(s.length()-1));
	for(int i=s.length()-2;i>=0;i--)
	{   
		if(m.get(s.charAt(i))<m.get(s.charAt(i+1)))
			sum-=m.get(s.charAt(i));
		else
			sum+=m.get(s.charAt(i));

	
   	}
	return sum;
}

public Map<Character,Integer> roman()
{
	Map<Character,Integer> d=new HashMap<>();
	
	d.put('I',1);
	d.put('V',5);
	d.put('X',10);
	d.put('L',50);
	d.put('C',100);
	d.put('D',500);
	d.put('M',1000);
	
	return d;
}
	
}
