package org.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class J03_TestingExceptions {
/*
   assertThrow() metodu --> belirtilen işlemin (executable) belirtilen türde bir Exception oluşturup oluşturmadığını
   test eder.
       Dolayısıyla 2 parametre alır.
       1. parametre --> expected(beklenen) Exception(istisna) türü,
       2. parametre --> actual(oluşacak)  çalıştırılacak olan işlemdir.
   Eğer işlem belirtilen türde bir exception oluşturursa test başarılı olur.TEST PASSED
   Ama exception oluşmaz ise veya türü yanlış olursa test başarısız olur.TEST FAILED
  TRİCKK : Exception.io türünde parent-child ilişkisi var ise yine test başarılı sayılır.
*/

    @Test
    @DisplayName("NumberFormatException TEST")
    void testException01(){
        String strSayi="1453";
        //assertThrows(Exception.class,()->Integer.parseInt(strSayi));//failed
        String strSayi1="14a3";
        assertThrows(NumberFormatException.class,()->Integer.parseInt(strSayi1));//passed
        //assertThrows(NumberFormatException.class,()->Integer.parseInt("571"));//failed bu tavsiye edilmez cunku dynamic degildir

    }
    @Test
    @DisplayName("NullPointerException TEST")
    void testException02(){
        String str=null;
        String str1="animal";
        assertThrows(NullPointerException.class,()->str.length());//passed

        //assertThrows(NullPointerException.class,()->str1.length());//failed

    }
    @Test
    @DisplayName("IllegalArgumentException TEST")
    void testException03(){
    assertThrows(IllegalArgumentException.class,()->yasYazdir(-2));// passed cunku -2 degeri girdik
    assertThrows(IllegalArgumentException.class,()->yasYazdir(12));// passed cunku -2 degeri girdik  Expected java.lang.IllegalArgumentException to be thrown, but nothing was thrown.
    }

    void yasYazdir(int yas){
        if (yas<0){
            throw new IllegalArgumentException();
        }
        else {
            System.out.println(yas);
        }
    }




}
