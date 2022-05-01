package stubs;
import java.text.DecimalFormat;
import java.util.*;

class UnitedStates{
	
	int FederalIncomeTax(int Salary) {
		
		int taxamount;
		if(Salary < 10000) {
			taxamount = Salary * 10 / 100;
		}
		else if(10000 > Salary || Salary < 50000) {
			taxamount = Salary * 12 / 100;
		}
		else {
			taxamount = Salary * 18 / 100;
		}
		
		return taxamount;
	}
	
}

class Illinois extends UnitedStates{
	
	int statetaxamount;
	
	int SocialSecurity = 620;
	int MediCare = 145;
	
	int StateIncomeTax(int Salary) {
		
		if(Salary < 10000) {
			statetaxamount = Salary * 4 / 100;
		}
		else if(10000 > Salary || Salary < 50000) {
			statetaxamount = Salary * 5 / 100;
		}
		else {
			statetaxamount = Salary * 6 / 100;
		}
		
		return statetaxamount;
	}
	
}


class NewYork extends UnitedStates{
	
	int statetaxamount;
	
	int SocialSecurity = 800;
	int MediCare = 250;
	
	int StateIncomeTax(int Salary) {
		
		if(Salary < 10000) {
			statetaxamount = Salary * 6 / 100;
		}
		else if(10000 > Salary || Salary < 50000) {
			statetaxamount = Salary * 8 / 100;
		}
		else {
			statetaxamount = Salary * 10 / 100;
		}
		
		return statetaxamount;
	}
	
}

class California extends UnitedStates{
	
	int statetaxamount;
	
	int SocialSecurity = 950;
	int MediCare = 300;
	
	int StateIncomeTax(int Salary) {
		
		if(Salary < 10000) {
			statetaxamount = Salary * 8 / 100;
		}
		else if(10000 > Salary || Salary < 50000) {
			statetaxamount = Salary * 9 / 100;
		}
		else {
			statetaxamount = Salary * 10 / 100;
		}
		
		return statetaxamount;
	}
	
}



class Alabama implements US_FederalTaxBracket{
	
	int statetaxamount;
	
	int SocialSecurity = 500;
	int MediCare = 150;
	
	int StateIncomeTax(int Salary) {
		
		if(Salary < 10000) {
			statetaxamount = (int) (Salary * 0.065);
		}
		else if(10000 > Salary || Salary < 50000) {
			statetaxamount = (int) (Salary * 0.072);
		}
		else {
			statetaxamount = Salary * 10 / 100;
		}
		
		return statetaxamount;
	}

	@Override
	public int FederalIncomeTax(int Salary) {
		// TODO Auto-generated method stub
		int taxamount;
		if(Salary < 10000) {
			taxamount = Salary * 10 / 100;
		}
		else if(10000 > Salary || Salary < 50000) {
			taxamount = Salary * 12 / 100;
		}
		else {
			taxamount = Salary * 18 / 100;
		}
		
		return taxamount;
	}
	
}


class Florida implements US_FederalTaxBracket{
	
	int statetaxamount;
	
	int SocialSecurity = 500;
	int MediCare = 150;
	
	int StateIncomeTax(int Salary) {
		
		if(Salary < 10000) {
			statetaxamount = (int) (Salary * 0.065);
		}
		else if(10000 > Salary || Salary < 50000) {
			statetaxamount = (int) (Salary * 0.072);
		}
		else {
			statetaxamount = Salary * 10 / 100;
		}
		
		return statetaxamount;
	}

	@Override
	public int FederalIncomeTax(int Salary) {
		// TODO Auto-generated method stub
		int taxamount = 0;
		if(Salary < 10000) {
			taxamount = Salary * 10 / 100;
		}
		else if(10000 > Salary || Salary < 50000) {
			taxamount = Salary * 12 / 100;
		}
		else {
			taxamount = Salary * 18 / 100;
		}
		
		return taxamount;
	}
	
}


public class SalaryAfterTax {

	public static void main(String[] args) {
		
		try {
		
			Illinois il = new Illinois();
			NewYork ny = new NewYork();
			California ca = new California();
			Alabama al = new Alabama();
			Florida fo = new Florida();
			
			DecimalFormat rs = new DecimalFormat("'$'###,##0");
			
			Scanner sc = new Scanner(System.in);
			char con = 'N';
			
			do {
				
				System.out.println("Welcome to Salary After Tax - Calculator");
				System.out.println();
				System.out.println("Please select your state");
				System.out.println("1. Illinois");
				System.out.println("2. New York");
				System.out.println("3. California");
				System.out.println("4. Alabama");
				System.out.println("5. Florida");
				
				int choice = sc.nextInt();
				
				System.out.println("Please enter your salary");
				int Salary = sc.nextInt();
				int fed,state = 0;
				long netpay = 0;
				switch(choice) {
				
				case 1: 
					fed = il.FederalIncomeTax(Salary);
					state = il.StateIncomeTax(Salary);
					netpay = Salary -fed - state - il.SocialSecurity - il.MediCare;
					System.out.println("Salary\t\t\t"+rs.format(Salary)+"\n\nFederal Income Tax\t"+rs.format(fed)+"\nState Income Tax\t"+rs.format(state)+"\nSocial Security\t\t"+rs.format(il.SocialSecurity)+"\nMedicare\t\t"+rs.format(il.MediCare)+"\n\nNet pay\t\t\t"+rs.format(netpay));
					break;
					
				case 2: 
					fed = ny.FederalIncomeTax(Salary);
					state = ny.StateIncomeTax(Salary);			
					netpay = Salary - fed - state - ny.SocialSecurity - ny.MediCare;
					System.out.println("Salary\t\t\t"+rs.format(Salary)+"\n\nFederal Income Tax\t"+rs.format(fed)+"\nState Income Tax\t"+rs.format(state)+"\nSocial Security\t\t"+rs.format(ny.SocialSecurity)+"\nMedicare\t\t"+rs.format(ny.MediCare)+"\n\nNet pay\t\t\t"+rs.format(netpay));
					break;
					
				case 3: 
					fed = ca.FederalIncomeTax(Salary);
					state = ca.StateIncomeTax(Salary);
					netpay = Salary - fed - state - ca.SocialSecurity - ca.MediCare;
					System.out.println("Salary\t\t\t"+rs.format(Salary)+"\n\nFederal Income Tax\t"+rs.format(fed)+"\nState Income Tax\t"+rs.format(state)+"\nSocial Security\t\t"+rs.format(ca.SocialSecurity)+"\nMedicare\t\t"+rs.format(ca.MediCare)+"\n\nNet pay\t\t\t"+rs.format(netpay));
					break;
					
				case 4: 
					fed = al.FederalIncomeTax(Salary);
					state = al.StateIncomeTax(Salary);
					netpay = Salary - fed - state - al.SocialSecurity - al.MediCare;
					System.out.println("Salary\t\t\t"+rs.format(Salary)+"\n\nFederal Income Tax\t"+rs.format(fed)+"\nState Income Tax\t"+rs.format(state)+"\nSocial Security\t\t"+rs.format(al.SocialSecurity)+"\nMedicare\t\t"+rs.format(al.MediCare)+"\n\nNet pay\t\t\t"+rs.format(netpay));
					break;
				
				case 5: 
					fed = fo.FederalIncomeTax(Salary);
					state = fo.StateIncomeTax(Salary);
					netpay = Salary - fed - state - fo.SocialSecurity - fo.MediCare;
					System.out.println("Salary\t\t\t"+rs.format(Salary)+"\n\nFederal Income Tax\t"+rs.format(fed)+"\nState Income Tax\t"+rs.format(state)+"\nSocial Security\t\t"+rs.format(fo.SocialSecurity)+"\nMedicare\t\t"+rs.format(fo.MediCare)+"\n\nNet pay\t\t\t"+rs.format(netpay));
					break;
					
				default:
					System.out.println("Please check correct state");
					
				} //switch end
					
				System.out.println("\nIf you want to continue then press Y else N");
				con = sc.next().charAt(0);
				System.out.print('\f');
			} while(Character.toUpperCase(con) == 'Y');
			System.out.println("\nThanks!! have a good day.");
			sc.close();
		} //try end
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}		
		
	}//main ends

}//class ends
