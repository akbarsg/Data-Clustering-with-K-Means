/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengpol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Akbar
 */
public class Pengpol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String csvFile = "C:/Users/Akbar/Downloads/AirQualityUCIedit.csv";
        String line = "";
        String cvsSplitBy = ",";

        String[][] data = new String[10000][15];

        int cluster = 2;  //kluster
        double[][] centroid = new double[cluster][13];

        centroid[0][0] = 1;
        centroid[0][1] = 1000;
        centroid[0][2] = 10;
        centroid[0][3] = 2;
        centroid[0][4] = 600;
        centroid[0][5] = 100;
        centroid[0][6] = 600;
        centroid[0][7] = 30;
        centroid[0][8] = 1300;
        centroid[0][9] = 600;
        centroid[0][10] = 4;
        centroid[0][11] = 20;
        centroid[0][12] = 0.8;

        centroid[1][0] = 2;
        centroid[1][1] = 1200;
        centroid[1][2] = 100;
        centroid[1][3] = 10;
        centroid[1][4] = 1100;
        centroid[1][5] = 200;
        centroid[1][6] = 1100;
        centroid[1][7] = 80;
        centroid[1][8] = 1900;
        centroid[1][9] = 900;
        centroid[1][10] = 20;
        centroid[1][11] = 40;
        centroid[1][12] = 1.4;

        double hasilCentroid[][] = new double[2][1000];

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int i = 0;
            int baris = 0;
            while ((line = br.readLine()) != null && i < 9357) {

                String[] tempBaris = line.split(cvsSplitBy);

                boolean skip = false;
                for (int j = 0; j < 15; j++) {
                    if ("-200".equals(tempBaris[j])) {
                        skip = true;
                        break;
                    }
                }

                if (skip == false) {
                    System.out.print("Data " + baris + ": ");
                    for (int j = 0; j < 15; j++) {

                        System.out.print(tempBaris[j] + ", ");

                        data[baris][j] = tempBaris[j];

                    }

                    for (int j = 0; j < cluster; j++) { //j= kluster
                        for (int k = 2; k < 15; k++) {
                            double selisihCentroid[] = new double[13];
//                            selisihCentroid[k - 2] = ((Double.parseDouble(data[baris][k])) - (centroid[0][k - 2]));
                            
                            
//                            hasilCentroid[j][k] = Math.sqrt();
                        }

                    }

                    baris++;
                    System.out.println();
                }

                i++;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
