package mavensample;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Welcome";
		System.out.println(s);
		char a[]= {'v','r','s'};
		String s1=new String(a);
		System.out.println(s1);
		
		//length
		int b=s.length();
		System.out.println(b);
		
		//concatenation
		String s2="hi";
		System.out.println(s2.concat(s));
		
	//contains
	String s3=" How are You";
	System.out.println(s3.contains("How"));
	System.out.println(s3.contains("All"));
	

	}

}
