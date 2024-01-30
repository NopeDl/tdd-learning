package com.yeyeye.tdd;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    public int calculate(int input) {
        if (input > 0) {
            return input - 1;
        } else if (input < 0) {
            return input + 1;
        } else {
            return 0;
        }
    }
}
