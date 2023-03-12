import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ts3 
{
	@Parameters("ref")
	@Test
	public static void test(String ref)
	{
		System.out.println(ref);
	}
}
