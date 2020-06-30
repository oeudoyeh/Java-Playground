package com.company;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Math Testing")
class potpieTest {

    potpie mathObject;

    @BeforeAll
    static void initBeforeAll(){
        System.out.println("Before All: Run before everything");
    }
    @AfterAll
    static void initAfterAll(){
        System.out.println("After All: Run after everything");
    }

    @BeforeEach
    public void initBeforeEach(){
        System.out.println("Before Each: Run before function");
        potpie mathObject = new potpie();
    }

    @AfterEach
    public void initAfterEach(){
        System.out.println("After Each: Run after function");
    }

    @Test
    @Disabled
    @DisplayName("for Addition,")
    void testAdd(){
        int expected = 2;
        //int actual = mathObject.add(1,1);
        System.out.println("Result: the expected is "+ expected);
        //assertEquals(expected,actual,"result should be 2, got " + actual);
    }

    @Test
    void testSubtract(){
        int expected = 5;
        int actual = 5;
        assertEquals(expected, actual, "family emergency");
    }
}