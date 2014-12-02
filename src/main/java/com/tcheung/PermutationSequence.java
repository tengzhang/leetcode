package com.tcheung;

/**
 * PermutationSequence
 *
 * @author: zhangteng
 * @time: 2014/12/2 23:03
 */
public class PermutationSequence {

    public String getPermutation(int n, int k) {
        int num[] = {0};
        String res = "";
        k = k-1;
        int m = n-1, a, b;
        while(m > 0) {
            b = getFactorial(m);
            a = k / b;
            if (a == 0) {
                num[]
                res += 1;
            } else {
                res += a + 1;
            }
            a = k % b;
            m --;
        }
        return res;
    }

    private int getFactorial(int n) {
        int res = 1;
        for (int i = n;i > 1; --i) {
            res *= i;
        }
        return res;
    }


}
