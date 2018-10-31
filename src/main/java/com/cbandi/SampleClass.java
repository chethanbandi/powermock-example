package com.cbandi;

public class SampleClass {

    public static void method1() {
        method2();
    }

    private static void method2() {
        int ret = method3(1L, 2);
        System.out.println(ret);
    }

    public static int method3(long arg1, int arg2) {
        return 10;
    }
}
