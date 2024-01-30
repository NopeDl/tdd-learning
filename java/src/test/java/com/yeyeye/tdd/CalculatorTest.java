package com.yeyeye.tdd;

import cn.hutool.core.util.RandomUtil;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CalculatorTest {
    @Resource
    private Calculator calculator;

    @Test
    @DisplayName("入参大于等于100，计算其减1的值并返回")
    public void givenGreaterThan100() {
        int input = RandomUtil.randomInt(100, Integer.MAX_VALUE);
        int expect = input - 1;

        int actual = calculator.calculate(input);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    @DisplayName("入参大于0且小于100，返回平方值")
    public void givenGreaterThan0AndLowerThan100() {
        int input = RandomUtil.randomInt(1, 100);
        int expect = input * input;

        int actual = calculator.calculate(input);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    @DisplayName("入参等于0，直接返回0")
    public void givenEqualTo0() {
        int input = 0;
        int expect = 0;

        int actual = calculator.calculate(input);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    @DisplayName("入参小于0，计算其加1的值并返回")
    public void givenLowerThan0() {
        int input = RandomUtil.randomInt(-10, -1);
        int expect = input + 1;

        int actual = calculator.calculate(input);
        Assertions.assertEquals(expect, actual);
    }
}
