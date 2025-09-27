import java.util.*;
class example{
	
	
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		System.out.println("---------------------------------------------------------");
		System.out.println("|\t\tSALARY INFORMATION SYSTEM\t\t|");
		System.out.println("---------------------------------------------------------\n\n");
		System.out.println("\t[1] Calculate Income Tax");
		System.out.println("\t[2] Calculate Annual Bonus");
		System.out.println("\t[3] Calculate Loan amount\n");
		System.out.print("Enter an option to continue > ");
		int option = input.nextInt();
			switch (option)
			{
				case 1:
					System.out.println("---------------------------------------------------------");
					System.out.println("|\t\tCalculate Income Tax\t\t\t|");
					System.out.println("---------------------------------------------------------\n\n");
					System.out.print("Input Employee name  - ");
					String name = input.next();
					System.out.print("Input Employee salary  - ");
					int salary = input.nextInt();
					double Incometax=0;
					if (salary>308333)
					{
						Incometax=salary*0.36;
						
					}else if (salary>266667)
					{
						Incometax = salary*0.30;
						
					}else if (salary>225000)
					{
						Incometax=salary*0.24;
						
					}else if (salary>183333){
						
						Incometax=salary*0.18;
						
					}else if (salary>141667){
						
						Incometax=salary*0.12;
						
					}else if (salary>100000){
						
						Incometax=salary*0.06;
					}else
					{
						System.out.println("You have not pay Income Tax...");
					}
						System.out.println("You have to pay Income Tax per month: "+Incometax);						
				break;
				case 2:
					System.out.println("---------------------------------------------------------");
					System.out.println("|\t\tCalculate Annual Bonus\t\t\t|");
					System.out.println("---------------------------------------------------------\n\n");
					System.out.print("Input Employee name  - ");
					 name = input.next();
					System.out.print("Input Employee salary  - ");
					 salary = input.nextInt();
					double annualBonus=0;
						if (salary>=400000)
						{
							annualBonus=salary*0.35;
						
						}else if (salary>=300000)
						{
							annualBonus = salary*0.20;
						
						}else if (salary>=200000)
						{
							annualBonus=salary*0.15;
						
						}else if (salary>=100000)
						{
						
							annualBonus=salary*0.10;
						
						}else
						{						
							System.out.println("Annual bouns   - 5000");
						}
						System.out.print("Annual Bonus :  "+annualBonus);
				break;
				
				case 3:
					System.out.println("---------------------------------------------------------");
					System.out.println("|\t\tCalculate Loan amount\t\t\t|");
					System.out.println("---------------------------------------------------------\n\n");
					System.out.print("Input Employee name  - ");
					name = input.next();
					System.out.print("Input Employee salary  - ");
					salary = input.nextInt();
					
					
					if (salary>50000)
					{
						
						System.out.print("Enter number of year :  ");
						int year = input.nextInt();
						if (year<=5)
						{
							int n = year;
							double r = 0.15;
							double monthlyInstallment = salary*0.6;
							double LoanAmount;
							LoanAmount = monthlyInstallment * (1 -(1/Math.pow(1+(r/12),n)))/(r/12);
							LoanAmount = Math.round(LoanAmount/1000.0)*1000.0;
							System.out.print("You can get Loan Amount : "+(int)LoanAmount);
						}else
						{
						System.out.print("You can not get Loan beacause maximum year is 5 year... ");
						}
						
					}else
					{
						System.out.print("You can not get Loan beacause your salary lessthan Rs.50 000... ");
					}
		
				break;
				default:
					System.out.print("Invalid number...Try again...");
			}
	}
}

