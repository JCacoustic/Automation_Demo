package com.tests.demo1;

import org.testng.annotations.Test;

public class Test1 {
    @Test(groups = "group1")
    public void testMethod1() {
        System.out.println("This is my first testcase");
    }

    @Test(groups = "group2")
    public void testMethod2() {
        System.out.println("This is my second testcase");
    }
}
