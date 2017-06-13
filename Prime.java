import java.util.Scanner;


public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arg,flag=0;
		  Scanner as=new Scanner(System.in);
		  System.out.println("Enter the string");
		  arg=as.nextInt();
		 
		  for(int j=2;j<=arg/2;j++){
			  if(arg%j==0){
			  flag=1;
			  
		  }}
		  if(flag==0){
			  System.out.println("Prime number");
			  
		  }
		  else{
			  System.out.println("not a prime number");
		  }
	}

	}
