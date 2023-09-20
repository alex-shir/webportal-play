package common;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

public class CommonDataSetup {

    @BeforeSuite
    public void dataSetup() {
        System.out.println("Common data setup");
    }

    @AfterClass
    public void dataTeardown() {
        System.out.println("Common data cleanup");
    }

}
