package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HesapMakinesiTest {

    @Test
    @DisplayName(" verilen sayilari toplar")//kullanici veya yoneticinin bilgilerindirilmesi icin
    void topla() {                                                       //teste etiket create eder ve console print eder

        assertEquals(3,HesapMakinesi.topla(1,2));//passed
        //assertEquals(5,HesapMakinesi.topla(1,2));//failed
        //bu method ile yazdigimiz methodun calismasi halinde cikacagi sonuc yaziyoruz

    }

    @Test
    @DisplayName("verilen sayilari carpar")
    void carp() {

        assertAll(()->assertEquals(2.6,HesapMakinesi.carp(2,1.3)),
                ()-> assertEquals(2.6,HesapMakinesi.carp(2,1.3)),
                ()-> assertEquals(4.8,HesapMakinesi.carp(2,2.4)),
                ()-> assertEquals(-2.7,HesapMakinesi.carp(-3,0.9)),
                ()-> assertEquals(-18,HesapMakinesi.carp(3,-6))

                ); //tek bir kod blogunda butun test senaryolarimizi test etmis olduk

        //assertEquals(2.6,HesapMakinesi.carp(2,1.3));
        //assertEquals(4.8,HesapMakinesi.carp(2,2.4));
        //assertEquals(-2.7,HesapMakinesi.carp(-3,0.9));
        //assertEquals(-18,HesapMakinesi.carp(3,-6));

    }
}