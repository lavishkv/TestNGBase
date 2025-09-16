package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Basics2 {

    @Test
    public void test1(){
        System.out.println("Successfully1");
    }

    @Test
    public void test2(){
        System.out.println("Successfully2");
    }

    @Test(groups = {"smoke"})
    public void test3(){
        System.out.println("Successfully3");
    }

    @Test(groups = {"smoke"})
    public void test4(){
        System.out.println("Successfully4");
    }

    @Test
    public void test5(){
        System.out.println("Successfully5");
    }

    @Test(enabled = false)
    public void test6(){
        System.out.println("Successfully6");
    }

    @Test(dataProvider = "getData")
    public void getUsernamePassword(String username, String password){
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getData(){

        Object[][] dataset = new Object[3][2];

        dataset[0][0] = "user1";
        dataset[0][1] = "pwd1";

        dataset[1][0] = "user2";
        dataset[1][1] = "pwd2";

        dataset[2][0] = "user3";
        dataset[2][1] = "pwd3";

        return dataset;
    }


}
