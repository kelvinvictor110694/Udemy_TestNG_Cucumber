package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {
    @Test
    public void Test1(){
        System.out.println("hello1");
    }

    @DataProvider
    public Object[][] data(){
        System.out.println("bye1");
        Object[][] obj = new Object[2][2];
        obj [0][0] = "kelvin";
        obj [0][1] = 30;
        obj [1][0] = "Rosanna";
        obj [1][1] = 29;
        return obj;
    }
    @Test (dataProvider = "data")
    public void test2(String username, int password){
        System.out.println(username+","+password);
    }
}
