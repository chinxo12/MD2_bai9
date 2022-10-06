package bai3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void fizzBuzzTest1() {
        int numberTest=3;
        String expected="Fizz";
        String result=FizzBuzz.fizzBuzz(numberTest);
        assertEquals(expected,result);
    }@Test
    void fizzBuzzTest2() {
        int numberTest=5;
        String expected="Buzz";
        String result=FizzBuzz.fizzBuzz(numberTest);
        assertEquals(expected,result);
    }@Test
    void fizzBuzzTest3() {
        int numberTest=15;
        String expected="FizzBuzz";
        String result=FizzBuzz.fizzBuzz(numberTest);
        assertEquals(expected,result);
    }@Test
    void fizzBuzzTest4() {
        int numberTest=7;
        String expected="7";
        String result=FizzBuzz.fizzBuzz(numberTest);
        assertEquals(expected,result);
    }
    @Test
    void fizzBuzzTest5() {
        int numberTest=13;
        String expected="Fizz";
        String result=FizzBuzz.fizzBuzz(numberTest);
        assertEquals(expected,result);
    }
    @Test
    void fizzBuzzTest6() {
        int numberTest=25;
        String expected="Buzz";
        String result=FizzBuzz.fizzBuzz(numberTest);
        assertEquals(expected,result);
    }


}