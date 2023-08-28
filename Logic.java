package Practice;

public class Logic {

	public static void main(String[] args) 
	{
	
		for(char i='z';i>='a';i--)
		{
			for(int j='z';j>=i;j--) {
			
			System.out.print(" ");

			}
			for(int j='a';j<=i;j++) {
				
			System.out.print(i+" ");

			}
			
			System.out.println();
		}
		
		
		
	}
}
