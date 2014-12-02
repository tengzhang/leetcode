package com.tcheung;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * Trie
 *
 * @author: zhangteng
 * @time: 2014/7/23 19:07
 */
public class Trie {

    public static final int DEFAULT_CHILD_NUM = 26;

    public static Node root;

    static class Node {

        int val;

        Node[] children = new Node[DEFAULT_CHILD_NUM];

        Node() {
            for(int i = 0;i < DEFAULT_CHILD_NUM; ++i) {
                children[i] = null;
            }
        }
    }

    public static void build(String[] words) {

        if(root == null) {
            root = new Node();
        }

        Node cur;

        for(String word : words) {
            int len = word.length();
            cur = root;
            for(int i = 0;i < len; ++i) {
                if(cur.children[word.charAt(i) - 'a'] == null) {
                    cur.children[word.charAt(i)-'a'] = new Node();
                } else {
                    cur.children[word.charAt(i)-'a'].val ++;
                }
                cur = cur.children[word.charAt(i)-'a'];
            }
        }
    }

    public static int find(String word) {
        if(root == null) {
            return 0;
        }
        Node cur = root;
        int i;
        for(i = 0;i < word.length(); ++i) {
            if(cur.children[word.charAt(i)-'a'] == null) {
                break;
            }
            cur = cur.children[word.charAt(i)-'a'];
        }

        if(i==word.length() && cur!=null) {
            return cur.val;
        }
        return 0;
    }

    public static void main(String[] args) {
        int m, n;
        Scanner cin = new Scanner(new BufferedInputStream(System.in));

        n = cin.nextInt();
        String[] words = new String[n];
        for(int i = 0;i < n; ++i) {
            words[i] = cin.next();
        }
        build(words);

        m = cin.nextInt();
        String word;
        for(int i = 0;i < m; ++i) {
            word = cin.next();
            System.out.println(find(word));
        }
    }
}
