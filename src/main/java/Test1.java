import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by hua on 2017/8/13.
 */
@Test
public class Test1 {
    @Test(groups={"windows.checkintest"})
    public void testWindowsOnly(){
    }
    @Test(groups={"Linux.checkintest"})
    public void testLinuxOnly(){
    }
    @Test(groups={"windows.functest"})
    public void testWindowsToo(){
    }

    @Parameters({ "first-name" })
    @Test
    public void testSingleString(String firstName) {
        System.out.println("Invoked testString " + firstName);
        assert "Cedric".equals(firstName);
    }

}
