package com.jihan.javastudycode.week12;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TestInfo {
    String[] testTools() default { "JUnit", "AutoTester" };
}

@interface DateTime {
    String yymmdd();
    String hhmmss();
}

enum TestType {
    FIRST, FINAL
}
