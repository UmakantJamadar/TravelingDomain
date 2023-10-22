package JavaProgram;

public class StringRevNAME {
	
	
	
	public static void main(String[]args ) {
		 
		String Name = "Umakant Jamadar";
		int len = Name.length();
		System.out.println(Name);
		System.out.println(len);
		
		String rev[]= Name.split(" ");
		for(int i=rev.length-1; i>=0; i--)
		{
			System.out.print(rev[i] + " ");
		}
		
//		String str= "103";
//		int lent= str.length();
//		
//		System.out.println(str);
//		System.out.println(lent);
//		
//		String revr=" ";
//		for(int i=lent-1; i>=0; i--)
//		{
//			revr= revr+str.charAt(i);
//		}
//		
//		System.out.println(str);
//		System.out.println(revr);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[]args) {
//		
//		String srt = "Umakant Jamadar";
//		System.out.println(srt);
//		
//		String rev[]= srt.split(" ");
//		System.out.println("before STring rever ");
//		for(int i=rev.length-1; i>=0; i--)
//		{
//			System.out.print(rev[i] + " " );
//		}
//		
//		
//	}

}
