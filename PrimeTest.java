import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PrimeTest {
private Integer inputNumber;
private Boolean expectedResult;
Private Prime prime;
@Before
public void initialize() {
       prime=new Prime();
}
public PrimeTest(Integer inputNumber,Boolean expectedResult)
{
	this.inputNumber=inputNumber;
	this.expectedResult=expectedResult;
}
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] {
			{2,true},{6,false},{19,true},{22,false},{23,true}
		});
	}
	@Test
	public voidtestPrimeNumberChecker) {
		System.out.println("Parameterized Number is:"+ input Number);
		assertEquals(expectedResult,prime.validate(inputNumber));
	}
		})
	}
