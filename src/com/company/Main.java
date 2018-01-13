package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //1

        //Crime típusú arrayList a teszteléshez
        ArrayList<Crime> crimes = new ArrayList<>();

        //Crími példány létrehozása és setterek segítségével értékadás
        Crime crime = new Crime();
        crime.setAddress("Pécs");
        crime.setcDateTime("2017");
        crime.setDistrict(1);
        crime.setBeat("aaa");
        crime.setGrid(42144);
        crime.setCrimeDescr("asdsa");
        crime.setUcrNcicCode(222222);
        crime.setLatitude(222.2F);
        crime.setLongtitude(22224.2F);

        //hozzáadás az arryaListhez
        crimes.add(crime);

        //metódus hívás
        SacramentoUtil.printCSVFromSacramentoList(crimes,"C:\\Users\\László\\Downloads\\csv");

        //2

        //új példa adat
        Crime crime1 = new Crime();
        crime1.setAddress("Pécs");
        crime1.setcDateTime("2017");
        crime1.setDistrict(2);
        crime1.setBeat("aaa");
        crime1.setGrid(4214);
        crime1.setCrimeDescr("asdsa");
        crime1.setUcrNcicCode(222222);
        crime1.setLatitude(222.2F);
        crime1.setLongtitude(22224.2F);

        //hozzáadás az arryaListhez
        crimes.add(crime1);

        Crime crime2 = new Crime();
        crime2.setAddress("Pécs");
        crime2.setcDateTime("2017");
        crime2.setDistrict(2);
        crime2.setBeat("aaa");
        crime2.setGrid(414);
        crime2.setCrimeDescr("asdsa");
        crime2.setUcrNcicCode(222222);
        crime2.setLatitude(222.2F);
        crime2.setLongtitude(22224.2F);

        //hozzáadás az arryaListhez
        crimes.add(crime2);

        //függvényhívás
        SacramentoUtil.findBiggestGridByDistricts(crimes);
    }
}
