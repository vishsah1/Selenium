package batchTesting;

import org.testng.annotations.Test;

public class PaymentPageTest {
	
	@Test
	public void NetBanking()
	{
		System.out.println("Sucessfully paid via NetBanking");
	}
	
	@Test
	public void CreditCard()
	{
		System.out.println("Sucessfully paid via CreditCard");
	}

}
