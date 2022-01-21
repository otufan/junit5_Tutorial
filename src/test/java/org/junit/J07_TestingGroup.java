package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class J07_TestingGroup {

    //Task: 0 icermeyen int degerler icin multiplyExact() methodunu test ediniz
    //Task: 0 iceren int degerler icin multiplyExact() methodunu test ediniz

    @ParameterizedTest
    @DisplayName("Parametreli Grup Disi Carpim Testi")
    @CsvSource(value = {"12,3,4", "-16,8,-2", "0,0,-5", "35,5,7"})
    void sifirIcerenCarpim(int sonuc, int x, int y) {

        assertEquals(sonuc, Math.multiplyExact(x, y));//Passed

    }

    @Nested//parent test gibi kapsamindaki class indaki tum testleri ayni anda run eder
    //@Nested --> parent i oldugu class level de calisir
    @DisplayName("Grup test run edilir")
    class sifirIcerenTest {

        @ParameterizedTest
        @DisplayName("Parametreli Carpim Testi")
        @CsvSource(value = {"0,0,4", "0,8,0", "0,0,-5", "0,0,0"})
        void sifirIcerenCarpim(int sonuc, int x, int y) {

            assertEquals(sonuc, Math.multiplyExact(x, y));//Passed

        }

        @ParameterizedTest
        @DisplayName("Parametreli Toplam Testi")
        @CsvSource(value = {"4,0,4", "8,8,0", "-5,0,-5", "0,0,0"})
        void sifirIcerenToplam(int sonuc, int x, int y) {

            assertEquals(sonuc, Math.addExact(x, y));//Passed

        }

        @ParameterizedTest
        @DisplayName("Parametreli Bolme Testi")
        @CsvSource(value = {"0,0,4", "0,8,0", "0,0,-5", "0,0,0"})
        void sifirIcerenBolme(int sonuc, int x, int y) {
            if (y == 0) {
                assertThrows(ArithmeticException.class, () -> bol(x, y));
            } else {
                assertEquals(sonuc, (x / y));
            }


        }

        int bol(int a, int b) {
            return a / b;
        }
    }
}
