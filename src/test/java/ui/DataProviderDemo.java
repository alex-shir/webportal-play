package ui;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderDemo {
    @DataProvider(name = "create")
    public Object[][] dataSet1(Method m) {
        Object[][] testdata = null;

        if (m.getName().equals("test")) {
            testdata = new Object[][]{
                    {"standard_user", "secret_sauce"},
                    {"locked_out_user", "secret_sauce"},
                    {"problem_user", "secret_sauce"},
                    {"performance_glitch_user", "secret_sauce"}};

        } else if (m.getName().equals("test1")) {
            testdata = new Object[][]{
                    {"standard_user", "secret_sauce", "test1"},
                    {"locked_out_user", "secret_sauce", "test2"},
                    {"problem_user", "secret_sauce", "test3"},
                    {"performance_glitch_user", "secret_sauce", "test4"}};
        } else if (m.getName().equals("test2")) {
            testdata = new Object[][]{
                    {"standard_user", "secret_sauce", "test1", "test1"},
                    {"locked_out_user", "secret_sauce", "test2", "test2"},
                    {"problem_user", "secret_sauce", "test3", "test3"},
                    {"performance_glitch_user", "secret_sauce", "test4", "test4"}};
        }
        return testdata;
    }

}
