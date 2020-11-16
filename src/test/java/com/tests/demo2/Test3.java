package com.tests.demo2;

import org.testng.annotations.Test;

public class Test3 {
    @Test(groups = "group1")
    public void testMethod5() {
        System.out.println("This is my 5th testcase");
    }

    @Test(groups = "group2")
    public void testMethod6() {
        System.out.println("This is my 6th testcase");
    }
}
