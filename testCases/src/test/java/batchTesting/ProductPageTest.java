package batchTesting;

import org.testng.annotations.Test;

public class ProductPageTest {
	
	@Test
	public void AddProductToWishList()
	{
		System.out.println("Product has been Sucessfully added to wishList");
	}
	
	@Test
	public void AddProductToCart()
	{
		System.out.println("Product has been Sucessfully added to CART");
	}
	
	@Test
	public void SelectQuantity()
	{
		System.out.println("Quantatity has been Sucessfully selected");
	}

}
