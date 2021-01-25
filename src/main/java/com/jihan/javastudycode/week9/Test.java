package com.jihan.javastudycode.week9;

public class Test {
    public static void main(String[] args)  {
        try {
            cal();
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }

    static void cal () throws CustomException {
        try {
            int x = 0/0;
        } catch (ArithmeticException e) {
            throw new CustomException("custom error!", e, CommonErrorCode.COMMON_ERROR);
        }
    }
}
