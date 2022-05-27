package com.lee.designPattern.原型模式.app;

public class D1 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 5, 5, 3, 1, 2, 7};

        Integer[] ret = new Integer[8];
        ret[0] = 0;

        for (int i = 0; i < 8; i++) {
            ret[arr[i]] = ret[arr[i]] + 1;
        }

        // 打印
        int tmp;
        for (int k = 0; k < 8; k++) {

            if (ret[k] > 0) {

                tmp = ret[k];

                while (tmp > 0) {

                    System.out.println(k + "\t");
                    tmp--;
                }
            }
        }
    }
}
