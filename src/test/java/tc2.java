import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tc2 
{
	
	@Test(groups = "smoke")
	public static void script1()
	{
		System.out.println("#2--->Script one is Execcuted successfully");
	}
	
	@Test(groups = {"smoke","regressioin"})
	public static void script2()
	{
		System.out.println("#2--->(Regression)Script two is Execcuted successfully");
	}
	
	@Test(groups = {"smoke","regressioin"})
	public static void script3()
	{
		System.out.println("#2--->(Regression)Script three is Execcuted successfully");
	}
	@Parameters("ref")
	@Test
	public static void test(String ref)
	{
		System.out.println("Passed Parameter value is: "+ ref);
	}
}
