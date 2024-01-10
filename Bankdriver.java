package p2;

import java.util.List;
import java.util.Scanner;

public class Bankdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      Bank b=new Bank();
	      Scanner sc=new Scanner(System.in);
	      for (;;)
	      {
	    	System.out.println("1.createaccount 2.removeaccount 3.withdraw 4.deposit 5.checkbal 6.exit");  
			switch(sc.nextInt())
			{
			 case 1:b.createAcccount();
			 break;
			 case 2:b.removeAccount();
			 break;
			 case 3:b.withdraw();
			 break;
			 case 4:b.deposit();
			 break;
			 case 5:b.checkbal();
			 break;
			 case 6:System.exit(5);
			 break;
			}		
		  }
	    }

	

	}


