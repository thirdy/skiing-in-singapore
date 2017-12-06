package io.github.thirdy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SkiingCalculatorTest {
    @Test
    public void calculate() throws Exception {
        Result result = SkiingCalculator.calculate(new int[][]{
                {4, 4},
                {4, 8, 7, 3},
                {2, 5, 9, 3},
                {6, 3, 2, 5},
                {4, 4, 1, 6}
        });
    }

}