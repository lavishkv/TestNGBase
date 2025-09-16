package org.example;

import org.testng.annotations.*;

public class Annotations {

    @Test
    public void testmethod1(){
        System.out.println("TestMethod1: Hello");
    }

    @Test
    public void testmethod2(){
        System.out.println("TestMethod2: Hello");
    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("TestMethodBeforeSuite: TestSuite");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("TestMethodAfterSuite: TestSuite");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("TestMethodBeforeClass: Hi");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("TestMethodAfterClass: Hi");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("TestMethodBeforeMethod: Hola");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("TestMethodAfterMethod: Hola");
    }

    @BeforeTest
    public void beforetest(){
        System.out.println("TestMethodBeforeTest: Hey");
    }

    @AfterTest
    public void aftertest(){
        System.out.println("TestMethodAfterTest: Hey");
    }


}
