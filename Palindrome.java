import java.util.Scanner;
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,rev=0,n;
		  Scanner as=new Scanner(System.in);
		  System.out.println("Enter the string");
		  a=as.nextInt();b=a;
		while(a!=0){
		
			n=a%10;
			rev=rev*10+n;
			a=a/10;
			
		}
		if(b==rev){
			System.out.println("palindrome");
			
	}else{System.out.println("not palindrome");
	
		
	}
	}

}
