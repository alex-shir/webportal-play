package ui;


import common.CommonDataSetup;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest extends CommonDataSetup {

    Boolean datasetup = true;

    @Test(enabled = false)
    public void skipTest1() {
        System.out.println("Skip test1");
    }

    @Test
    public void skipTest2() {
        System.out.println("Skip test2");
        throw new SkipException("Skipping this test");
    }

    @Test
    public void skipTest3() {

        System.out.println("Skip test3 on condition");
        if (datasetup) {
            System.out.println("Execute the test");
        } else {
            System.out.println("Do not execute steps");
            throw new SkipException("Do not execute steps");
        }
    }

}
