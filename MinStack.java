package com.tcheung;

import java.util.Stack;

/**
 * MinStack
 *
 * @author: zhangteng
 * @time: 2014/11/14 21:12
 */
class MinStack {

    static class Element {
        int val, min;
        public Element(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    private int min;

    private Stack<Element> stack = new Stack<Element>();

    public void push(int x) {
        if (stack.isEmpty()) {
            min = x;
        } else {
            min = Math.min(stack.peek().min, x);
        }
        stack.push(new Element(x, min));
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().val;
    }

    public int getMin() {
        return stack.peek().min;
    }
}
