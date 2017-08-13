/**
 * Created by hua on 2017/8/12.
 */
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C{
    @Test(groups={"functest","checkintest"})
    public void testMethod1(){
    }
    @Test(groups={"checkintest"})
    public void testMethod2(){
    }
    @Test(groups={"checkintest"})
    public void testMethod3(){
    }


    @Parameters({ "first-name" })
    @Test
    public void testSingleString(String firstName) {
        System.out.println("Invoked testString " + firstName);
        assert "Cedric".equals(firstName);
    }}
//public class C {
//    @Test
//    public void testcase1(){
//        Assert.assertTrue(true);
//        System.out.println("testcase1");
//    }
//    @Test
//    public void testcase2(){
//        Assert.assertTrue(true);
//        System.out.println("testcase1");
//    }
//}
