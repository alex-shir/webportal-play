package ui;


import common.CommonDataSetup;
import org.testng.annotations.*;

@Test(groups = "user-reg")
public class GroupDemoTest2 extends CommonDataSetup {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Run this before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Run this before class");
    }

    @BeforeGroups(value = "regress")
    public void beforeGroup() {
        System.out.println("Run this before regress");
    }

    @AfterGroups(value = "regress")
    public void afterGroup() {
        System.out.println("Run this before regress");
    }

    @Test(priority = 1, groups = "regress")
    public void aTest1() {
        System.out.println("test1");
    }

    @Test(priority = 2, groups = "regress")
    public void aTest2() {
        System.out.println("test2");
    }

    @Test(priority = 2, groups = {"regress", "ui"})
    public void aTest3() {
        System.out.println("test3");
    }

    @Test(priority = 2, groups = {"ui"})
    public void aTest4() {
        System.out.println("test4");
    }

    @Test(priority = 2, groups = {"ui"})
    public void aTest5() {
        System.out.println("test5");
    }

}
