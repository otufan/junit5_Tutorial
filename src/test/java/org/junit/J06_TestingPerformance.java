package org.junit;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class J06_TestingPerformance {

    @Test
    void performance(){
        //assertTimeout(Duration.ofSeconds(1),()-> IntStream.rangeClosed(0,100000).forEach(System.out::println));//burada forEach teste tabi
        //assertTimeout(Duration.ofSeconds(1),()-> IntStream.rangeClosed(0,100000)).forEach(System.out::println);//Burada forEach teste tabi degil paranteze dikkat
        assertTimeout(Duration.ofSeconds(1),()-> IntStream.rangeClosed(0,100000)).forEach(System.out::print);
    }



}
