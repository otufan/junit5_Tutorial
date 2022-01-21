package org.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class C03_ArrayEsitMiTest {


    @ParameterizedTest
    @MethodSource("arraySaglayici")//test icin parametre kaynagi--Buraya method ismi giriliyor. Dikkatli girmek lazim
    void arrKiyas(boolean sonuc, Object[] x, Object[] y) {
    assertEquals(sonuc,C03_ArrayEsitMi.arrKiyas(x,y));
    //arraySaglayici methoddan gelen boolean ve obj[] array parametreleri esit mi methoda gonderip esitligi iddia edilen sorgu

    }
            //return type
    static Stream<Arguments> arraySaglayici(){//Trick: return tek parametre icin dondurulurken Stream<Arguments> komutu ile
                                            //uc parametre return eder
        //arraySaglayici methodu --> Stream classinda Argument parametreleri return eder

        Integer [] a1={1,2,3,4};
        Integer [] a2={2,1,4,3};
        String[] s1={"h", "a","y"};
        String[] s2={"y", "h","a"};
        Double[] d1={1.2, 2.3 , 5.6};
        Double[] d2={2.3, 5.6 , 1.2};
        Float[] f1={1f, 2f, 67f, 35f};
        Float[] f2={13f, 25f, 6f, 5f};

        return Stream.of(Arguments.of(true,a1,a2),Arguments.of(true,s1,s2),Arguments.of(true,d1,d2),Arguments.of(false,f1,f2));

    }

}