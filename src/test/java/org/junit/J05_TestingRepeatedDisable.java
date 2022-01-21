package org.junit;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J05_TestingRepeatedDisable {

    @RepeatedTest(5)////toplam bes kere bu method calisti
    void testToContains(){

        boolean olusan="mustafa".contains("hi");

        boolean beklenen=false;

        assertEquals(olusan,beklenen, "String degeri barindirmaz");

    }
    @RepeatedTest(7)//toplam yedi kere bu method calisti
    void topla(){
        assertEquals(5,(2+3));


    }
}
