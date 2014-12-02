package com.tcheung;

/**
 * Solution
 *
 * @author: zhangteng
 * @time: 2014/7/6 10:57
 */
public class Solution {

    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int length0 = strs[0].length(), arrSize = strs.length;
        boolean flag = true;
        for (int i = 0; i < length0; ++i) {
            for (int j = 1; j < arrSize; ++j) {
                if (strs[j].length() < i + 1 || strs[j].charAt(i) != strs[0].charAt(0)) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                res += strs[0].charAt(i);
            } else {
                break;
            }
        }
        return res;
    }
}
