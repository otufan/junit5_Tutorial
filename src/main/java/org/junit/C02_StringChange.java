package org.junit;

public class C02_StringChange {



        //Verilen bir String teki ilk iki harf icindeki A var ise bunlari silen bir method create ediniz
        //Eger AACD--> CD  ABC-->BC  AA--> "" A-->""   B-->B

    public String ilkIkiSil(String str){

        if(str.length()<=2){
            return str.replaceAll("A", "");

        }
        String ilkIki=str.substring(0,2);
        String ikiSonra=str.substring(2);
        return ilkIki.replaceAll("A","")+ikiSonra;

    }


}
