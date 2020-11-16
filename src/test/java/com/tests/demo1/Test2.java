package com.tests.demo1;

import org.testng.annotations.Test;

public class Test2 {
    @Test(groups = "group1")
    public void testMethod13() {
        System.out.println("This is my Third testcase");
    }

    @Test(groups = "group2")
    public void testMethod4() {
        System.out.println("This is my Fourth testcase");
    }
}
