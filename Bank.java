package p2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
	


		Account a;
		Scanner sc=new Scanner(System.in);
		List l=new ArrayList();
		public void createAcccount()
		{
			
			
				System.out.println("enter user name");
				String name=sc.next();
				System.out.println("enter passward");
				int pswd=sc.nextInt();
				System.out.println("enter balence");
				double bal=sc.nextDouble();
				System.out.println("enter accno");
				int accno=sc.nextInt();
				a=new Account(name,pswd,bal,accno);
				l.add(a);
				System.out.println("successfull");
			}
		
		public void removeAccount()
		{
	         System.out.println("enter account no");
	         long accno=sc.nextLong();
	        
	        		 for(int i=0;i<l.size();i++)
	        		 {
	        			 Account a=(Account)l.get(i);
	        			 if(a.getAccno()==accno)
	        			 {
	        				 l.remove(a);
	        				 System.out.println("account removed");
	        				 return;
	        			 }
	        			 
	        		 }
	        		 System.err.println("account already removed");
	        	 
	        		 
	           

	        
			
		}
		public void withdraw()
		{
			System.out.println("enter accno.");
			long accno=sc.nextLong();
			if (accno==a.getAccno())
			{
				System.out.println("enter passward");
				int pswd=sc.nextInt();
				if(pswd==a.getPswd())
				{
					System.out.println("enter amount you want to withdraw");
					double Money=sc.nextInt();
					if(Money<a.getBal())
					{
						double newbal=a.getBal()-Money;
						a.setBal(newbal);
						System.out.println("withdraw is done");
					}
					else
					{
						System.out.println("insufficent money in your acc");
					}
				}
				else
				{
					System.out.println("entered wrong password");
				}
			}
			else
			{
				System.out.println("account not existing");
			}
		}
		public void deposit()
		{
			System.out.println("enter accno.");
			int accno=sc.nextInt();
			if (accno==a.getAccno())
			{
				System.out.println("enter passward");
				int pswd=sc.nextInt();
				if(pswd==a.getPswd())
				{
					System.out.println("enter amount you want to withdraw");
					double Money=sc.nextInt();
					double newbal=a.getBal()+Money;
					a.setBal(newbal);
					System.out.println("money is debitted to account");
				}
				else
				{
					System.out.println("entered wrong password");
				}
			}
			else
			{
				System.out.println("account not existing");
			}
		}
		public void checkbal()
		{
			System.out.println("enter accno");
			long accno=sc.nextLong();
			if(accno==a.getAccno())
			{
				System.out.println("enter passward");
				int pswd=sc.nextInt();
				if(pswd==a.getPswd())
				{
					System.out.println("Balence: "+a.getBal());
				}
				else
				{
					System.out.println( "entered invalid pswd");
				}
			}
			else
			{
				System.out.println("enter valid acc no");
			}
		}
		
	}



