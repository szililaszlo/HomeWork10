package com.company;

import java.io.*;
import java.util.ArrayList;

public class SacramentoUtil {
    private ArrayList<Crime> crimes;

    public SacramentoUtil() {
        this.crimes = new ArrayList<>();
    }

    public void readSacramentoCSV() {
        //TODO beolvasni soronként
        // majd hozzáadni ehhez a listához a crime példányt


        try {
            // fájl hely megadás
            BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\László\\Downloads\\SacramentocrimeJanuary2006.txt"));

            // azelső sorok beolvaása string típusba
            String line1 = reader1.readLine();

            // i változó az oszlopcímek elkerüléséhez
            int i = 0;
            // beolvaásá amíg a következő sor nem null, azaz nem ér el a végére
            while (line1 != null) {
                if (i > 0) {

                    String[] array = new String[9];
                    array = line1.split(",");
                    Crime crime = new Crime();
                    crime.setcDateTime(array[0]);
                    crime.setAddress(array[1]);
                    crime.setDistrict(Integer.parseInt(array[2]));
                    crime.setBeat(array[3]);
                    crime.setGrid(Integer.parseInt(array[4]));
                    crime.setCrimeDescr(array[5]);
                    crime.setUcrNcicCode(Integer.parseInt(array[6]));
                    crime.setLatitude(Float.parseFloat(array[7]));
                    crime.setLongtitude(Float.parseFloat(array[8]));

                    crimes.add(crime);
                }
                i++;

                //következő sorok beolvasása
                line1 = reader1.readLine();
            }
            System.out.println(crimes.size());

            // kapcsolatok bezárása
            reader1.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }

    //1
    public static void printCSVFromSacramentoList(ArrayList<Crime> arrayList,String destination) {
        //vessző
        String comma = ",";
        //új sor
        String newLine = "\n";
        // fout változó inicializálása
        FileOutputStream fout = null;
        try {
            // fájl mentési hely megadás és típus megadás
            fout = new FileOutputStream(destination + ".txt");

            //for each ciklussal bejárom az ArrayListet és beleírom az adatokat vesszővel elválasztva
            for (Crime item : arrayList ) {
                fout.write(item.getcDateTime().getBytes());
                fout.write(comma.getBytes());
                fout.write(item.getAddress().getBytes());
                fout.write(comma.getBytes());
                fout.write(String.valueOf(item.getDistrict()).getBytes());
                fout.write(comma.getBytes());
                fout.write(item.getBeat().getBytes());
                fout.write(comma.getBytes());
                fout.write(String.valueOf(item.getGrid()).getBytes());
                fout.write(comma.getBytes());
                fout.write(item.getCrimeDescr().getBytes());
                fout.write(comma.getBytes());
                fout.write(String.valueOf(item.getUcrNcicCode()).getBytes());
                fout.write(comma.getBytes());
                fout.write(String.valueOf(item.getLatitude()).getBytes());
                fout.write(comma.getBytes());
                fout.write(String.valueOf(item.getLongtitude()).getBytes());
                fout.write(newLine.getBytes());
            }

            // catch amely kezeli a hibát ha  a fájl nem található
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            //általános hiba elkapás
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            // if ág azért hogy ne legyen nullPointer hiba
            if (fout != null) {
                try {
                    //file kapcsolat lezárás
                    fout.close();
                } catch (IOException e) {
                    //ha hiba lépne fel lezárás során az itt kezelhető
                    e.printStackTrace();
                }
            }
        }
    }


}