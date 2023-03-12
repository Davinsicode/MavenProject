import org.testng.annotations.Test;

public class tc1
{
	@Test(groups = "smoke")
	public static void script1()
	{
		System.out.println("#1--->Script one is Execcuted successfully");
	}
	
	@Test(groups = "smoke")
	public static void script2()
	{
		System.out.println("#1--->Script two is Execcuted successfully");
	}
	
	@Test(groups = {"smoke","regressioin"})
	public static void script3()
	{
		System.out.println("#1--->(Regression)Script three is Execcuted successfully");
	}
}
