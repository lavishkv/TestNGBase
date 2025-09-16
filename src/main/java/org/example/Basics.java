package org.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics {

    @Parameters({"URL"})
    @Test
    public void base1(String urladdress){
        System.out.println("Test");
        System.out.println(urladdress);
    }

    @Test(groups = {"smoke"})
    public void base2(){
        System.out.println("Running");
    }

    @Test(timeOut = 1000)
    public void base3(){
        System.out.println("Successfully");
    }

    @Test
    public void base4(){
        System.out.println("Running");
    }

    @Test
    public void base5(){
        System.out.println("Test");
    }

    @Test(dependsOnMethods = {"test2"})
    public void base6(){
        System.out.println("Successfully");
    }

}
