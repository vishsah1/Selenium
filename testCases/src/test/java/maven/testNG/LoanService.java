package maven.testNG;

import org.testng.annotations.Test;

public class LoanService {

	@Test
	public void MobileLoginPersonalLoan()
	{
		System.out.println("Personal Loan Mobile Login");
	}

	@Test
	public void WebLoginPersonalLoan()
	{
		System.out.println("Personal Loan WEB Login");
	}

	@Test
	public void APILoginPersonalLoan()
	{
		System.out.println("Personal Loan API Login");
	}

	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("Car Loan Mobile Login");
	}

	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("CAR Loan WEB Login");
	}

	@Test
	public void APILoginCarLoan()
	{
		System.out.println("car Loan API Login");
	}
}
