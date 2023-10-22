package JavaProgram;


public class StringRevers {
	  
	public static void main (String [] args) {
		String Name = "103";
		int len= Name.length();
		System.out.println(Name);
		System.out.println(len);
		
		String rev=" ";
		for(int i=len-1; i>=0; i--) 
		{
			
			rev= rev+Name.charAt(i);
		}
		
		System.out.println(rev);
		
	    }
	
	    
}
