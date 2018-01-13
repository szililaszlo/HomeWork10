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
        crime.setDistrict(1500);
        crime.setBeat("aaa");
        crime.setGrid(4214);
        crime.setCrimeDescr("asdsa");
        crime.setUcrNcicCode(222222);
        crime.setLatitude(222.2F);
        crime.setLongtitude(22224.2F);

        //hozzáadás az arryaListhez
        crimes.add(crime);

        //metódus hívás
        SacramentoUtil.printCSVFromSacramentoList(crimes,"C:\\Users\\László\\Downloads\\csv");
    }
}
