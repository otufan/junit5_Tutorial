package org.junit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class J05_TestingRepeatedDisable {

    @BeforeEach
    void beforeMethod(){
        System.out.println("BEFORE calisti");
        System.out.println("*****************");
    }
    @AfterEach
    void afterMethod(){
        System.out.println("*****************");
        System.out.println("AFTER calisti");
        System.out.println("*****************");
    }

    @RepeatedTest(5)////toplam bes kere bu method calisti
    @DisplayName("contains methodu 5 kere calisacak")
    void testToContains(){

        boolean olusan="mustafa".contains("hi");

        boolean beklenen=false;

        assertEquals(olusan,beklenen, "String degeri barindirmaz");
        System.out.println("Contains methodu calisti");
    }
    @RepeatedTest(7)//toplam yedi kere bu method calisti
    @DisplayName("topla methodu 7 kere calisacak")
    void topla(){
        assertEquals(5,(2+3));
        System.out.println("Topla methodu calisti");
    }
    @Disabled
    @Test
    void karpuzTesti(){

       String str="karput Testi acaba calisti mi?";
        assertEquals(str.length(),21);
    }


}
