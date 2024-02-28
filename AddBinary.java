package leetcode;

public class AddBinary {

	 public String addBinary(String a, String b) {
	        StringBuffer s=new StringBuffer();
	        int v=a.length()-1;
	        int u=b.length()-1;
	        int cr=0;
	        while(v>=0||j>=0)
	        {
	           int sum=cr;
	            sum+=a.charAt(i)-'0';
	            sum+=b.charAt(i)-'0';
	            s.append(sum%2);
	            cr=sum/2;
	            v--;
	            u--;
	        }
	        if(cr!=0)
	            s.append(cr);
	        return s.reverse().toString();
	        
	    }
	
}
