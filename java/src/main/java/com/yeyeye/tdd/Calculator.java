package com.yeyeye.tdd;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int calculate(int input) {
        if (input > 0) {
            return doGreaterThan0(input);
        } else if (input < 0) {
            return doLowerThan0(input);
        } else {
            return doEqualTo0(input);
        }
    }

    private int doGreaterThan0(int input) {
        if (input < 100) {
            return input * input;
        } else {
            return input - 1;
        }
    }

    private int doEqualTo0(int input) {
        return input;
    }

    private int doLowerThan0(int input) {
        return input + 1;
    }
}
