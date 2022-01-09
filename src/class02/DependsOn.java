package class02;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void login(){
       //System.out.println(10/0);
        System.out.println("I am login");
    }
    @Test(dependsOnMethods = "login") // will also execute the tests this test deoends on
    public void verification(){
        System.out.println("I am dependent scenario");
    }
    // first one has to pass in order for second to be executed

}
