package basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {

	@BeforeMethod
	public void setup() {

		System.out.println("from setup");
	}

	@AfterMethod
	public void tearDown() {

		System.out.println("from tearDown");
	}

	@Test
	public void ts1() {

		System.out.println("from tc1");
	}
}
