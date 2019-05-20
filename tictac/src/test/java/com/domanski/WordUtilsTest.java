package com.domanski;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordUtilsTest {


    @Test
    void givenStringIsEmptyThenReturnPower0(){
        String testString="";
        assertEquals(0,WordUtils.stringPower(testString));
    }

    @Test
    void givenStringIsNullThenReturnPower0(){
        String testString="";
        assertEquals(0,WordUtils.stringPower(null));
    }

    @Test
    void givenStringIsNotEmptyThenReturnPower(){
        String testString="abc";
        assertEquals(6,WordUtils.stringPower(testString));
    }

    @Test
    void givenStringUpperCaseIsNotEmptyThenReturnPower(){
        String testString="ABC";
        assertEquals(6,WordUtils.stringPower(testString));
    }

}