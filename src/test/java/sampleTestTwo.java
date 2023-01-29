import org.testng.annotations.Test;

public class sampleTestTwo {

	@Test(groups = {"smoke"})
	public void test1()
	{
		System.out.println("Maven Test Successfull + Smoke-1, Sample2 ");
	}
	@Test(groups = {"smoke"})
	public void test2()
	{
		System.out.println("Maven Test Successfull + Smoke-2, Sample2 ");
	}
	@Test(groups = {"smoke","regression"})
	public void test3()
	{
		System.out.println("Maven Test Successfull + Smoke-3, Sample2 ");
	}

}
