package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SampleTest {

    @BeforeEach
    public void beforeeach(){
        System.out.println("beforeEach this run");
    }

    @Test
    public void One(){
        System.out.println("hello world ");
        }

    @Test
    public void Two(){
        System.out.println("hello orld ");
        }
    }
