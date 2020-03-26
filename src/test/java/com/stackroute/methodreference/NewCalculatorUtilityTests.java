package com.stackroute.methodreference;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewCalculatorUtilityTests {
    private static final String MESSAGE_ONE = "Should return the product result when super type compute function is called using method reference and super keyword";
    private static final String MESSAGE_TWO = "Should return the power result when sub type compute function is called using method reference";
    private static final String MESSAGE_THREE = " should return the product result when super type compute function is called";
    private static final String MESSAGE_FOUR = " should return the power result when sub type compute function is called";
    private NewCalculatorUtility newCalculatorUtility;

    @BeforeEach
    public void setUp() {
        newCalculatorUtility = new NewCalculatorUtility();
    }

    @AfterEach
    public void tearDown() {
        newCalculatorUtility = null;
    }

    @Test
    public void givenTwoPositiveIntegersWhenSuperTypeCalledThenReturnProductResult() {
        assertEquals(30, newCalculatorUtility.getProductResult(10, 3), MESSAGE_ONE);
    }

    @Test
    public void givenTwoPositiveIntegersWhenSubTypeCalledThenReturnPowerResult() {
        assertEquals(1000, newCalculatorUtility.getPowerResult(10, 3), MESSAGE_TWO);
    }

    @Test
    public void givenTwoIntegersWithZeroValuesWhenSuperTypeCalledThenReturnZero() {
        assertEquals(0, newCalculatorUtility.getProductResult(0, 0), MESSAGE_ONE);
    }

    @Test
    public void givenTwoIntegersWithZeroValuesWhenSubTypeCalledThenReturnOne() {
        assertEquals(1, newCalculatorUtility.getPowerResult(0, 0), MESSAGE_TWO);
    }

    @Test
    public void givenTwoNegativeIntegersWhenSuperTypeCalledThenReturnProductResult() {
        assertEquals(30, newCalculatorUtility.getProductResult(-10, -3), MESSAGE_ONE);
    }

    @Test
    public void givenTwoNegativeIntegersWhenSubTypeCalledThenReturnPowerResult() {
        assertEquals(-0.001, newCalculatorUtility.getPowerResult(-10, -3), MESSAGE_TWO);
    }

    @Test
    public void givenTwoIntegersWhenSuperTypeComputeMethodCalledThenReturnProductResult() {
        CalculatorUtility calculatorUtility = new CalculatorUtility();
        assertEquals(30, calculatorUtility.compute(10, 3), MESSAGE_THREE);
    }

    @Test
    public void givenTwoIntegersWhenSubTypeComputeMethodCalledThenReturnPowerResult() {
        assertEquals(1000, newCalculatorUtility.compute(10, 3), MESSAGE_FOUR);
    }

}
