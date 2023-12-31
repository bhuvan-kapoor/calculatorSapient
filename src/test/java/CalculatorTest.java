import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(DataProviderRunner.class)
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @DataProvider
    public static Object[][] dataProviderPositive() {
        return new Object[][]{
                {"12", "2121212", "2121224"},
                {"2121212", "12", "2121224"},
                {"212121221212122121212212121221212122121212", "212121221212122121212212121221212122121212", "424242442424244242424424242442424244242424"},
                {"0", "212121221212122121212212121221212122121212", "212121221212122121212212121221212122121212"},
                {"1", "1", "2"},
                {"", "2", "2"}
        };
    }

    @DataProvider
    public static Object[][] dataProviderNegative() {
        return new Object[][]{
                {"12", "2121212", "11"},
                {"-2", "2", "0"},
                {"212121221212122121212212121221212122121212", "212121221212122121212212121221212122121212", "4.2424244e+41"},
                {"1", "0", "2"},
                {"", "2", ""},
        };
    }


    @Test
    @UseDataProvider("dataProviderPositive")
    public void testPositive(String str1, String str2, String expected)
    {
        Assert.assertEquals(calculator.addition(str1, str2),
                expected);
    }

    @Test
    @UseDataProvider("dataProviderNegative")
    public void testNegative(String str1, String str2, String expected)
    {
        Assert.assertNotSame(calculator.addition(str1, str2),
                expected);
    }


    /*
    Example of data provider where the code would break
    with exceptions

    @DataProvider
    public static Object[][] dataProviderOther() {
        return new Object[][]{
                {1,2,4},
                {[1,2,3], [1,2,3], [0]},
                {"ss", "ll", "k"}
        };
    }

    @Test
    @UseDataProvider("dataProviderOther")
    public void testOther(String str1, String str2, String expected)
    {
        Assert.assertEquals(calculator.addition(str1, str2),
                expected);
    }
    */

}
